# POO_Java-1
## Integrantes:
+ Juan David Delgado Burbano.
+  Nicolas Martinez.
+  Camila Ariza.

## Taller POO java #1:
## ¿Qué es POO?

La Programación Orientada a Objetos (POO) es un paradigma de programación que utiliza "objetos" para representar datos y comportamientos. Se basa en conceptos como clases, objetos, herencia, encapsulamiento y polimorfismo.

## Descripción del Código

Este proyecto consiste en un sistema básico para gestionar vuelos y pasajeros. Se implementan las clases `Pasajero` y `Vuelo`, que encapsulan los atributos y comportamientos relevantes.
**Clase**: Una clase es una plantilla o modelo que define las propiedades (atributos) y comportamientos (métodos) que tendrán los objetos que se creen a partir de ella. En este proyecto, las clases `Pasajero` y `Vuelo` son ejemplos de cómo se estructuran los datos y las funcionalidades.

- **Constructor**: Un constructor es un método especial que se utiliza para crear instancias de una clase. Se llama automáticamente cuando se crea un objeto y se usa para inicializar los atributos del objeto. Por ejemplo, el constructor `Pasajero(String nombre, String documento)` inicializa un nuevo objeto `Pasajero` con un nombre y un documento específicos.

- **Getters**: Los getters son métodos que permiten acceder a los valores de los atributos de un objeto. Proporcionan una forma controlada de obtener información de un objeto sin permitir que se modifiquen directamente sus atributos. Por ejemplo, `getNombre()` es un getter que devuelve el nombre del pasajero.
### Clases

- **Pasajero**: Representa a un pasajero y contiene los siguientes atributos:
  - `nombre`: El nombre del pasajero.
  - `documento`: El documento de identidad del pasajero.
  
  **Métodos**:
  - Constructor: `Pasajero(String nombre, String documento)`
  - Getters: `getNombre()`, `getDocumento()`
  - `toString()`: Método para representar el pasajero como una cadena.

- **Vuelo**: Representa un vuelo y contiene los siguientes atributos:
  - `numeroVuelo`: El número del vuelo.
  - `origen`: El lugar de origen del vuelo.
  - `destino`: El destino del vuelo.
  
  **Métodos**:
  - Constructor: `Vuelo(String numeroVuelo, String origen, String destino)`
  - Getters: `getNumeroVuelo()`, `getOrigen()`, `getDestino()`
  - `toString()`: Método para representar el vuelo como una cadena.

### Uso del Código

El programa inicializa una lista de pasajeros y vuelos, muestra los existentes y permite al usuario crear nuevos pasajeros o vuelos. Se utilizan `ArrayList` para almacenar múltiples objetos y se permite al usuario interactuar con el sistema mediante un menú simple.

### Cómo Ejecutar el Proyecto

1. Clona el repositorio en tu máquina local.
2. Asegúrate de tener Java instalado.
3. Compila y ejecuta el archivo `Main.java`.

## Conclusión

Este proyecto es una introducción a la POO en Java y demuestra cómo se pueden crear y gestionar objetos en un sistema simple.
