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
public class Categoria {
    private int id;
    private String tipo;

    public Categoria() {
    }

    public Categoria(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws Exception {
        if (tipo.trim().length()>0) {
            this.tipo = tipo;
            
        }else {
            throw new Exception("Debe ingresar un tipo");
        }
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", tipo=" + tipo + '}';
    }
    
    
}
