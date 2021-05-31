package biblioteca.tda.modelo;

public class MetodoPago {
    private int id;
    private String tipoPago;


    public MetodoPago() {
    }


    public MetodoPago(int id, String tipoPago) {
        this.id = id;
        this.tipoPago = tipoPago;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTipoPago() {
        return tipoPago;
    }


    public void setTipoPago(String tipoPago) throws Exception {
        if (tipoPago.trim().length()>0) {
             this.tipoPago = tipoPago;
        }else{
            throw new Exception("Debe ingresar un tipo de pago");
        }
    }


    @Override
    public String toString() {
        return "MetodoPago [id=" + id + ", tipoPago=" + tipoPago + "]";
    }

    

    
}
