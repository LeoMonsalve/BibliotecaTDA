/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 *
 * @author henrry
 */
public class Distribuidor {
    private int id;
    private String rut;
    private String nombreEmpresa;
    private String anoDistribucion;
    private int direccionId;
    private int telefonoId;

    public Distribuidor() {
    }

    public Distribuidor(int id, String rut, String nombreEmpresa, String anoDistribucion, int direccionId, int telefonoId) {
        this.id = id;
        this.rut = rut;
        this.nombreEmpresa = nombreEmpresa;
        this.anoDistribucion = anoDistribucion;
        this.direccionId = direccionId;
        this.telefonoId = telefonoId;
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

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getAnoDistribucion() {
        return anoDistribucion;
    }

    public void setAnoDistribucion(String anoDistribucion) {
        this.anoDistribucion = anoDistribucion;
    }

    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    public int getTelefonoId() {
        return telefonoId;
    }

    public void setTelefonoId(int telefonoId) {
        this.telefonoId = telefonoId;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "id=" + id + ", rut=" + rut + ", nombreEmpresa=" + nombreEmpresa + ", anoDistribucion=" + anoDistribucion + ", direccionId=" + direccionId + ", telefonoId=" + telefonoId + '}';
    }
    
    
}
