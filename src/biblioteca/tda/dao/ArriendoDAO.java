/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Arriendo;
import biblioteca.tda.modelo.Autor;
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
public class ArriendoDAO extends Conexion {

    public ArriendoDAO() {
        super();
    }
    //insertar valores en bbdd
    public void insertar(Arriendo arriendo) {
        try {
            super.conectar();
            int id = super.ultimoId("arriendo") + 1;
            super.state.executeUpdate("INSERT INTO arriendo VALUES (" + id
            + ", " + arriendo.getCostoTotal() + ", '" + arriendo.getFechaDevolucion() 
                    + "', '" + arriendo.getFechaReal() + "', " + arriendo.getDiasRetraso() 
                    + ", " + arriendo.getCostoArriendo() + ", '" + arriendo.getFechaArriendo()
                    + "', " + arriendo.getClienteId() + ", " + arriendo.getTrabajadoresId() + ");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //buscando por id en bbdd
    public Arriendo buscar(int id) throws SQLException {
        super.conectar();
        Arriendo arriendo = new Arriendo();
        ResultSet result = state.executeQuery("SELECT * FROM arriendo WHERE id = '" + id + "' ;");
        Date devolucionDate = new Date();
        Date realDate = new Date();
        Date arriendoDate = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); // variable para castear sql Date a String
        String fechaDevolucion, fechaReal, fechaArriendo;
        while(result.next()) {
            arriendo.setId((int) result.getObject(1));
            arriendo.setCostoTotal((int) result.getObject(2));
            // recibimos Date para parsear
            devolucionDate = (Date) result.getObject(3);
            fechaDevolucion = df.format(devolucionDate);
            arriendo.setFechaDevolucion(fechaDevolucion);
            realDate = (Date) result.getObject(4);
            fechaReal = df.format(realDate);
            arriendo.setFechaReal(fechaReal);
            arriendo.setDiasRetraso((int) result.getObject(5));
            arriendo.setCostoArriendo((int) result.getObject(6));
            arriendoDate = (Date) result.getObject(7);
            fechaArriendo = df.format(arriendoDate);
            arriendo.setFechaArriendo(fechaArriendo);
            arriendo.setClienteId((int) result.getObject(8));
            arriendo.setTrabajadoresId((int) result.getObject(10));
        }
        return arriendo;
    }
    //metodo para listar 
    public ArrayList<Arriendo> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM arriendo");
        
        ArrayList<Arriendo> arriendos = new ArrayList<Arriendo>();
        Date devolucionDate = new Date();
        Date realDate = new Date();
        Date arriendoDate = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); // variable para castear sql Date a String
        String fechaDevolucion, fechaReal, fechaArriendo;
        
        while(result.next()) {
            Arriendo arriendo = new Arriendo();
            arriendo.setId((int) result.getObject(1));
            arriendo.setCostoTotal((int) result.getObject(2));
            // recibimos Date para parsear
            devolucionDate = (Date) result.getObject(3);
            fechaDevolucion = df.format(devolucionDate);
            arriendo.setFechaDevolucion(fechaDevolucion);
            realDate = (Date) result.getObject(4);
            fechaReal = df.format(realDate);
            arriendo.setFechaReal(fechaReal);
            arriendo.setDiasRetraso((int) result.getObject(5));
            arriendo.setCostoArriendo((int) result.getObject(6));
            arriendoDate = (Date) result.getObject(7);
            fechaArriendo = df.format(arriendoDate);
            arriendo.setFechaArriendo(fechaArriendo);
            arriendo.setClienteId((int) result.getObject(8));
            arriendo.setTrabajadoresId((int) result.getObject(10));
            arriendos.add(arriendo);
        }
        return arriendos;  
    }
    
    //metodo para modificiar
    public void modificar(Arriendo arriendo) {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE arriendo set costo_total=" + arriendo.getCostoTotal() 
                    + ", fecha_devolucion='" + arriendo.getFechaDevolucion() 
                    + "', fecha_real='" + arriendo.getFechaReal() 
                    + "', dias_retraso=" + arriendo.getDiasRetraso() 
                    + ", costo_arriendo=" + arriendo.getCostoArriendo() 
                    + ", fecha_arriendo='" + arriendo.getFechaArriendo() + "', cliente_id=" + arriendo.getClienteId() 
                    + ", trabajadores_id=" + arriendo.getTrabajadoresId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //metodo para eliminar
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM arriendo WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
