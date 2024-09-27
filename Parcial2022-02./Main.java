public class Main {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero1 = new Pasajero("Juan", "Pérez", "123456", "1A", 30);

        // Crear un vuelo
        Vuelo vuelo1 = new Vuelo("AV123", "Bogotá", "Cali", 0);

        // Agregar el pasajero al vuelo
        vuelo1.agregarPasajero(pasajero1);

        // Mostrar información del vuelo y los pasajeros
        System.out.println("Vuelo: " + vuelo1.getCodigo() + " de " + vuelo1.getOrigen() + " a " + vuelo1.getDestino());
        System.out.println("Pasajeros en el vuelo:");
        for (int i = 0; i < vuelo1.getDisponibilidad(); i++) {
            Pasajero p = vuelo1.getPasajeros()[i];
            System.out.println("- " + p.getNombres() + " " + p.getApellidos() + " (Pasaporte: " + p.getNumeroDePasaporte() + ")");
        }
    }
}
