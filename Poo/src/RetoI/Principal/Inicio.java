package RetoI.Principal;
import RetoI.Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona datos=new Persona();
        datos.pedirDatos();
        datos.mostrarPersona();
        datos.calcularImc();
        datos.mayorEdad();
    }
}
