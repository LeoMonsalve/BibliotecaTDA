/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Autor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author henrry
 */
public class AutorDAO extends Conexion {

    public AutorDAO() {
        super();
    }

    public void insertar(Autor autor) {
        try {
            super.conectar();
            int id = super.ultimoId("autor") + 1;
            super.state.executeUpdate("INSERT INTO autor VALUES (" + id
                    + ", '" + autor.getNombre() + "', '" + autor.getApellido() + "');");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } 

    public Autor buscar(int id) throws SQLException, Exception {
        super.conectar();
        Autor autor = new Autor();
        ResultSet result = state.executeQuery("SELECT * FROM autor WHERE id = '" + id + "' ;");

        while (result.next()) {
            autor.setId((int) result.getObject(1));
            autor.setNombre((String) result.getObject(2));
            autor.setApellido((String) result.getObject(3));
        }
        return autor;
    }
    
    public ArrayList<Autor> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM autor");
        
        ArrayList<Autor> autores = new ArrayList<Autor>();
        
        while(result.next()) {
            Autor autor = new Autor();
            autor.setId((int) result.getObject(1));
            autor.setNombre((String) result.getObject(2));
            autor.setApellido((String) result.getObject(3));
            autores.add(autor);
        }
        return autores;
    }
    
    public void modificar(Autor autor) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE autor set nombre='" + autor.getNombre()
                    + "', apellido='" + autor.getApellido()+ "' where id=" + autor.getId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM autor WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
    
}
