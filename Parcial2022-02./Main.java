import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear pasajeros iniciales
        Pasajero pasajero1 = new Pasajero("Juan", "Pérez", "123456", "1A", 30);
        Pasajero pasajero2 = new Pasajero("Ana", "Gómez", "654321", "2B", 25);
        Pasajero pasajero3 = new Pasajero("Luis", "Martínez", "789012", "3C", 40);

        // Crear un vuelo
        Vuelo vuelo1 = new Vuelo("AV123", "Bogotá", "Cali", 0);

        // Agregar los pasajeros al vuelo
        vuelo1.agregarPasajero(pasajero1);
        vuelo1.agregarPasajero(pasajero2);
        vuelo1.agregarPasajero(pasajero3);

        // Mostrar información inicial del vuelo y los pasajeros
        mostrarInformacionVuelo(vuelo1);

        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Desea crear un nuevo pasajero (1) o un nuevo vuelo (2)? (0 para salir)");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1: // Crear nuevo pasajero
                    System.out.print("Ingrese los nombres del pasajero: ");
                    String nombres = scanner.nextLine();
                    System.out.print("Ingrese los apellidos del pasajero: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese el número de pasaporte: ");
                    String numeroDePasaporte = scanner.nextLine();
                    System.out.print("Ingrese el asiento: ");
                    String asiento = scanner.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer

                    Pasajero nuevoPasajero = new Pasajero(nombres, apellidos, numeroDePasaporte, asiento, edad);
                    vuelo1.agregarPasajero(nuevoPasajero);
                    break;

                case 2: // Crear nuevo vuelo
                    System.out.print("Ingrese el código del vuelo: ");
                    String codigoVuelo = scanner.nextLine();
                    System.out.print("Ingrese el origen del vuelo: ");
                    String origen = scanner.nextLine();
                    System.out.print("Ingrese el destino del vuelo: ");
                    String destino = scanner.nextLine();
                    Vuelo nuevoVuelo = new Vuelo(codigoVuelo, origen, destino, 0);
                    // Puede agregar lógica para gestionar vuelos aquí
                    break;

                case 0: // Salir
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            // Mostrar información del vuelo y los pasajeros después de cada operación
            mostrarInformacionVuelo(vuelo1);
        }

        scanner.close();
    }

    private static void mostrarInformacionVuelo(Vuelo vuelo) {
        System.out.println("Vuelo: " + vuelo.getCodigo() + " de " + vuelo.getOrigen() + " a " + vuelo.getDestino());
        System.out.println("Pasajeros en el vuelo:");
        for (int i = 0; i < vuelo.getDisponibilidad(); i++) {
            Pasajero p = vuelo.getPasajeros()[i];
            System.out.println("- " + p.getNombres() + " " + p.getApellidos() + " (Pasaporte: " + p.getNumeroDePasaporte() + ")");
        }
    }
}
