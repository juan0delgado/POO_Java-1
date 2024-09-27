public class Vuelo {
    // Atributos
    private String codigo;
    private String origen;
    private String destino;
    private Pasajero[] pasajeros;
    private int disponibilidad; // Número de pasajeros actuales

    // Constructor por defecto
    public Vuelo() {
        this.pasajeros = new Pasajero[100]; // Inicializa el arreglo de pasajeros con tamaño 100
        this.disponibilidad = 0; // Inicializa la disponibilidad
    }

    // Constructor con parámetros
    public Vuelo(String codigo, String origen, String destino, int disponibilidad) {
        if (codigo.isEmpty() || origen.isEmpty() || destino.isEmpty()) {
            throw new IllegalArgumentException("Código, origen y destino no pueden estar vacíos.");
        }
        if (disponibilidad < 0) {
            throw new IllegalArgumentException("La disponibilidad no puede ser negativa.");
        }
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.disponibilidad = disponibilidad;
        this.pasajeros = new Pasajero[100]; // Inicializa el arreglo de pasajeros
    }

    // Método para agregar un pasajero
    public void agregarPasajero(Pasajero pasajero) {
        if (disponibilidad < 100) { // Verifica si hay espacio disponible
            this.pasajeros[disponibilidad] = pasajero; // Añade el pasajero al arreglo
            disponibilidad++; // Incrementa el número de pasajeros
        } else {
            System.out.println("No hay más espacio en el vuelo para agregar otro pasajero.");
        }
    }

    // Getters y Setters para los atributos
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
