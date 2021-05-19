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
 *
 * @author henrry
 */
public class FacturaDAO extends Conexion {

    public FacturaDAO() {
        super();
    }

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
    
    public Factura buscar(int id) throws SQLException {
        super.conectar();
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
    
    public ArrayList<Factura> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM factura");
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
            facturas.add(factura);
        }
        return facturas;
    }
    
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
