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
public class Ciudad {
    private int id;
    private String nombre;
    private int regionId;

    public Ciudad() {
    }

    public Ciudad(int id, String nombre, int regionId) {
        this.id = id;
        this.nombre = nombre;
        this.regionId = regionId;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", nombre=" + nombre + ", regionId=" + regionId + '}';
    }
    
    
}
