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

    public Idioma() {
    }
    

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

    @Override
    public String toString() {
        return "Idioma{" + "id=" + id + ", idioma=" + idioma + '}';
    }
    
    
}
