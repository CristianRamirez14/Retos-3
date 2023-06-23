package RetoV;
import java.util.Random;
import java.util.Scanner;

public class Ppt implements Juego {
    private int opcion;
    private int nAleatorio;
    
    public Ppt() {
    }
    public Ppt(int opcion, int nAleatorio) {
        this.opcion = opcion;
        this.nAleatorio = nAleatorio;
    }

    Scanner entrada = new Scanner(System.in);
    public void jugar() {
        System.out.println(" Realice su eleccion 1. Piedra 2. Papel 3. Tijera");
        opcion = entrada.nextInt();
        Random aleatorio = new Random();
        nAleatorio = aleatorio.nextInt(3)+1;
    }
    public void finalizar() {
        System.out.println(nAleatorio);
        if (nAleatorio==1 && opcion==1) {
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido piedra");
                System.out.println("Y la maquina escogio piedra");
                System.out.println("Has empatado ._. ");
        }
        else if (nAleatorio==2 && opcion==2){
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido papel");
                System.out.println("y la maquina escogio papel");
                System.out.println("Has empatado ._. ");
        }
        else if (nAleatorio==3 && opcion==3){
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido tijera");
                System.out.println("y la maquina escogido tijera");
                System.out.println("Has empatado ._. ");
        }
        else if ( nAleatorio==1 && opcion==2){
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido papel");
                System.out.println("Y la maquina escogio piedra");
                System.out.println("Has ganado =) ");
        }
        else if ( nAleatorio==1 && opcion==3){
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido tijera");
                System.out.println("y la maquina escogio piedra");
                System.out.println("Has perdido =( ");
        }
        else if ( nAleatorio==2 && opcion==1){
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido piedra");
                System.out.println("Y la maquina escogio papel");
                System.out.println("Has perdido =( ");
        }
        else if ( nAleatorio==2 && opcion==3){
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido tijera");
                System.out.println("Y la maquina escogio papel");
                System.out.println("Has ganado =) ");
        }
        else if ( nAleatorio==3 && opcion==1){
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido piedra");
                System.out.println("Y la maquina escogio tijera");
                System.out.println("Has ganado =) ");
        }
         else if ( nAleatorio==3 && opcion==2){
                System.out.println("_________________________________________");
                System.out.println("El jugador a escogido papel");
                System.out.println("y la maquina escogio tijera");
                System.out.println("Has perdido =( ");
         }
        }
}