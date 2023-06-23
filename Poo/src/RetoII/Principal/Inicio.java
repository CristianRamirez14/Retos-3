package RetoII.Principal;
import RetoII.Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona datos=new Persona();
        datos.pedirDatos();
        datos.mostrarPersona();
        datos.mayorEdad();
      double ePeso = datos.calcularImc();
        if (ePeso<20){
            System.out.println("PESOBAJO");
        } else if(ePeso>=20 && ePeso<=25){
            System.out.println("PESOIDEAL");
        } else if(ePeso>25){
            System.out.println("SOBREPESO");
        }
    
    }
}
