/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.modelo;

/**
 * Modelo Distribuidor
 * @author henrry
 */
public class Distribuidor {
    private int id;
    private String rut;
    private String nombreEmpresa;
    private String anoDistribucion;
    private int direccionId;
    private int telefonoId;

    /**
     * Constructor sin parámetros
     */
    public Distribuidor() {
    }

    /**
     * Contructor con parámetros
     * @param id
     * @param rut
     * @param nombreEmpresa
     * @param anoDistribucion
     * @param direccionId
     * @param telefonoId
     */
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

    public void setRut(String rut) throws Exception {
       if (rut.trim().length()>0) {
             this.rut = rut;
        }else{
            throw new Exception("Debe ingresar un rut");
        }
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) throws Exception {
        if (nombreEmpresa.trim().length()>0) {
             this.nombreEmpresa = nombreEmpresa;
        }else{
            throw new Exception("Debe ingresar un nombre de empresa");
        }
    }

    public String getAnoDistribucion() {
        return anoDistribucion;
    }

    public void setAnoDistribucion(String anoDistribucion) throws Exception {
        if (anoDistribucion.trim().length()>0) {
             this.anoDistribucion = anoDistribucion;
        }else{
            throw new Exception("Debe ingresar un año de distribucion");
        }
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

    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Distribuidor{" + "id=" + id + ", rut=" + rut + ", nombreEmpresa=" + nombreEmpresa + ", anoDistribucion=" + anoDistribucion + ", direccionId=" + direccionId + ", telefonoId=" + telefonoId + '}';
    }
    
    
}
