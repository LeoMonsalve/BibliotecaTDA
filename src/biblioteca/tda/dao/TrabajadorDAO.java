/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Trabajador;
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
public class TrabajadorDAO extends Conexion {

    public TrabajadorDAO() {
        super();
    }
    
    public void insertar(Trabajador trabajador) {
        try {
            super.conectar();
            int id = super.ultimoId("cliente") + 1;
            super.state.executeUpdate("INSERT INTO trabajador VALUES (" + id 
            + ", '" + trabajador.getRut() + "', '" + trabajador.getNombre() + "', '" + trabajador.getApellidoPaterno() 
            + "', '" + trabajador.getApellidoPaterno() + "', '" + trabajador.getFechaNacimiento()
            + "', " + trabajador.getListaDireccionesId() + ", " + trabajador.getListaTelefonosId()
            + ", " + trabajador.getListaCorreoId() + ");");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Trabajador buscar(int id) throws SQLException, Exception {
        super.conectar();
        Trabajador trabajador = new Trabajador();
        Date fechaNacimientoDate = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String fechaNacimiento = "";
        ResultSet result = state.executeQuery(
                "SELECT * FROM trabajador WHERE id ='" + id + "'  ;");
        
        while(result.next()) {
            trabajador.setId((int) result.getObject(1));
            trabajador.setRut((String) result.getObject(2));
            trabajador.setNombre((String) result.getObject(3));
            trabajador.setApellidoPaterno((String) result.getObject(4));
            trabajador.setApellidoMaterno((String) result.getObject(5));
            
            fechaNacimientoDate = (Date) result.getObject(6);
            fechaNacimiento = df.format(fechaNacimientoDate);
            trabajador.setFechaNacimiento(fechaNacimiento);
            trabajador.setListaDireccionesId((int) result.getObject(7));
            trabajador.setListaTelefonosId((int) result.getObject(8));
            trabajador.setListaCorreoId((int) result.getObject(9));
            
        }
        return trabajador;
    }
    
    public ArrayList<Trabajador> listarTrabajadores() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM trabajador");
        
        ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
        Date fechaNacimientoDate = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String fechaNacimiento = "";
        
        while(result.next()) {
            Trabajador trabajador = new Trabajador();
            trabajador.setId((int) result.getObject(1));
            trabajador.setRut((String) result.getObject(2));
            trabajador.setNombre((String) result.getObject(3));
            trabajador.setApellidoPaterno((String) result.getObject(4));
            trabajador.setApellidoMaterno((String) result.getObject(5));
            
            fechaNacimientoDate = (Date) result.getObject(6);
            fechaNacimiento = df.format(fechaNacimientoDate);
            trabajador.setFechaNacimiento(fechaNacimiento);
            trabajador.setListaDireccionesId((int) result.getObject(7));
            trabajador.setListaTelefonosId((int) result.getObject(8));
            trabajador.setListaCorreoId((int) result.getObject(9));
            trabajadores.add(trabajador);
        }
        return trabajadores;      
    }
    
    public void modificar(Trabajador trabajador) {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE trabajador set rut='" + trabajador.getRut() 
                    + "', nombre='" + trabajador.getNombre() 
                    + "', apellido_paterno='" + trabajador.getApellidoPaterno() 
                    + "', apellido_materno='" + trabajador.getApellidoPaterno() 
                    + "', fecha_nacimiento='" + trabajador.getFechaNacimiento() 
                    + "', lista_direcciones_id=" + trabajador.getListaDireccionesId()
                    + ", lista_telefonos_id=" + trabajador.getListaTelefonosId() 
                    + ", lista_correo_id=" + trabajador.getListaCorreoId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM trabajador WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
