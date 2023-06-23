package RetoIII.Salud;
public class Persona {
    private String tDocumento;
    private String nombre;
    private String apellido;
    private String sexo;
    private int documento;
    private int edad;
    private Double estatura;
    private Double peso;

    public Persona() {

    }

    public Persona(String tDocumento, String nombre, String apellido, String sexo, int documento, int edad, Double estatura, Double peso) {
        this.tDocumento = tDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.documento = documento;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
    public String getTDocumento() {
        return tDocumento;
    }
    public void setTDocumento(String tDocumento) {
        this.tDocumento = tDocumento;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Double getEstatura() {
        return estatura;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double calcularImc(){
        Double pActual = peso/(estatura*estatura);
        double pRedondeado = Math.round(pActual * 10.0)/10.0;
        if (pRedondeado<20){
            System.out.println("Peso bajo.");
        } else if(pRedondeado>=20 && pRedondeado<=25){
            System.out.println("Peso ideal.");
        } else if(pRedondeado>25){
            System.out.println("Sobrepeso.");
        }
        return pRedondeado;
    }
    public int mayorEdad(){
        if (edad>18) {
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("Es menor de edad.");
        }
        return edad;
    }
    
}




