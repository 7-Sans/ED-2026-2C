package ed2026.TP1;

<<<<<<< HEAD
public class Paciente {
    // Atributes
    private String _nombre;
    private String _dni;
    private double _peso;
    private double _altura;

    // Constructors
    public Paciente(){
        _nombre = "John";
        _dni = "76435234";
        _peso = 72; // kg
        _altura = 172; // cm
    }
    public Paciente(String nombre, String dni, double peso){
        _nombre = nombre;
        _dni = dni;
        _peso = peso;
        _altura = 170;
    }
    public Paciente(String nombre, String dni, double peso, double altura){
        _nombre = nombre;
        _dni = dni;
        _peso = peso;
        _altura = altura;
    }

    // Getter y Setter
    public String getNombre(){return _nombre;}

    public String getDni(){return _dni;}

    public void setDni(String dni){
        _dni = dni.replace(".", "").trim();
    }

    public double getPeso(){return _peso;}

    public double getAltura(){return _altura;}

    public void setAltura(double altura){
        if (altura < 0){
            throw new IllegalArgumentException("La altura no puede ser negativa.");
        }
        _altura = altura;
    }

    // Methods
    public double calcularImc(){
        return _peso / (_altura * _altura);
    }

    public String obtenerEstadoNutricional(){
        double imc = calcularImc();

        if(imc < 18.5){
            return "Bajo peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else{
            return "Obesidad";
        }
    }
}
=======
/**
 * Representa la información de salud básica de un paciente.
 */
public class Paciente {
    private String nombre;
    private String dni;
    private double peso;
    private double altura;
    //atributos / getters setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero.");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero."); //exepcion para evitar negativos
        }
        this.altura = altura;
    }
    //calculo
    public double calcularImc() {
        return peso / (altura * altura);
    }
    //metodo para calcular imc
    public String obtenerEstadoNutricional() {
        double imc = calcularImc();

        if (imc < 18.5) {
            return "Bajo peso";
        }
        if (imc < 25) {
            return "Normal";
        }
        if (imc < 30) {
            return "Sobrepeso";
        }
        return "Obesidad";
    }
}

>>>>>>> upstream/main
