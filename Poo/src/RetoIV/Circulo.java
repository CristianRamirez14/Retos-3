package RetoIV;
import java.util.Scanner;
public class Circulo extends Figuras{
    private double radio;
    public Circulo(){
    }
    Scanner capturar = new Scanner(System.in);
    public Circulo(double radio){
        super();
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void registrarDatos(){
        System.out.println("Ingresa el radio del circulo: ");
        radio = capturar.nextInt();
    }
    public void calcularArea(){
        double area = 3.1416 * (radio*2);
        System.out.println("El area del circulo es: "+area);
    }   
}





