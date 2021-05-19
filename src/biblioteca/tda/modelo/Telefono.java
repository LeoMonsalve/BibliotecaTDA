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
public class Telefono {
    private int id;
    private String numero;
    private int listaNumeros;

    public Telefono() {
    }

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

    @Override
    public String toString() {
        return "Telefono{" + "id=" + id + ", numero=" + numero + ", listaNumeros=" + listaNumeros + '}';
    }
    
    
     
}
