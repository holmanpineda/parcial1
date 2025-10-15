# Sistema de Menú Java - Solución Parcial

## Descripción
Sistema de menú interactivo desarrollado en Java con Maven que incluye múltiples validadores y funcionalidades.

## Funcionalidades

### ✅ Implementadas
1. **Validador de Mayoría de Edad** - Verifica si una persona es mayor de edad
2. **Validador de Números Perfectos** - Determina si un número es perfecto usando recursión
3. **Validador de Palíndromos** - Verifica si una palabra es un palíndromo
4. **Sistema de Caballeros del Zodiaco** - Gestión de caballeros con armaduras y batallas

### 🚧 Por Implementar
5. Validador de Capicúa
6. Conversor de Morse a Texto
7. Conversor de Texto a Morse
8. Juego Libre
9. Zodiaco por mes y año de nacimiento

## Estructura del Proyecto

```
src/main/java/org/yourcompany/parcial1/
├── Solucionparcial.java      # Clase principal
├── Menu.java                 # Sistema de menú interactivo
├── Numeroperfecto.java       # Validador de números perfectos
├── Validadoredad.java        # Validador de mayoría de edad
├── Validadorpalindromo.java  # Validador de palíndromos
├── Caballero.java           # Clase para caballeros del zodiaco
├── Armadura.java            # Clase base para armaduras
├── Bronce.java              # Armadura de bronce
├── Plata.java               # Armadura de plata
├── Oro.java                 # Armadura de oro
└── Batalla.java             # Sistema de batallas
```

## Requisitos
- Java 24 o superior
- Maven 3.6+

## Compilación y Ejecución

### Compilar el proyecto
```bash
javac -d target/classes src/main/java/org/yourcompany/parcial1/*.java
```

### Ejecutar el programa
```bash
java -cp target/classes org.yourcompany.parcial1.Solucionparcial
```

### Usando Maven
```bash
mvn compile exec:java
```

## Características Técnicas

- **Recursión**: Implementada en el validador de números perfectos
- **Manejo de Scanner**: Centralizado para evitar conflictos de entrada
- **Arquitectura modular**: Cada funcionalidad en su propia clase
- **Manejo de errores**: Validación de entrada robusta

## Autor
holmanpineda

## Licencia
Este proyecto es de uso educativo.