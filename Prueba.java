public class Prueba {
    public static void main(String[] args) {
        AdultoLiskov adulto = new AdultoLiskov("Pedro", "Perez", "123456", "1234-5678");
        NiñoLiskov niño = new NiñoLiskov("Pablo", "Perez", adulto);
        niño.getTutor().pagar();
    }
}
