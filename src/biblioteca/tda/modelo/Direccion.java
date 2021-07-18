/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Direccion
 * @author henrry
 */
public class Direccion {
    private int id;
    private String calle;
    private String numero;
    private int comunaId;
    private int listaDirecciones;

    /**
     * Constructor sin parámetros
     */
    public Direccion() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param calle
     * @param numero
     * @param comunaId
     * @param listaDirecciones
     */
    public Direccion(int id, String calle, String numero, int comunaId, int listaDirecciones) {
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

    public void setCalle(String calle) throws Exception {
        if (calle.trim().length()>0) {
             this.calle = calle;
        }else{
            throw new Exception("Debe ingresar una calle");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", calle=" + calle + ", numero=" + numero + ", comunaId=" + comunaId + ", listaDirecciones=" + listaDirecciones + '}';
    }
}