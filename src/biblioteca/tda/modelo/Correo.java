/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Correo
 * @author leone
 */
public class Correo {
    private int id;
    private String correo;
    private  int listaCorreo;

    /**
     * Constructor sin parámetros
     */
    public Correo() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param correo
     * @param listaCorreo
     */
    public Correo(int id, String correo, int listaCorreo) {
        this.id = id;
        this.correo = correo;
        this.listaCorreo = listaCorreo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getListaCorreo() {
        return listaCorreo;
    }

    public void setListaCorreo(int listaCorreo) {
        this.listaCorreo = listaCorreo;
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Correo{" + "id=" + id + ", correo=" + correo + ", listaCorreo=" + listaCorreo + '}';
    }
    
    
    
}
