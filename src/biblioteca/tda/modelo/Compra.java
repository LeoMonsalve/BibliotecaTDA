public class Compra {
    private int id;
    private String fecha;
    private int distribuidorId;
    private int facturaId;
    
    
    public Compra() {
    }


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


    @Override
    public String toString() {
        return "Compra [distribuidorId=" + distribuidorId + ", facturaId=" + facturaId + ", fecha=" + fecha + ", id="
                + id + "]";
    }
    
    
}
