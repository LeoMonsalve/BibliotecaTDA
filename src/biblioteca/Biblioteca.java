/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.tda.dao.Conexion;
import biblioteca.tda.dao.LibroDAO;
import biblioteca.tda.modelo.Libro;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leone
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {
        // TODO code application logic here
        
        LibroDAO dao = new LibroDAO();
        int ultimo = dao.ultimoId();
        System.out.println("Ultimo: " + ultimo);

  
        Conexion con = new Conexion();
        if (con != null) {
            System.out.println("CONECTADO");
        }
        
        
        
        Libro libro = new Libro(1, "JAJAJA", "Probando Modificar", 50, 15000, "2004-11-02", "2004-11-09", 1, 1, 1, 1, 1);
        
        dao.modificar(libro);
        
        dao.eliminar(2);
        ArrayList<Libro> libros = dao.listarLibros();
        for(Libro a: libros) {
            System.out.println(a.toString());
        }
        
    }
    
}
