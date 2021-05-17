/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.tda.dao.AutorDAO;
import biblioteca.tda.dao.Conexion;
import biblioteca.tda.dao.LibroDAO;
import biblioteca.tda.modelo.Autor;
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
        
        
        Autor autor = new Autor(1, "Juanita", "Alimaña");
        AutorDAO autorDAO = new AutorDAO();

  
        Conexion con = new Conexion();
        if (con != null) {
            System.out.println("CONECTADO");
        }
        
        
        autorDAO.insertar(autor);
    }
    
}
