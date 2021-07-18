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
public class Idioma {
    private int id;
    private String idioma;

    /**
     * Constructor sin parámetros
     */
    public Idioma() {
    }
    

    /**
     * Constructor con parámetros
     * @param id
     * @param idioma
     */
    public Idioma(int id, String idioma) {
        this.id = id;
        this.idioma = idioma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) throws Exception {
        if (idioma.trim().length()>0) {
            this.idioma = idioma;
            
        }else{
            throw new Exception("Debe ingresar un idioma");
        }
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Idioma{" + "id=" + id + ", idioma=" + idioma + '}';
    }
    
    
}
