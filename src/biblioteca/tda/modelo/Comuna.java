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
public class Comuna {
     private int id;
     private String nombre;
     private int ciudadId;
     
     public Comuna(){
     }
     
     public Comuna(int id, String nombre, int cuidadId){
         this.ciudadId= cuidadId;
         this.id=id;
         this.nombre=nombre;
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
            throw new Exception("Debe ingresar una comuna");
        }
    }

    public int getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(int ciudadId) {
        this.ciudadId = ciudadId;
    }

    @Override
    public String toString() {
        return "Comuna{" + "id=" + id + ", nombre=" + nombre + ", ciudadId=" + ciudadId + '}';
    }
     
}
