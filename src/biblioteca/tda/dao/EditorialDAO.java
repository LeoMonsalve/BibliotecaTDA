package biblioteca.tda.dao;

import biblioteca.tda.dao.Conexion;
import biblioteca.tda.modelo.Editorial;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 * 
 * @author henrr
 */
public class EditorialDAO extends Conexion{
    
    public EditorialDAO(){
        super();
    }
    //implementamos metodo insertar 
    /**
     * 
     * @param editorial 
     */
    public void insertar(Editorial editorial){
            try {
            super.conectar();
            int id = super.ultimoId("editorial") + 1;
            super.state.executeUpdate("INSERT INTO editorial VALUES (" + id
                    + ", '" + editorial.getNombre()+ "');");  
                    
              con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //implementamos metodo para buscar una editorial por ID
    /**
     * 
     * @param id
     * @return
     * @throws SQLException
     * @throws Exception 
     */
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
    //Creamos metodo que nos liste todas las editoriales 
    /**
     * 
     * @return
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Editorial> listarEditorial() throws SQLException, Exception{

        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM editorial");
        //creamos objeto que tomara todas las editoriales
        ArrayList<Editorial> editoriales = new ArrayList<Editorial>();

        while(result.next()){
            Editorial editorial = new Editorial();

            editorial.setId((int)result.getObject(1));
            editorial.setNombre((String)result.getObject(2));
            //agregamos las editoriales al objeto
            editoriales.add(editorial); 

        }
        //retornamos las editoriles .
        return editoriales;
    }
    
    //implementamos el metodo modificar
    /**
     * 
     * @param editorial 
     */
    public void modificar(Editorial editorial){
      try {
        super.conectar();
        super.state.executeUpdate("UPDATE editorial set nombre='" + editorial.getNombre() + 
                "' where id="+ editorial.getId()+";");
        con.close();
    } catch (Exception e) {
         e.printStackTrace();
      }  
    }
    //implementamos el metodo eliminar
    /**
     * 
     * @param id
     * @return 
     */
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM editorial WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
