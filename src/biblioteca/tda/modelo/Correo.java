/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 *
 * @author leone
 */
public class Correo {
    private int id;
    private String correo;
    private  int listaCorreo;

    public Correo() {
    }

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

    @Override
    public String toString() {
        return "Correo{" + "id=" + id + ", correo=" + correo + ", listaCorreo=" + listaCorreo + '}';
    }
    
    
    
}
