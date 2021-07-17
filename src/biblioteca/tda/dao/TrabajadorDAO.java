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
 * DAO para el manejo de la base de datos con la tabla Trabajador
 * @author henrry
 */
public class TrabajadorDAO extends Conexion {

    public TrabajadorDAO() {
        super();
    }
    
    /**
     * Método para insertar nuevo Trabajador en la base de datos
     * @param trabajador Objeto Trabajador con todos los datos a insertar
     */
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
    
    /**
     * Método para buscar Trabajador por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Trabajador con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
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
    
    /**
     * Método para devolver todos los Trabajadores de la base de datos
     * @return ArrayList con todos los Trabajadores
     * @throws SQLException
     * @throws Exception 
     */
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
    
    /**
     * Método para modificar trabajador en la base de datos
     * @param trabajador Objeto trabajador con los datos modificados
     */
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
    
     /**
     * Método que elimina Trabajador por ID
     * @param id int requerido para eliminar en la base de datos
     * @return entero con el numero de filas que fueron afectadas
     */
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
