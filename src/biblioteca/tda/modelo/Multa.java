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
public class Multa {
    private int id;
    private int costo;

    public Multa() {
    }

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

    @Override
    public String toString() {
        return "Multa{" + "id=" + id + ", costo=" + costo + '}';
    }
    
    
}
