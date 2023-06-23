package RetoII.Salud;
import java.util.Scanner;
public class Persona {
    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    Double peso;
    Double estatura;
    int edad;
    String sexo;
    public void pedirDatos(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingresa el tipo de documento: ");
        tipoDoc=capturar.nextLine();
        System.out.println("Ingresa el numero del documento: ");
        documento=capturar.nextInt();
        capturar.nextLine();
        System.out.println("Ingresa tu nombre: ");
        nombre=capturar.nextLine();
        System.out.println("Ingresa tu apellido: ");
        apellido=capturar.nextLine();
        System.out.println("Ingresa tu peso: ");
        peso=capturar.nextDouble();
        System.out.println("Ingresa tu estatura: ");
        estatura=capturar.nextDouble();
        System.out.println("Ingresa tu edad: ");
        edad=capturar.nextInt();
        capturar.nextLine();
        System.out.println("Ingresa tu tipo de sexo: ");
        sexo=capturar.nextLine();
        capturar.close();
    }
    public void mostrarPersona(){
        System.out.println("_____________________________________");
        System.out.println("|   LOS DATOS REGISTRADOS FUERON:   |");
        System.out.println("|___________________________________|");
        System.out.println("| Su tipo de documento es: "+tipoDoc);
        System.out.println("| Su numero de documento es: "+documento);
        System.out.println("| Su nombre es: "+nombre);
        System.out.println("| Su apellido es: "+apellido);
        System.out.println("| Su peso es: "+peso);
        System.out.println("| Su estatura es: "+estatura);
        System.out.println("| Su edad es: "+edad);
        System.out.println("| Su tipo de sexo es: "+sexo);
        System.out.println("|__________________________________|");
    }
    public double calcularImc(){
        double pActual= peso/(estatura*2);
        double ePeso = Math.round(pActual * 10.0)/10.0;
        return ePeso;
    }
    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Usted es mayor de edad.");
        }else{
            System.out.println("Usted es menor de edad.");
        }
        System.out.println(edad);
    }
}