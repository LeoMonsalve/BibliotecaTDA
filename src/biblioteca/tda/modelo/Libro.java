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
public class Libro {
    private int id;
    private String numeroSerie;
    private String titulo;
    private int numeroPaginas;
    private int precioReferencia;
    private String anoLanzamiento;
    private String publicacion;
    private int categoria;
    private int estado;
    private int idioma;
    private int editorial;
    private int autor;


    public Libro() {
    }

    public Libro(int id, String numeroSerie, String titulo, int numeroPaginas, int precioReferencia, String anoLanzamiento, String publicacion, int categoria, int estado, int idioma, int editorial, int autor) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precioReferencia = precioReferencia;
        this.anoLanzamiento = anoLanzamiento;
        this.publicacion = publicacion;
        this.categoria = categoria;
        this.estado = estado;
        this.idioma = idioma;
        this.editorial = editorial;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPrecioReferencia() {
        return precioReferencia;
    }

    public void setPrecioReferencia(int precioReferencia) {
        this.precioReferencia = precioReferencia;
    }

    public String getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(String anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdioma() {
        return idioma;
    }

    public void setIdioma(int idioma) {
        this.idioma = idioma;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    
    
    
}