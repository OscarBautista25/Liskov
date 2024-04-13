public class Persona {
    String cedula;
    String nombre;
    String apellido;
    String tarjeta;
    public Persona(String cedula, String nombre, String apellido, String tarjeta) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
    }
    public Persona(String nombre2, String apellido2) {
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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