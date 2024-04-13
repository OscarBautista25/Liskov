public class Niño extends Persona {

    public Niño(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    void pagar() {
        throw new RuntimeException("Un niño no puede pagar");
    }
    
    
}
