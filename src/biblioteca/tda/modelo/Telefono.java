/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Telefono
 * @author leone
 */
public class Telefono {
    private int id;
    private String numero;
    private int listaNumeros;

    /**
     * Constructor sin parámetros
     */
    public Telefono() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param numero
     * @param listaNumeros
     */
    public Telefono(int id, String numero, int listaNumeros) {
        this.id = id;
        this.numero = numero;
        this.listaNumeros = listaNumeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(int listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Telefono{" + "id=" + id + ", numero=" + numero + ", listaNumeros=" + listaNumeros + '}';
    }
}
