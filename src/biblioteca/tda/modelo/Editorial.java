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
public class Editorial {
    private int id;
    private String nombre;

    public Editorial(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Editorial(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().length()>0) {
             this.nombre = nombre;
        }else{
            throw new Exception("Debe ingresar un nombre");
        }
    }

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
