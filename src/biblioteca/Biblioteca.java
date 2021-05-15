/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.tda.dao.LibroDAO;
import biblioteca.tda.modelo.Libro;
import java.sql.SQLException;

/**
 *
 * @author leone
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Libro libro = new Libro(1, "4454das", "50 sombras de Leonel", 300, 50000, "2010-10-02", "2015-10-02", 1, 1, 1, 1, 1);
        LibroDAO dao = new LibroDAO();
        
        int ultimo = dao.ultimoId();
        System.out.println("Ultimo: " + ultimo);
    }
    
}
