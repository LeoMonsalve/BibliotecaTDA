
import biblioteca.tda.dao.Conexion;
import biblioteca.tda.modelo.Editorial;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditorialDAO extends Conexion{
    
    public EditorialDAO(){
        super();
    }
    
    public  int ultimoId() throws SQLException {
        super.conectar();
        int ultimoId=0;
        ResultSet result = state.executeQuery("\"SELECT id FROM editorial order by id desc limit 1;\"");
        
         while (result.next()) {
            ultimoId = (int) result.getObject(1);
        }
        return ultimoId;
    }
    
    public void insertar(Editorial editorial){
            try {
            super.conectar();
            int ultimoRegistro = ultimoId();
            ultimoRegistro++;
            super.state.executeUpdate("INSERT INTO editorial VALUES (" + ultimoRegistro
                    + ", '" + editorial.getNombre()+ "');");  
                    
              con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Editorial buscar(int id) throws SQLException, Exception{
        super.conectar();
        Editorial editorial = new Editorial();
        ResultSet result = state.executeQuery(
            "SELECT * FROM editorial WHERE id ='" + id + "' ;");
        while(result.next()){
            editorial.setId((int) result.getObject(1));
            editorial.setNombre((String) result.getObject(2));
        }
        return editorial;
    }

    public ArrayList<Editorial> listarEditorial() throws SQLException, Exception{

        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM editorial");
        ArrayList<Editorial> editoriales = new ArrayList<Editorial>();

        while(result.next()){
            Editorial editorial = new Editorial();

            editorial.setId((int)result.getObject(1));
            editorial.setNombre((String)result.getObject(2));
            editoriales.add(editorial); 

        }
        return editoriales;
    }
    public void modificar(Editorial editorial){
      try {
        super.conectar();
        int ultimoRegistro= ultimoId();
        ultimoRegistro++;
        super.state.executeQuery("UPDATE editorial set nombre='" + editorial.getNombre() + "' where id="+ editorial.getId()+";");
        con.close();
    } catch (Exception e) {
         e.printStackTrace();
      }  
    }
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM editorial WHERE id="+ id +";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
