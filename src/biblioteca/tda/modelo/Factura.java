/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Factura
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

    /**
     * Constructor sin parámetros
     */
    public Factura() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param folio
     * @param precio
     * @param precioIva
     * @param costoIva
     * @param fechaCompra
     * @param distribuidorId
     * @param metodoPagoId
     */
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

    public void setFolio(String folio) throws Exception {
        if (folio.trim().length()>0) {
             this.folio = folio;
        }else{
            throw new Exception("Debe ingresar un folio");
        }
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

    public void setFechaCompra(String fechaCompra) throws Exception {
        if (fechaCompra.trim().length()>0) {
                 this.fechaCompra = fechaCompra;
         }else{
            throw new Exception("Debe ingresar una fecha de compra");
        }
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

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", folio=" + folio + ", precio=" + precio + ", precioIva=" + precioIva + ", costoIva=" + costoIva + ", fechaCompra=" + fechaCompra + ", distribuidorId=" + distribuidorId + ", metodoPagoId=" + metodoPagoId + '}';
    }

   
    
    
}
