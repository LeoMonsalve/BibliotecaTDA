/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Ciudad
 * @author leone
 */
public class Ciudad {

    private int id;
    private String nombre;
    private int regionId;

    /**
     * Constructor sin parámetros
     */
    public Ciudad() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param nombre
     * @param regionId 
     */
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

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().length()>0) {
             this.nombre = nombre;
        }else{
            throw new Exception("Debe ingresar un nombre de ciudad");
        }
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", nombre=" + nombre + ", regionId=" + regionId + '}';
    }
    
    
}
