package RetoIII.Principal;
import java.util.Scanner;

import RetoIII.Salud.Empleado;
public class Inicio {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        Empleado trabajador = new Empleado();
        System.out.println("____________________________________________");
        System.out.println("Ingrese el tipo de documento: ");
        trabajador.setTDocumento(capturar.next());
        System.out.println("Ingrese el documento: ");
        trabajador.setDocumento(capturar.nextInt());
        capturar.nextLine();
        System.out.println("____________________________________________");
        System.out.println("Ingrese su nombre: ");
        trabajador.setNombre(capturar.nextLine());
        System.out.println("Ingrese su apellido: ");
        trabajador.setApellido(capturar.nextLine());
        System.out.println("Ingresa cuantos años tienes: ");
        trabajador.setEdad(capturar.nextInt());
        System.out.println("Ingresa cuantos años tienes: ");
        trabajador.setEdad(capturar.nextInt());
        System.out.println("____________________________________________");
        System.out.println("Ingrese el cargo que desempeña: ");
        trabajador.setCargo(capturar.nextLine());
        System.out.println("Ingrese el costo por horas trabajadas: ");
        trabajador.setCHora(capturar.nextDouble());
        System.out.println("Ingrese las horas trabajadas: ");
        trabajador.setHTrabajadas(capturar.nextInt());
        capturar.nextLine();
        System.out.println("____________________________________________");
        System.out.println("Ingrese el departamento donde se encuentra: ");
        trabajador.setDepartamento(capturar.nextLine());
        trabajador.mostrarEmpleado();
        System.out.println("____________________________________________");
        capturar.close();
    }
}
