package biblioteca.tda.modelo;

/**
 * 
 * @author henrr
 */
public class Compra {
    private int id;
    private String fecha;
    private int distribuidorId;
    private int facturaId;
    
    
    /**
     * Constructor sin parámetors
     */
    public Compra() {
    }


    /**
     * Constructor con parámetros
     * @param id
     * @param fecha
     * @param distribuidorId
     * @param facturaId
     */
    public Compra(int id, String fecha, int distribuidorId, int facturaId) {
        this.id = id;
        this.fecha = fecha;
        this.distribuidorId = distribuidorId;
        this.facturaId = facturaId;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) throws Exception {
        if (fecha.trim().length()>0) {
             this.fecha = fecha;
        }else{
            throw new Exception("Debe ingresar una fecha");
        }
    }


    public int getDistribuidorId() {
        return distribuidorId;
    }


    public void setDistribuidorId(int distribuidorId) {
        this.distribuidorId = distribuidorId;
    }


    public int getFacturaId() {
        return facturaId;
    }


    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }


    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "Compra [distribuidorId=" + distribuidorId + ", facturaId=" + facturaId + ", fecha=" + fecha + ", id="
                + id + "]";
    }
    
    
}
