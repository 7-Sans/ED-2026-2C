package ed2026.TP1;

public class Paciente {
    // Atributes
    private String _nombre;
    private String _dni;
    private double _peso;
    private double _altura;

    // Constructors
    public Paciente(){

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
        String dniLimpio = dni.replace(".", "").trim();
        _dni = dniLimpio;
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
