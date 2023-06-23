package RetoIII.Salud;
public class Empleado extends Persona {
    private String cargo;
    private double cHora;
    private int hTrabajadas;
    private String departamento;
    public Empleado() {

    }
    public Empleado(String tDocumento, String nombre, String apellido, String sexo, int documento, int edad, Double estatura, Double peso, String cargo, double cHora, int hTrabajadas, String departamento){
        super(tDocumento, nombre, apellido, sexo, documento, edad, estatura, peso);
        this.cargo = cargo;
        this.cHora = cHora;
        this.hTrabajadas = hTrabajadas;
        this.departamento = departamento;
    }
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getCHora() {
        return cHora;
    }
    public void setCHora(double cHora) {
        this.cHora = cHora;
    }
    public int getHTrabajadas() {
        return hTrabajadas;
    }
    public void setHTrabajadas(int hTrabajadas) {
        this.hTrabajadas = hTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void mostrarEmpleado(){
        System.out.println("_________________________________");
        System.out.println("         DATOS INGRESADOS:       ");
        System.out.println("_________________________________");
        System.out.println("Tipo Doc.: "+getTDocumento());
        System.out.println("Documento: "+getDocumento());
        System.out.println("_________________________________");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("_________________________________");
        System.out.println("Cargo: "+getCargo());
        System.out.println("Valor por hora: "+getCHora());
        System.out.println("Horas trabajadas: "+getHTrabajadas());
        System.out.println("Departamento: "+getDepartamento());
        System.out.println("_________________________________");
        System.out.println("TOTAL A PAGAR: $"+sTotal());  
    } 
    public double sTotal(){
        double sTotal = cHora * hTrabajadas;
        double reteica = sTotal * 0.00966;
        double honorarios = sTotal-reteica;
        return honorarios;
    }
}
