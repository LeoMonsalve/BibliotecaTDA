/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Venta
 * @author leone
 */
public class Venta {
    private int id;
    private int clienteId;
    private int trabajadorId;
    private int boletaId;

    /**
     * Constructor sin parámetros
     */
    public Venta() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param clienteId
     * @param trabajadorId
     * @param boletaId
     */
    public Venta(int id, int clienteId, int trabajadorId, int boletaId) {
        this.id = id;
        this.clienteId = clienteId;
        this.trabajadorId = trabajadorId;
        this.boletaId = boletaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getTrabajadorId() {
        return trabajadorId;
    }

    public void setTrabajadorId(int trabajadorId) {
        this.trabajadorId = trabajadorId;
    }

    public int getBoletaId() {
        return boletaId;
    }

    public void setBoletaId(int boletaId) {
        this.boletaId = boletaId;
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", clienteId=" + clienteId + ", trabajadorId=" + trabajadorId + ", boletaId=" + boletaId + '}';
    }
    
}
