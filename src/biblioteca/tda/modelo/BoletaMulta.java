/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo BoletaMulta
 * @author leone
 */
public class BoletaMulta {
    private int id ;
    private String fecha;
    private int multaId;
    private int clienteId;

    /**
     * Constructor sin parámetros
     */
    public BoletaMulta() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param fecha
     * @param multaId
     * @param clienteId 
     */
    public BoletaMulta(int id, String fecha, int multaId, int clienteId) {
        this.id = id;
        this.fecha = fecha;
        this.multaId = multaId;
        this.clienteId = clienteId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMultaId() {
        return multaId;
    }

    public void setMultaId(int multaId) {
        this.multaId = multaId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "BoletaMulta{" + "id=" + id + ", fecha=" + fecha + ", multaId=" + multaId + ", clienteId=" + clienteId + '}';
    }
    
}
