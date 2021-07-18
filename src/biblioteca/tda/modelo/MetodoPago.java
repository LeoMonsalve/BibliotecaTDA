package biblioteca.tda.modelo;

/**
 * Modelo MetodoPago
 * @author leone
 */
public class MetodoPago {
    private int id;
    private String tipoPago;


    /**
     * Constructor sin parámetros
     */
    public MetodoPago() {
    }

    /**
     * Constructor con parámetros
     * @param id
     * @param tipoPago
     */
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


    /**
     * método toString para devolver un String con todos los datos del objeto arriendo
     * @return devuelve un String con todos los atributos del objeto 
     */
    @Override
    public String toString() {
        return "MetodoPago [id=" + id + ", tipoPago=" + tipoPago + "]";
    }
    
}
