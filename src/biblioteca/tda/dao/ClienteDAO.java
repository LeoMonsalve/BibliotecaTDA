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
 * DAO para el manejo de la base de datos con la tabla Cliente
 * @author henrry
 */
public class ClienteDAO extends Conexion {

    public ClienteDAO() {
        super();
    }
    //Creamos metodo para insertar los valores.
    /**
     * Método para insertar nueva nombreTabla en la base de datos
     * @param cliente Objeto Cliente que se insertará en la base de datos
     */
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
    //creamos metodo para buscar por ID 
    /**
     * Método para buscar Cliente por ID en la base de datos
     * @param id int para buscar en la base de datos.
     * @return Objeto Cliente que se insertará en la base de datos
     * @throws SQLException
     * @throws Exception 
     */
    public Cliente buscar(int id) throws SQLException, Exception {
        super.conectar();
        //creamos nuevo objeto para tomar los valores
        Cliente cliente = new Cliente();
        //creamos objeto date para luego parsearlo
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
            //tomamos el Date para parsearlo.
            fechaNacimientoDate = (Date) result.getObject(6);
            fechaNacimiento = df.format(fechaNacimientoDate);
            cliente.setFechaNacimiento(fechaNacimiento);
            cliente.setListaDireccionesId((int) result.getObject(7));
            cliente.setListaTelefonosId((int) result.getObject(8));
            cliente.setListaCorreoId((int) result.getObject(9));
            
        }
        return cliente;
    }
    
    //listammos los clientes 
    /**
     * Método para devolver todas los clientes de la base de datos
     * @return ArrayList con todas los clientes
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Cliente> listarClientes() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM cliente");
        //creamos objeto clientes para que tome todos los clientes
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
          //creamos objeto date para luego parsearlo
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
              //creamos objeto date para luego parsearlo
            fechaNacimientoDate = (Date) result.getObject(6);
            fechaNacimiento = df.format(fechaNacimientoDate);
            cliente.setFechaNacimiento(fechaNacimiento);
            cliente.setListaDireccionesId((int) result.getObject(7));
            cliente.setListaTelefonosId((int) result.getObject(8));
            cliente.setListaCorreoId((int) result.getObject(9));
            //añadimos los valores al nuevo objeto
            clientes.add(cliente);
        }
        //retornamos el objeto clientes con todos los clientes.
        return clientes;      
    }
    //creamos metodo modificar
    /**
     * Método para modificar Cliente en la base de datos
     * @param cliente Objeto Cliente con los datos modificados
     */
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
    //creamos metodo eliminar
    /**
     * Método que elimina Cliente por ID
     * @param id int con el ID que se ejecutará la QUERY
     * @return int con el número de filas afectadas
     */
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
