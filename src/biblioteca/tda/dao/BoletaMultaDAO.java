/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.BoletaMulta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author leone
 */
public class BoletaMultaDAO extends Conexion {
     public BoletaMultaDAO() {
        super();
    }

    public void insertar(BoletaMulta boletaMulta) {
        try {
            super.conectar();
            int id = super.ultimoId("boleta_multa") + 1;
            super.state.executeUpdate("INSERT INTO boleta_multa VALUES (" + id
                    + ", '" + boletaMulta.getFecha()+ "', " + boletaMulta.getMultaId()+", "
                    +boletaMulta.getClienteId()+ " );");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public BoletaMulta buscar(int id) throws SQLException {
        super.conectar();
        BoletaMulta bm = new BoletaMulta();
        Date fechaNormal= new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String fechaParseada = "";
        ResultSet result = state.executeQuery("SELECT * FROM boleta_multa WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            
            bm.setId((int) result.getObject(1));
            fechaNormal= (Date) result.getObject(2);
            fechaParseada =df.format(fechaNormal);
            bm.setFecha(fechaParseada);
            bm.setMultaId((int)result.getObject(3));
            bm.setClienteId((int)result.getObject(4));
        }
        return bm;
    }
    
    public ArrayList<BoletaMulta> listar() throws SQLException {
        super.conectar();
         Date fechaNormal= new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String fechaParseada = "";
        ResultSet result = state.executeQuery("SELECT * FROM boleta_multa");
        
        ArrayList<BoletaMulta> bms = new ArrayList<BoletaMulta>();
        
        while(result.next()) {
            BoletaMulta bm = new BoletaMulta();
             bm.setId((int) result.getObject(1));
            fechaNormal= (Date) result.getObject(2);
            fechaParseada =df.format(fechaNormal);
            bm.setFecha(fechaParseada);
            bm.setMultaId((int)result.getObject(3));
            bm.setClienteId((int)result.getObject(4));
            bms.add(bm);
        }
        return bms;
    }
    
    public void modificar(BoletaMulta boletaMulta) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE boleta_multa set fecha='" + boletaMulta.getFecha()+ 
                    "'," + " multa_id=" +boletaMulta.getMultaId()+", " +boletaMulta.getClienteId()+ " WHERE id =" + boletaMulta.getId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM boleta_multa WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
