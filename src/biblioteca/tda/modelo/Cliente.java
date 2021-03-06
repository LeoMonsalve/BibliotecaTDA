/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Cliente
 * @author henrry
 */
public class Cliente {
    private int id;
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNacimiento;
    private int listaDireccionesId;
    private int listaTelefonosId;
    private int listaCorreoId;

    /**
     * Constructor sin parámetros
     */
    public Cliente() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param rut
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param fechaNacimiento
     * @param listaDireccionesId
     * @param listaTelefonosId
     * @param listaCorreoId 
     */
    public Cliente(int id, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, int listaDireccionesId, int listaTelefonosId, int listaCorreoId) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.listaDireccionesId = listaDireccionesId;
        this.listaTelefonosId = listaTelefonosId;
        this.listaCorreoId = listaCorreoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getListaDireccionesId() {
        return listaDireccionesId;
    }

    public void setListaDireccionesId(int listaDireccionesId) {
        this.listaDireccionesId = listaDireccionesId;
    }

    public int getListaTelefonosId() {
        return listaTelefonosId;
    }

    public void setListaTelefonosId(int listaTelefonosId) {
        this.listaTelefonosId = listaTelefonosId;
    }

    public int getListaCorreoId() {
        return listaCorreoId;
    }

    public void setListaCorreoId(int listaCorreoId) {
        this.listaCorreoId = listaCorreoId;
    }

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", listaDireccionesId=" + listaDireccionesId + ", listaTelefonosId=" + listaTelefonosId + ", listaCorreoId=" + listaCorreoId + '}';
    }
}
