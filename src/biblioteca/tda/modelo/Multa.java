/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Multa
 * @author henrry
 */
public class Multa {
    private int id;
    private int costo;

    /**
     * Constructor sin parámetros
     */
    public Multa() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param costo
     */
    public Multa(int id, int costo) {
        this.id = id;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Multa{" + "id=" + id + ", costo=" + costo + '}';
    }
    
    
}
