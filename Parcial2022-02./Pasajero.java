public class Pasajero {
    // Atributos
    private String nombres;
    private String apellidos;
    private String numeroDePasaporte;
    private String asiento;
    private int edad;

    // Constructor por defecto
    public Pasajero() {
    }

    // Constructor con parámetros
    public Pasajero(String nombres, String apellidos, String numeroDePasaporte, String asiento, int edad) {
        if (nombres.isEmpty() || apellidos.isEmpty() || numeroDePasaporte.isEmpty()) {
            throw new IllegalArgumentException("Nombres, apellidos y número de pasaporte no pueden estar vacíos.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser menor a 0.");
        }
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroDePasaporte = numeroDePasaporte;
        this.asiento = asiento;
        this.edad = edad;
    }

    // Métodos set y get para cada atributo
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDePasaporte() {
        return numeroDePasaporte;
    }

    public void setNumeroDePasaporte(String numeroDePasaporte) {
        this.numeroDePasaporte = numeroDePasaporte;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
