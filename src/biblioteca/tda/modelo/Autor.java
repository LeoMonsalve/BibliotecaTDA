/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Autor
 * @author henrry
 */
public class Autor {
    private int id;
    private String nombre;
    private String apellido;

    /**
     * Construtor vacio
     */
    public Autor() {
    }
    
    /**
     * Constructor con parámetros
     * @param id
     * @param nombre
     * @param apellido 
     */

    public Autor(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (apellido.trim().length()>0) {
             this.apellido = apellido;
        }else{
            throw new Exception("Debe ingresar un apellido");
        }
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
