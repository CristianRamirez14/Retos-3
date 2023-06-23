package RetoIV;
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        int opcion;
        int respuesta=0;
        Scanner capturar = new Scanner(System.in);
        do {
            System.out.println("_______________________________________________________");
            System.out.println("     Ingrese la figura que quieres averiguar el area.  ");
            System.out.println("1. Circulo. 2. Rombo. 3.Triangulo. 4.Trapecio. 5.Salir.");
            System.out.println("_______________________________________________________");
            opcion = capturar.nextInt();      
            switch (opcion) {
                case 1:
                    do {
                        Circulo circulo = new Circulo();
                        circulo.registrarDatos();
                        circulo.calcularArea();
                        System.out.println("___________________________________________________________");
                        System.out.println("¿Quieres calcular el area de la misma figura?");
                        System.out.println("1. Si. 2.No.");
                        respuesta = capturar.nextInt();
                    } while (respuesta==1);
                    break;
                case 2:
                    do {
                        Rombo rombo = new Rombo();
                        rombo.registrarDatos();
                        rombo.calcularArea();
                        System.out.println("___________________________________________________________");
                        System.out.println("¿Quieres calcular el area de la misma figura?");
                        System.out.println("1. Si. 2.No.");
                        respuesta = capturar.nextInt();
                    } while (respuesta==1);
                    break;
                case 3:
                    do {
                        Triangulo triangulo = new Triangulo();
                        triangulo.registrarDatos();
                        triangulo.calcularArea();
                        System.out.println("___________________________________________________________");
                        System.out.println("¿Quieres calcular el area de la misma figura?");
                        System.out.println("1. Si. 2.No.");
                        respuesta = capturar.nextInt();
                        
                    } while (respuesta==1);
                    break;
                case 4:
                    do {
                        Trapecio Trapecio = new Trapecio();
                        Trapecio.registrarDatos();
                        Trapecio.calcularArea();
                        System.out.println("___________________________________________________________");
                        System.out.println("¿Quieres calcular el area de la misma figura?");
                        System.out.println("1. Si. 2.No.");
                        respuesta = capturar.nextInt();  
                        
                    } while (respuesta==1);
                    break;
                case 5:
                System.out.println("___________________________________________________________");
                    System.out.println("Haz decidido salir del programa.");
                    break;        
                default:
                    while(opcion<0 || opcion>5){
                        System.out.println("___________________________________________________________");
                        System.out.println("LA OPCION QUE ESCRIBISTE NO EXISTE");
                        System.out.println("Escribe una opcion valida porfavor.");
                        opcion = capturar.nextInt();
                    }
                    break;
            }
        } while (opcion!=5);
        capturar.close();
    }
}
