public class NiñoLiskov extends PersonaLiskov {
      

    AdultoLiskov tutor;
    public NiñoLiskov(String nombre, String apellido, AdultoLiskov tutor) {
        super(nombre, apellido);
        this.tutor=tutor;
    }
    public AdultoLiskov getTutor() {
        return tutor;
    }
    public void setTutor(AdultoLiskov tutor) {
        this.tutor = tutor;
    }
    
    
}
