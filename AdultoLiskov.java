public class AdultoLiskov extends PersonaLiskov{
    
    String cedula;
    String tarjeta;

    public AdultoLiskov(String nombre, String apellido, String cedula, String tarjeta) {
        super(nombre, apellido);
        this.cedula=cedula;
        this.tarjeta=tarjeta;
        }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    void pagar(){
        System.out.println("Su cedula es " +cedula +" y pago con la tarjeta " +tarjeta);

     }
        
}
