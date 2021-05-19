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
public class Arriendo {
    private int id;
    private int costoTotal;
    private String fechaDevolucion;
    private String fechaReal;
    private int diasRetraso;
    private int costoArriendo;
    private String fechaArriendo;
    private int clienteId;
    private int trabajadoresId;

    public Arriendo() {
    }

    public Arriendo(int id, int costoTotal, String fechaDevolucion, String fechaReal, int diasRetraso, int costoArriendo, String fechaArriendo, int clienteId, int trabajadoresId) {
        this.id = id;
        this.costoTotal = costoTotal;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaReal = fechaReal;
        this.diasRetraso = diasRetraso;
        this.costoArriendo = costoArriendo;
        this.fechaArriendo = fechaArriendo;
        this.clienteId = clienteId;
        this.trabajadoresId = trabajadoresId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getFechaReal() {
        return fechaReal;
    }

    public void setFechaReal(String fechaReal) {
        this.fechaReal = fechaReal;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public int getCostoArriendo() {
        return costoArriendo;
    }

    public void setCostoArriendo(int costoArriendo) {
        this.costoArriendo = costoArriendo;
    }

    public String getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(String fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getTrabajadoresId() {
        return trabajadoresId;
    }

    public void setTrabajadoresId(int trabajadoresId) {
        this.trabajadoresId = trabajadoresId;
    }

    @Override
    public String toString() {
        return "Arriendo{" + "id=" + id + ", costoTotal=" + costoTotal + ", fechaDevolucion=" + fechaDevolucion + ", fechaReal=" + fechaReal + ", diasRetraso=" + diasRetraso + ", costoArriendo=" + costoArriendo + ", fechaArriendo=" + fechaArriendo + ", clienteId=" + clienteId + ", trabajadoresId=" + trabajadoresId + '}';
    }
    
    
}
