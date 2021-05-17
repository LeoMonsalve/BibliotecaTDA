

import biblioteca.tda.dao.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompraDAO extends Conexion{
    public CompraDAO(){
        super();
    }
    
    
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

    public Compra buscar(int id) throws SQLException, Exception{
        super.conectar();
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

    public ArrayList<Compra> listarCompras() throws SQLException, Exception{

        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM compra");
        ArrayList<Compra> compras = new ArrayList<Compra>();

        while(result.next()){
           Compra compra = new Compra();

            compra.setId((int)result.getObject(1));
            compra.setFecha((String)result.getObject(2));
            compra.setDistribuidorId((int)result.getObject(3));
            compra.setFacturaId((int)result.getObject(4));
            compras.add(compra);
        }
        return compras;
    }
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
    
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM compra WHERE id="+ id +";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
