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
public class Region {
    private int id;
    private String nombre;

    public Region(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Region() {
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
            throw new Exception("Debe ingresar una region");
        }
    }

    @Override
    public String toString() {
        return "Region{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
