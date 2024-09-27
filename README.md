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
+ el main, crea a unos pasajeros con defecto, colocandolos en la clase pasajeros, con sus atributos especificos, como apellido, nombre etc:
+ .
+ ![image](https://github.com/user-attachments/assets/5bee23fe-725f-417d-9d00-58d6a725dd96)

+.
+ Despues el codigo da la opcion de crear nuevos pasajeros, u vuelos, en este caso de pasajeros preguntara: 
+ .
+ ![image](https://github.com/user-attachments/assets/cd838fb4-1fb3-4566-9be1-4e4bc0c6578f)
+  .
+  y en consolo se imprime, solo nombre, apellido, y pasaporte del pasajero, por vuelo.
+ .
+ ![image](https://github.com/user-attachments/assets/e9d6fc95-305b-44a5-bb76-9f84f32a5bbb)
+  .
+  ahora compilalo:


1. Compila y ejecuta el archivo, al descargar los archivos pasajeros. java y vuelo.java, y `Main.java`, y compila este mismo.



## Conclusión

Este proyecto es una introducción a la POO en Java y demuestra cómo se pueden crear y gestionar objetos en un sistema simple.
