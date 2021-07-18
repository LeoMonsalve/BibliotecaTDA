

import biblioteca.tda.modelo.Compra;
import biblioteca.tda.dao.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompraDAO extends Conexion{
    public CompraDAO(){
        super();
    }
    
    //creamos metodo insertar 
    /**
     * Método para insertar nueva Compra en la base de datos
     * @param compra Objeto Compra con todos los datos a insertar
     */
    public void insertar(Compra compra){
            try {
            super.conectar();
            int id = super.ultimoId("compra") + 1;
            super.state.executeUpdate("INSERT INTO compra VALUES (" + id
                    + ", '" + compra.getFecha() + "', " + compra.getDistribuidorId() + ", "
                     + compra.getFacturaId() + ");");  
                    
              con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    //creamos metodo buscar por ID 
    /**
     * Método para buscar Compra por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Compra con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
    public Compra buscar(int id) throws SQLException, Exception{
        super.conectar();
        //Creamos nuevo objeto compra para tomar los valores.
        Compra compra = new Compra();
        ResultSet result = state.executeQuery(
            "SELECT * FROM compra WHERE id ='" + id + "' ;");
        while(result.next()){
            compra.setId((int) result.getObject(1));
            compra.setFecha((String) result.getObject(2));
            compra.setDistribuidorId((int) result.getObject(3));
            compra.setFacturaId((int) result.getObject(4));
        }
        return compra;
    }
//creamos metodo para listar las compras 
    /**
     * Método para devolver todos las Comopra de la base de datos
     * @return ArrayList con todos las compras
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Compra> listarCompras() throws SQLException, Exception{

        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM compra");
        //creamos objeto que tendra todas las compras 
        ArrayList<Compra> compras = new ArrayList<Compra>();

        while(result.next()){
           Compra compra = new Compra();

            compra.setId((int)result.getObject(1));
            compra.setFecha((String)result.getObject(2));
            compra.setDistribuidorId((int)result.getObject(3));
            compra.setFacturaId((int)result.getObject(4));
            //seteamos las compras en el objeto"compras"
            compras.add(compra);
        }
        //retornamos todas las compras en el objeto compras.
        return compras;
    }
    
    //Creamos metodo modificar
    /**
     * Método para modificar Compra en la base de datos
     * @param compra Objeto Compra con los datos modificados
     */
    public void modificar(Compra compra){
      try {
        super.conectar();
        super.state.executeQuery("UPDATE compra set fecha='" +  compra.getFecha() +
         "', distribuidor_id=" + compra.getDistribuidorId() + ", factura_id= "
        + compra.getFacturaId() + " where id=" + compra.getId() + ";");
        con.close();
    } catch (Exception e) {
         e.printStackTrace();
      }  
    }
    //Cremaos metodo eliminar
    /**
     * Método que elimina Compra por ID
     * @param id int requerido para buscar en la base de datos
     * @return int con el número de filas afectadas
     */
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM compra WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
