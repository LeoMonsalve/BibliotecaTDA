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
public class Direccion {
    private int id;
    private String calle;
    private int numero;
    private int comunaId;
    private int listaDirecciones;

    public Direccion() {
    }

    public Direccion(int id, String calle, int numero, int comunaId, int listaDirecciones) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.comunaId = comunaId;
        this.listaDirecciones = listaDirecciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getComunaId() {
        return comunaId;
    }

    public void setComunaId(int comunaId) {
        this.comunaId = comunaId;
    }

    public int getListaDirecciones() {
        return listaDirecciones;
    }

    public void setListaDirecciones(int listaDirecciones) {
        this.listaDirecciones = listaDirecciones;
    }

    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", calle=" + calle + ", numero=" + numero + ", comunaId=" + comunaId + ", listaDirecciones=" + listaDirecciones + '}';
    }

    
    
    
}
