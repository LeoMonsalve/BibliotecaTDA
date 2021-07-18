/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Estado
 * @author henrry
 */
public class Estado {
    private int id;
    private String descripcion;

    /**
     * Constructor sin parámetros
     */
    public Estado() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param descripcion
     */
    public Estado(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws Exception {
        if (descripcion.trim().length()>0) {
            this.descripcion = descripcion;
        }else{
            throw new Exception("Debe ingresar una descripcion");
        }
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
    
}
