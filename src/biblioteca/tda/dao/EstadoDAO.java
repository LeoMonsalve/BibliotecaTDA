/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Estado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author henrr
 */
public class EstadoDAO extends Conexion {
    
    public EstadoDAO(){
        super();
    }
    //implementamos metodo insertar
    public void insertar(Estado estado){
            try {
            super.conectar();
            int id = super.ultimoId("estado") + 1;
            super.state.executeUpdate("INSERT INTO estado VALUES (" + id
                    + ", '" + estado.getDescripcion() + "');");  
                    
              con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //creamos metodo para buscar por ID 
    public Estado buscar(int id) throws SQLException, Exception{
        super.conectar();
        //creamos nuevo objeto para tomar los valores 
        Estado estado = new Estado();
        ResultSet result = state.executeQuery(
            "SELECT * FROM estado WHERE id =" + id + " ;");
        while(result.next()){
            estado.setId((int) result.getObject(1));
            estado.setDescripcion((String) result.getObject(2));
        }
        return estado;
    }
//implementamos metodo para listar todos los estados 
    public ArrayList<Estado> listarEstados() throws SQLException, Exception{

        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM estado");
        //creamos nuevo objeto que tomara todos los estados.
        ArrayList<Estado> estados = new ArrayList<Estado>();

        while(result.next()){
           Estado estado = new Estado();

            estado.setId((int)result.getObject(1));
            estado.setDescripcion((String)result.getObject(2));
            //agreggamos los valores al nuevo objeto
            estados.add(estado);
        }
        //retornamos el objeto con todos los estados.
        return estados;
    }
    
    // implementamos metodo para modificar los estados
    public void modificar(Estado estado){
      try {
        super.conectar();
        super.state.executeUpdate("UPDATE estado set descripcion='" + estado.getDescripcion() + "' where id= " + estado.getId()+ ";");
        con.close();
    } catch (Exception e) {
         e.printStackTrace();
      }  
    }
    //iimplementamos metodo para eliminar estado.
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM estado WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
