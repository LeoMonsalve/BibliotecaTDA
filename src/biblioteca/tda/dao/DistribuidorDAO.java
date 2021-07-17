/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Distribuidor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * DAO para el manejo de la base de datos con la tabla Distribuidor
 * @author henrry
 */
public class DistribuidorDAO extends Conexion {

    public DistribuidorDAO() {
        super();
    }
//creamos metodo para insertar valores 
    /**
     * Método para insertar nuevo Distribuidor en la base de datos
     * @param distribuidor Objeto Distribuidor con todos los datos a insertar
     */
    public void insertar(Distribuidor distribuidor) {
        try {
            super.conectar();
            int id = super.ultimoId("distribuidor") + 1;
            super.state.executeUpdate("INSERT INTO libro VALUES (" + id
                    + ", '" + distribuidor.getRut() + "', '" + distribuidor.getNombreEmpresa()
                    + "', '" + distribuidor.getAnoDistribucion() + "', " + distribuidor.getDireccionId()
                    + ", " + distribuidor.getTelefonoId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //implementamos metodo para buscar por ID 
    /**
     * Método para buscar Distribuidor por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Distribuidor con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
    public Distribuidor buscar(int id) throws SQLException, Exception {
        super.conectar();
        Distribuidor distribuidor = new Distribuidor();
        //creamos objeto date para luego parsear
        Date fechaAnoDistribucion = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); // variable para castear sql Date a String
        String anoDistribucion = "";
        ResultSet result = state.executeQuery(
                "SELECT * FROM distribuidor WHERE id ='" + id + "'  ;");

        while (result.next()) {
            distribuidor.setId((int) result.getObject(1));
            distribuidor.setRut((String) result.getObject(2));
            distribuidor.setNombreEmpresa((String) result.getObject(3));
            //tomamos el objeto date para parsearlo
            fechaAnoDistribucion = (Date) result.getObject(4);
            anoDistribucion = df.format(fechaAnoDistribucion);
            distribuidor.setAnoDistribucion(anoDistribucion);
            distribuidor.setDireccionId((int) result.getObject(5));
            distribuidor.setTelefonoId((int) result.getObject(6));
        }
        return distribuidor;
    }
//Creamos metodo que nos lista todos los Distribuidores
    /**
     * Método para devolver todos los distribuidores de la base de datos
     * @return ArrayList con todos los distribuidores
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Distribuidor> listarDistribuidores() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM distribuidor");

        ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
         //creamos objeto date para luego parsear
        Date fechaAnoDistribucion = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); // variable para castear sql Date a String
        String anoDistribucion = "";

        while (result.next()) {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.setId((int) result.getObject(1));
            distribuidor.setRut((String) result.getObject(2));
            distribuidor.setNombreEmpresa((String) result.getObject(3));
             //tomamos el objeto date para parsearlo
            fechaAnoDistribucion = (Date) result.getObject(4);
            anoDistribucion = df.format(fechaAnoDistribucion);
            distribuidor.setAnoDistribucion(anoDistribucion);
            distribuidor.setDireccionId((int) result.getObject(5));
            distribuidor.setTelefonoId((int) result.getObject(6));
            distribuidores.add(distribuidor);
        }
        return distribuidores;
    }
    //implementamos el metodo modificar
    /**
     * Método para modificar Distribuidor en la base de datos
     * @param distribuidor Objeto Distribuidor con los datos modificados
     */
    public void modificar(Distribuidor distribuidor) {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE distribuidor set rut='" 
                    + distribuidor.getRut() + "', nombre_empresa='" 
                    + distribuidor.getNombreEmpresa() + "', ano_distribucionBB='" 
                    + distribuidor.getAnoDistribucion() + "', direccion_id=" 
                    + distribuidor.getDireccionId() + ", telefono_id=" 
                    + distribuidor.getTelefonoId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //creamos metodo para eliminar.
    /**
     * Método que elimina Distribuidor por ID
     * @param id int requerido para eliminar en la base de datos
     * @return entero con el numero de filas que fueron afectadas
     */
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM distribuidores WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
