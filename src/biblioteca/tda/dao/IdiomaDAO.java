/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Autor;
import biblioteca.tda.modelo.Idioma;
import biblioteca.tda.modelo.Libro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author henrry
 */
public class IdiomaDAO extends Conexion {

    public IdiomaDAO() {
        super();
    }

    public void insertar(Idioma idioma) {
        try {
            super.conectar();
            int id = super.ultimoId("idioma") + 1;
            super.state.executeUpdate("INSERT INTO idioma VALUES (" + id
                    + ", '" + idioma.getIdioma()+ "');");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Idioma buscar(int id) throws SQLException, Exception {
        super.conectar();
        Idioma idioma = new Idioma();
        ResultSet result = state.executeQuery("SELECT * FROM idioma WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            idioma.setId((int) result.getObject(1));
            idioma.setIdioma((String) result.getObject(2));
        }
        return idioma;
    }
    
    public ArrayList<Idioma> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM idioma");
        
        ArrayList<Idioma> idiomas = new ArrayList<Idioma>();
        
        while(result.next()) {
            Idioma idioma = new Idioma();
            idioma.setId((int) result.getObject(1));
            idioma.setIdioma((String) result.getObject(2));
            idiomas.add(idioma);
        }
        return idiomas;
    }
    
    public void modificar(Idioma idioma) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE idioma set idioma='" + idioma.getIdioma() + 
                    "' WHERE id =" + idioma.getId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM idioma WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
