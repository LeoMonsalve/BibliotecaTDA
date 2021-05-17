/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Libro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author henrry
 */
public class LibroDAO extends Conexion {

    public LibroDAO() {
        super();
    }

    public int ultimoId() throws SQLException {
        super.conectar();
        int ultimoId = 0;
        ResultSet result = state.executeQuery("SELECT id FROM libro order by id desc limit 1;");

        while (result.next()) {
            ultimoId = (int) result.getObject(1);
        }
        return ultimoId;
    }

    public void insertar(Libro libro) {
        try {
            super.conectar();
            int ultimoId = ultimoId();
            ultimoId++;
            super.state.executeUpdate("INSERT INTO libro VALUES (" + ultimoId
                    + ", '" + libro.getNumeroSerie() + "', '" + libro.getTitulo()
                    + "', " + libro.getNumeroPaginas() + ", " + libro.getPrecioReferencia()
                    + ", '" + libro.getAnoLanzamiento() + "', '" + libro.getPublicacion()
                    + "', " + libro.getCategoria() + ", " + libro.getEstado()
                    + ", " + libro.getIdioma() + ", " + libro.getEditorial()
                    + ", " + libro.getAutor() + ");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Libro buscar(int id) throws SQLException, Exception {
        super.conectar();
        Libro libro = new Libro();
        Date fechaAnoLanzamiento = new Date();
        Date fechaPublicacion = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); // variable para castear sql Date a String
        String anoLanzamiento = "";
        String publicacion = "";
        ResultSet result = state.executeQuery(
                "SELECT * FROM libro WHERE id ='" + id + "'  ;");

        while (result.next()) {
            libro.setId((int) result.getObject(1));
            libro.setNumeroSerie((String) result.getObject(2));
            libro.setTitulo((String) result.getObject(3));
            libro.setNumeroPaginas((int) result.getObject(4));
            libro.setPrecioReferencia((int) result.getObject(5));
            // Recibimos el Date para luego parsearlo
            fechaAnoLanzamiento = (Date) result.getObject(6);
            // Parseamos sql Date a String
            anoLanzamiento = df.format(fechaAnoLanzamiento);
            libro.setAnoLanzamiento(anoLanzamiento);
            // Recibimos la variable Date para luego parsearlo
            fechaPublicacion = (Date) result.getObject(7);
            // Parseamos sql Date a String
            publicacion = df.format(fechaPublicacion);
            libro.setCategoria((int) result.getObject(8));
            libro.setEstado((int) result.getObject(9));
            libro.setIdioma((int) result.getObject(10));
            libro.setEditorial((int) result.getObject(11));
            libro.setAutor((int) result.getObject(12));
        }
        return libro;
    }

    public ArrayList<Libro> listarLibros() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM libro");

        ArrayList<Libro> libros = new ArrayList<Libro>();
        Date fechaAnoLanzamiento = new Date();
        Date fechaPublicacion = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); // variable para castear sql Date a String
        String anoLanzamiento = "";
        String publicacion = "";

        while (result.next()) {
            Libro libro = new Libro();
            libro.setId((int) result.getObject(1));
            libro.setNumeroSerie((String) result.getObject(2));
            libro.setTitulo((String) result.getObject(3));
            libro.setNumeroPaginas((int) result.getObject(4));
            libro.setPrecioReferencia((int) result.getObject(5));
            // Recibimos el Date para luego parsearlo
            fechaAnoLanzamiento = (Date) result.getObject(6);
            // Parseamos sql Date a String
            anoLanzamiento = df.format(fechaAnoLanzamiento);
            libro.setAnoLanzamiento(anoLanzamiento);
            // Recibimos la variable Date para luego parsearlo
            fechaPublicacion = (Date) result.getObject(7);
            // Parseamos sql Date a String
            publicacion = df.format(fechaPublicacion);
            libro.setCategoria((int) result.getObject(8));
            libro.setEstado((int) result.getObject(9));
            libro.setIdioma((int) result.getObject(10));
            libro.setEditorial((int) result.getObject(11));
            libro.setAutor((int) result.getObject(12));
            libros.add(libro);
        }
        return libros;
    }

    public void modificar(Libro libro) {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE libro set numero_serie='" + libro.getNumeroSerie() + "', titulo='" + libro.getTitulo()
                    + "', numero_paginas=" + libro.getNumeroPaginas() + ",precio_referencia= " + libro.getPrecioReferencia()
                    + ", ano_lanzamiento='" + libro.getAnoLanzamiento() + "', publicacion='" + libro.getPublicacion()
                    + "',categoria_id=" + libro.getCategoria() + ",estado_id=" + libro.getEstado()
                    + ",idioma_id=" + libro.getIdioma() + ",editorial_id=" + libro.getEditorial()
                    + ",autor_id=" + libro.getAutor() + " where id=" + libro.getId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM libro WHERE id="+ id +";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
