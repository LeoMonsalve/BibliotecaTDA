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


    /**
     * Constructor sin parámetros
     */
    public Libro() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param numeroSerie
     * @param titulo
     * @param numeroPaginas
     * @param precioReferencia
     * @param anoLanzamiento
     * @param publicacion
     * @param categoria
     * @param estado
     * @param idioma
     * @param editorial
     * @param autor
     */
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

    public void setNumeroSerie(String numeroSerie) throws Exception {
        if (numeroSerie.trim().length()>0) {
             this.numeroSerie = numeroSerie;
        }else{
            throw new Exception("Debe ingresar un numero de serie");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception{
        if(titulo.trim().length()>0){
        this.titulo = titulo;
        }else{
            throw new Exception("Debe ingresar un titulo");
        }
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

    public void setAnoLanzamiento(String anoLanzamiento)throws Exception {
        if(anoLanzamiento.trim().length()>0){
            this.anoLanzamiento=anoLanzamiento;
        }else {
            throw new Exception("Debe ingresar un año de lanzamiento");
                    
        }
        
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) throws Exception {
        if(publicacion.trim().length()>0){
            this.publicacion=publicacion;
        }else{
            throw new Exception("Debe ingresar una publicacion");
        }
        
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

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", numeroSerie=" + numeroSerie 
                + ", titulo=" + titulo + ", numeroPaginas=" + numeroPaginas 
                + ", precioReferencia=" + precioReferencia + ", anoLanzamiento=" 
                + anoLanzamiento + ", publicacion=" + publicacion + ", categoria=" 
                + categoria + ", estado=" + estado + ", idioma=" + idioma + ", editorial=" 
                + editorial + ", autor=" + autor + '}';
    }
    
}