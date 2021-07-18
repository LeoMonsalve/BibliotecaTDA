/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Factura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * DAO para el manejo de la base de datos con la tabla Factura
 * @author henrry
 */
public class FacturaDAO extends Conexion {

    public FacturaDAO() {
        super();
    }
//Creamos metodo para insertar una factura
    /**
     * Método para insertar nueva Factura en la base de datos
     * @param factura 
     */
    public void insertar(Factura factura) {
        try {
            super.conectar();
            int id = super.ultimoId("factura") + 1;
            super.state.executeUpdate("INSERT INTO factura VALUES (" + id
                    + ", '" + factura.getFolio() + "', " + factura.getPrecio() 
                    + ", " + factura.getPrecioIva() + ", " + factura.getCostoIva() 
                    + ", '" + factura.getFechaCompra() + "', " + factura.getDistribuidorId() 
                    + ", " + factura.getMetodoPagoId() + ");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //implementamos metodo que nos busque una factura 
    /**
     * Método para buscar Factura por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Factura con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
    public Factura buscar(int id) throws SQLException, Exception {
        super.conectar();
        //creamos nuevo objeto para que tome los valores.
        Factura factura = new Factura();
        ResultSet result = state.executeQuery("SELECT * FROM factura WHERE id = '" + id + "' ;");
        
        while(result.next()) {
            factura.setId((int) result.getObject(1));
            factura.setFolio((String) result.getObject(2));
            factura.setPrecio((int) result.getObject(3));
            factura.setPrecioIva((float) result.getObject(4));
            factura.setCostoIva((float) result.getObject(5));
            factura.setFechaCompra((String) result.getObject(6));
            factura.setDistribuidorId((int) result.getObject(7));
            factura.setMetodoPagoId((int) result.getObject(8));
        }
        return factura;
    }
    //creamos metodo que nos listará todas la facturas
    /**
     * Método para devolver todas las facturas de la base de datos
     * @return ArrayList con todas las facturas
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Factura> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM factura");
        //creamos objeto que guardará todas las facturas
        ArrayList<Factura> facturas = new ArrayList<Factura>();
        
        while(result.next()) {
            Factura factura = new Factura();
            factura.setId((int) result.getObject(1));
            factura.setFolio((String) result.getObject(2));
            factura.setPrecio((int) result.getObject(3));
            factura.setPrecioIva((float) result.getObject(4));
            factura.setCostoIva((float) result.getObject(5));
            factura.setFechaCompra((String) result.getObject(6));
            factura.setDistribuidorId((int) result.getObject(7));
            factura.setMetodoPagoId((int) result.getObject(8));
            //guardamos las facturas en el nuevo objeto
            facturas.add(factura);
        }
        //retornamos el nuevo objeto con todas las facturas dentro.
        return facturas;
    }
    
    //creamos metodo para modificar una factura
    /**
     * Método para modificar factura en la base de datos
     * @param factura Objeto factura con los datos modificados
     */
    public void modificar(Factura factura) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE factura set id=" + factura.getId() 
                    + ", folio='" + factura.getFolio() + "', precio=" + factura.getPrecio()
                    + ", precio_iva=" + factura.getPrecioIva() + ", costo_iva=" + factura.getCostoIva() 
                    + ", fecha_compra='" + factura.getFechaCompra() + "', distribuidor_id=" + factura.getDistribuidorId() 
                    + ", metodo_pago_id=" + factura.getMetodoPagoId() + " WHERE id=" + factura.getId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //creamos metodo para eliminar una factura
    /**
     * Método que elimina Direccion por ID
     * @param id int requerido para eliminar en la base de datos
     * @return entero con el numero de filas que fueron afectadas
     */
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM factura WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
    
}
