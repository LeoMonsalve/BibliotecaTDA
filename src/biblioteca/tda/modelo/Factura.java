/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 *
 * @author henrry
 */
public class Factura {
    private int id;
    private String folio;
    private int precio;
    private float precioIva;
    private float costoIva;
    private String fechaCompra;
    private int distribuidorId;
    private int metodoPagoId;

    public Factura() {
    }

    public Factura(int id, String folio, int precio, float precioIva, float costoIva, String fechaCompra, int distribuidorId, int metodoPagoId) {
        this.id = id;
        this.folio = folio;
        this.precio = precio;
        this.precioIva = precioIva;
        this.costoIva = costoIva;
        this.fechaCompra = fechaCompra;
        this.distribuidorId = distribuidorId;
        this.metodoPagoId = metodoPagoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getPrecioIva() {
        return precioIva;
    }

    public void setPrecioIva(float precioIva) {
        this.precioIva = precioIva;
    }

    public float getCostoIva() {
        return costoIva;
    }

    public void setCostoIva(float costoIva) {
        this.costoIva = costoIva;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getDistribuidorId() {
        return distribuidorId;
    }

    public void setDistribuidorId(int distribuidorId) {
        this.distribuidorId = distribuidorId;
    }

    public int getMetodoPagoId() {
        return metodoPagoId;
    }

    public void setMetodoPagoId(int metodoPagoId) {
        this.metodoPagoId = metodoPagoId;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", folio=" + folio + ", precio=" + precio + ", precioIva=" + precioIva + ", costoIva=" + costoIva + ", fechaCompra=" + fechaCompra + ", distribuidorId=" + distribuidorId + ", metodoPagoId=" + metodoPagoId + '}';
    }

   
    
    
}
