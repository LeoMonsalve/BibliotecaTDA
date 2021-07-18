/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Region
 * @author leone
 */
public class Region {
    private int id;
    private String nombre;

    /**
     * Constructor con parámetros
     * @param id
     * @param nombre
     */
    public Region(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Constructor sin parámetros
     */
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

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Region{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
