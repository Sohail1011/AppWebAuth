package pe.company.ws;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import pe.company.dao.PedidoDao;
import pe.company.model.PedidoVo;

@WebService(serviceName = "PedidoWSAuth")
public class PedidoWSAuth {

    @Resource
    private WebServiceContext webServiceContext;

    //instancia al Dao
    private PedidoDao pedidoDao = new PedidoDao();
    private String username = "";
    private String password = "";

    @WebMethod(operationName = "buscar")
    public PedidoVo buscar(@WebParam(name = "id_pedido") Integer id_pedido) {
        PedidoVo pedido = new PedidoVo();

        //contexto para extraer mensaje de cabecera
        MessageContext messageContext = webServiceContext.getMessageContext();
        Map requestHeader = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);

        List usernameList = (List) requestHeader.get("USERNAME");
        List passwordList = (List) requestHeader.get("PASSWORD");

        if ((usernameList != null) && (passwordList != null)) {
            username = (String) usernameList.get(0);
            password = (String) passwordList.get(0);
        }

        //verificando credenciales
        if ((username.equals("admin")) && (password.equals("d123"))) {
            pedido = pedidoDao.findById(id_pedido);
        } else {
            pedido.setFecha_pedido(null);
            pedido.setCliente("Sin acceso");
            pedido.setVendedor("Sin acceso");
            pedido.setProducto("Sin acceso");
            pedido.setCantidad(0);
            pedido.setImporte(0.00);
        }

        return pedido;
    }
}
