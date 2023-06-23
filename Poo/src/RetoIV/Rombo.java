package RetoIV;
import java.util.Scanner;
public class Rombo extends Figuras{
    private int mayor;
    private int menor;
    public Rombo(){
    }
    Scanner capturar = new Scanner(System.in);
    public Rombo(int mayor, int menor){
        super();
        this.mayor = mayor;
        this.menor = menor;
    }
    public int getMayor() {
        return mayor;
    }
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
    public int getMenor() {
        return menor;
    }
    public void setMenor(int menor) {
        this.menor = menor;
    }
    
    public void registrarDatos(){
        System.out.println("Ingresa el valor de la diagonal mayor del rombo: ");
        mayor = capturar.nextInt();
        System.out.println("Ingresa el valor de la diagonal menor del rombo: ");
        menor = capturar.nextInt();

    }
    public void calcularArea(){
        int area = mayor*menor/2;
        System.out.println("El area del rombo es: "+area);
    }
}
