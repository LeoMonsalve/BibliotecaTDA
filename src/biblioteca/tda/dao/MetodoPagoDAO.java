
import biblioteca.tda.dao.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MetodoPagoDAO extends Conexion {
    public MetodoPagoDAO(){
        super();
    }
    
    public  int ultimoId() throws SQLException {
        super.conectar();
        int ultimoId=0;
        ResultSet result = state.executeQuery("\"SELECT id FROM metodo_pago order by id desc limit 1;\"");
        
         while (result.next()) {
            ultimoId = (int) result.getObject(1);
        }
        return ultimoId;
    }
    
    public void insertar(MetodoPago metodoPago){
            try {
            super.conectar();
            int ultimoRegistro = ultimoId();
            ultimoRegistro++;
            super.state.executeUpdate("INSERT INTO metodo_pago VALUES (" + ultimoRegistro
                    + ", '" + metodoPago.getTipoPago() + "');");  
                    
              con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
    public void modificar(MetodoPago metodoPago){
      try {
        super.conectar();
        int ultimoRegistro= ultimoId();
        ultimoRegistro++;
        super.state.executeQuery("UPDATE metodo_pago set tipo_pago='" + metodoPago.getTipoPago() + 
        "' where id =" +  metodoPago.getId() + ";");
        con.close();
    } catch (Exception e) {
         e.printStackTrace();
      }  
    }
    
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM metodo_pago WHERE id="+ id +";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
