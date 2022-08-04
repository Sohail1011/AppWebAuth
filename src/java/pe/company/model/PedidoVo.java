package pe.company.model;

import java.util.Date;

public class PedidoVo {

    private Integer id_pedido;
    private Date fecha_pedido;
    private String cliente;
    private String vendedor;
    private String producto;
    private Integer cantidad;
    private Double importe;

    public PedidoVo() {
    }

    public PedidoVo(Integer id_pedido, Date fecha_pedido, String cliente, String vendedor, String producto, Integer cantidad, Double importe) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
}
