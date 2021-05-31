package biblioteca.tda.dao;


import biblioteca.tda.dao.Conexion;
import biblioteca.tda.modelo.MetodoPago;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MetodoPagoDAO extends Conexion {
    public MetodoPagoDAO(){
        super();
    }
    //insertamos el metodo de pago
    public void insertar(MetodoPago metodoPago){
            try {
            super.conectar();
            int id = super.ultimoId("autor") + 1;
            super.state.executeUpdate("INSERT INTO metodo_pago VALUES (" + id
                    + ", '" + metodoPago.getTipoPago() + "');");  
                    
              con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //buscamos un metodo de pago
    public MetodoPago buscar(int id) throws SQLException, Exception{
        super.conectar();
        MetodoPago metodoPago= new MetodoPago();
        ResultSet result = state.executeQuery(
            "SELECT * FROM metodo_pago WHERE id ='" + id + "' ;");
        while(result.next()){
            metodoPago.setId((int) result.getObject(1));
            metodoPago.setTipoPago((String) result.getObject(2));
        }
        return metodoPago;
    }
//creamos metodo que nos lista todos los metodos de pago
    public ArrayList<MetodoPago> listarMetodoPago() throws SQLException, Exception{

        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM metodo_pago");
        ArrayList<MetodoPago> metodosPago = new ArrayList<MetodoPago>();

        while(result.next()){
           MetodoPago metodoPago = new MetodoPago();

            metodoPago.setId((int)result.getObject(1));
            metodoPago.setTipoPago((String)result.getObject(2));
            metodosPago.add(metodoPago);
        }
        return metodosPago;
    }
    //Cremoa metodo mofificar 
    public void modificar(MetodoPago metodoPago){
      try {
        super.conectar();
        super.state.executeUpdate("UPDATE metodo_pago set tipo_pago='" + metodoPago.getTipoPago() + 
        "' where id =" +  metodoPago.getId() + ";");
        con.close();
    } catch (Exception e) {
         e.printStackTrace();
      }  
    }
    //creamos metodo eliminar
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM metodo_pago WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
