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
 *
 * @author henrry
 */
public class DistribuidorDAO extends Conexion {

    public DistribuidorDAO() {
        super();
    }

    public int ultimoId() throws SQLException {
        super.conectar();
        int ultimoId = 0;
        ResultSet result = state.executeQuery("SELECT id FROM distribuidor order by id desc limit 1;");

        while (result.next()) {
            ultimoId = (int) result.getObject(1);
        }
        return ultimoId;
    }

    public void insertar(Distribuidor distribuidor) {
        try {
            super.conectar();
            int ultimoId = ultimoId();
            ultimoId++;
            super.state.executeUpdate("INSERT INTO libro VALUES (" + ultimoId
                    + ", '" + distribuidor.getRut() + "', '" + distribuidor.getNombreEmpresa()
                    + "', '" + distribuidor.getAnoDistribucion() + "', " + distribuidor.getDireccionId()
                    + ", " + distribuidor.getTelefonoId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Distribuidor buscar(int id) throws SQLException, Exception {
        super.conectar();
        Distribuidor distribuidor = new Distribuidor();
        Date fechaAnoDistribucion = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); // variable para castear sql Date a String
        String anoDistribucion = "";
        ResultSet result = state.executeQuery(
                "SELECT * FROM distribuidor WHERE id ='" + id + "'  ;");

        while (result.next()) {
            distribuidor.setId((int) result.getObject(1));
            distribuidor.setRut((String) result.getObject(2));
            distribuidor.setNombreEmpresa((String) result.getObject(3));
            fechaAnoDistribucion = (Date) result.getObject(4);
            anoDistribucion = df.format(fechaAnoDistribucion);
            distribuidor.setAnoDistribucion(anoDistribucion);
            distribuidor.setDireccionId((int) result.getObject(5));
            distribuidor.setTelefonoId((int) result.getObject(6));
        }
        return distribuidor;
    }

    public ArrayList<Distribuidor> listarDistribuidores() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM distribuidor");

        ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
        Date fechaAnoDistribucion = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); // variable para castear sql Date a String
        String anoDistribucion = "";

        while (result.next()) {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.setId((int) result.getObject(1));
            distribuidor.setRut((String) result.getObject(2));
            distribuidor.setNombreEmpresa((String) result.getObject(3));
            fechaAnoDistribucion = (Date) result.getObject(4);
            anoDistribucion = df.format(fechaAnoDistribucion);
            distribuidor.setAnoDistribucion(anoDistribucion);
            distribuidor.setDireccionId((int) result.getObject(5));
            distribuidor.setTelefonoId((int) result.getObject(6));
            distribuidores.add(distribuidor);
        }
        return distribuidores;
    }
    
    public void modificar(Distribuidor distribuidor) {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE distribuidor set rut='" 
                    + distribuidor.getRut() + "', nombre_empresa='" 
                    + distribuidor.getNombreEmpresa() + "', ano_distribucionBB='" 
                    + distribuidor.getAnoDistribucion() + "', direccion_id=" 
                    + distribuidor.getDireccionId() + ", telefono_id=" 
                    + distribuidor.getTelefonoId() + ";");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM distribuidores WHERE id="+ id +";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
