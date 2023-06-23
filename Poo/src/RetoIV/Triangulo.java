package RetoIV;
import java.util.Scanner;
public class Triangulo extends Figuras{
    private int base;
    private int altura;
    public Triangulo() {
    }
    Scanner capturar = new Scanner(System.in);
    public Triangulo(int base, int altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void registrarDatos(){
        System.out.println("Ingresa la base del triangulo: ");
        base = capturar.nextInt();
        System.out.println("Ingresa la altura del triangulo: ");
        altura = capturar.nextInt();
    }
    public void calcularArea(){
        int area = (base*altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }
}
