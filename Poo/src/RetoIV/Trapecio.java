package RetoIV;
import java.util.Scanner;
public class Trapecio extends Figuras{
    private int mayor;
    private int menor;
    private int altura;
    public Trapecio(){
    }
    Scanner capturar = new Scanner(System.in);
    public Trapecio(int mayor, int menor, int altura){
        super();
        this.mayor = mayor;
        this.menor = menor;
        this.altura = altura;
    }
    public int getMayor() {
        return mayor;
    }
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
    public int getMenor() {
        return mayor;
    }
    public void setMenor(int menor) {
        this.menor = menor;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void registrarDatos(){
        System.out.println("Ingresa el valor de la base mayor del trapecio: ");
        mayor = capturar.nextInt();
        System.out.println("Ingresa el valor de la base menor del trapecio: ");
        menor = capturar.nextInt();
        System.out.println("Ingresa el valor de la altura del trapecio: ");
        altura = capturar.nextInt();
    }
    public void calcularArea(){
        int area = (mayor + menor)*altura/2;
        System.out.println("El area del trapecio es: "+area);
    }
    
}