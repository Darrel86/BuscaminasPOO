# Buscaminas POO

## Descripción

Buscaminas es un juego desarrollado en Java aplicando los principios de Programación Orientada a Objetos (POO). El objetivo del juego es descubrir todas las casillas seguras de un tablero de 10x10 evitando las minas ocultas.

El proyecto fue desarrollado utilizando el patrón de arquitectura MVC (Modelo - Vista - Controlador), implementando conceptos como encapsulamiento, herencia, polimorfismo, interfaces, manejo de excepciones, persistencia de datos y pruebas unitarias.

---

## Características

* Tablero de 10x10 casillas.
* Generación aleatoria de 10 minas.
* Descubrimiento de casillas mediante coordenadas.
* Descubrimiento automático de zonas vacías.
* Marcado de posibles minas.
* Detección de victoria y derrota.
* Menú principal para iniciar o salir del juego.
* Manejo de excepciones personalizadas.
* Persistencia mediante serialización.
* Pruebas unitarias con JUnit 5.
* Implementación del patrón MVC.

---

## Estructura del Proyecto

### Modelo

Contiene la lógica principal del juego.

* Casilla
* CasillaNormal
* CasillaMina
* Tablero
* Juego

### Vista

Gestiona la visualización del tablero en consola.

* ConsolaVista

### Controlador

Gestiona la interacción entre el usuario y el juego.

* JuegoControlador

### Excepciones

Contiene las excepciones personalizadas.

* CasillaYaDescubiertaException

### Interfaces

Define comportamientos comunes.

* Descubrible

### Persistencia

Permite guardar y recuperar información mediante serialización.

* GestorArchivos

### Pruebas

Contiene las pruebas unitarias realizadas con JUnit.

* TableroTest

---

## Tecnologías Utilizadas

* Java
* Eclipse IDE
* GitHub
* JUnit 5

---

## Ejecución

1. Abrir el proyecto en Eclipse.
2. Ejecutar la clase `JuegoControlador`.
3. Seleccionar la opción **Nueva Partida**.
4. Ingresar coordenadas para descubrir casillas.

Ejemplos:

```text
A5
B7
C10
```

Para marcar una posible mina:

```text
M A5
```

---

## Reglas del Juego

* Si el jugador descubre una mina, pierde la partida.
* Si descubre todas las casillas seguras, gana la partida.
* Las casillas muestran el número de minas adyacentes.
* Las zonas vacías se descubren automáticamente.

---

## Conceptos de Programación Orientada a Objetos Aplicados

### Encapsulamiento

Los atributos de las clases se encuentran protegidos mediante métodos de acceso.

### Herencia

Las clases `CasillaNormal` y `CasillaMina` heredan de la clase abstracta `Casilla`.

### Polimorfismo

Las diferentes implementaciones de `esMina()` permiten comportamientos específicos según el tipo de casilla.

### Interfaces

La interfaz `Descubrible` define el comportamiento común para las casillas.

### Manejo de Excepciones

Se implementó la excepción personalizada `CasillaYaDescubiertaException`.

### Persistencia

Se utilizó serialización para almacenar información del juego.

### Pruebas Unitarias

Se realizaron pruebas utilizando JUnit 5 para verificar la correcta creación del tablero.

---

## Autor

Darwin Torres

Proyecto desarrollado para la asignatura de Programación Orientada a Objetos.
