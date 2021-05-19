/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Cliente;
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
public class ClienteDAO extends Conexion {

    public ClienteDAO() {
        super();
    }
    
    public void insertar(Cliente cliente) {
        try {
            super.conectar();
            int id = super.ultimoId("cliente") + 1;
            super.state.executeUpdate("INSERT INTO cliente VALUES (" + id 
            + ", '" + cliente.getRut() + "', '" + cliente.getNombre() + "', '" + cliente.getApellidoPaterno() 
            + "', '" + cliente.getApellidoPaterno() + "', '" + cliente.getFechaNacimiento()
            + "', " + cliente.getListaDireccionesId() + ", " + cliente.getListaTelefonosId()
            + ", " + cliente.getListaCorreoId() + ");");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Cliente buscar(int id) throws SQLException, Exception {
        super.conectar();
        Cliente cliente = new Cliente();
        Date fechaNacimientoDate = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String fechaNacimiento = "";
        ResultSet result = state.executeQuery(
                "SELECT * FROM cliente WHERE id ='" + id + "'  ;");
        
        while(result.next()) {
            cliente.setId((int) result.getObject(1));
            cliente.setRut((String) result.getObject(2));
            cliente.setNombre((String) result.getObject(3));
            cliente.setApellidoPaterno((String) result.getObject(4));
            cliente.setApellidoMaterno((String) result.getObject(5));
            
            fechaNacimientoDate = (Date) result.getObject(6);
            fechaNacimiento = df.format(fechaNacimientoDate);
            cliente.setFechaNacimiento(fechaNacimiento);
            cliente.setListaDireccionesId((int) result.getObject(7));
            cliente.setListaTelefonosId((int) result.getObject(8));
            cliente.setListaCorreoId((int) result.getObject(9));
            
        }
        return cliente;
    }
    
    public ArrayList<Cliente> listarClientes() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM cliente");
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Date fechaNacimientoDate = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String fechaNacimiento = "";
        
        while(result.next()) {
            Cliente cliente = new Cliente();
            cliente.setId((int) result.getObject(1));
            cliente.setRut((String) result.getObject(2));
            cliente.setNombre((String) result.getObject(3));
            cliente.setApellidoPaterno((String) result.getObject(4));
            cliente.setApellidoMaterno((String) result.getObject(5));
            
            fechaNacimientoDate = (Date) result.getObject(6);
            fechaNacimiento = df.format(fechaNacimientoDate);
            cliente.setFechaNacimiento(fechaNacimiento);
            cliente.setListaDireccionesId((int) result.getObject(7));
            cliente.setListaTelefonosId((int) result.getObject(8));
            cliente.setListaCorreoId((int) result.getObject(9));
            clientes.add(cliente);
        }
        return clientes;      
    }
    
    public void modificar(Cliente cliente) {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE cliente set rut='" + cliente.getRut() 
                    + "', nombre='" + cliente.getNombre() 
                    + "', apellido_paterno='" + cliente.getApellidoPaterno() 
                    + "', apellido_materno='" + cliente.getApellidoPaterno() 
                    + "', fecha_nacimiento='" + cliente.getFechaNacimiento() 
                    + "', lista_direcciones_id=" + cliente.getListaDireccionesId()
                    + ", lista_telefonos_id=" + cliente.getListaTelefonosId() 
                    + ", lista_correo_id=" + cliente.getListaCorreoId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM cliente WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
  
}
