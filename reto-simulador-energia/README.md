# Simulador de Energía Solar

Este proyecto es un simulador simple desarrollado en Java que calcula la energía estimada generada por paneles solares basándose en su eficiencia, el área total y la radiación solar promedio diaria. También clasifica la producción de energía y determina si cubre el consumo promedio de un hogar.

## Características

- **Captura de Datos de Entrada:** Solicita al usuario la eficiencia del panel, el área total de los paneles y la radiación solar diaria promedio.
- **Validación de Entrada:** Asegura que los datos ingresados estén dentro de rangos razonables.
- **Cálculo de Energía:** Estima la energía generada en kWh/día.
- **Clasificación de Producción:** Clasifica la producción de energía como baja, media o alta.
- **Evaluación de Consumo:** Indica si la energía generada es suficiente para cubrir el consumo promedio de un hogar.

## Estructura del Proyecto

El proyecto sigue una estructura simple:

- `src/SimuladorEnergiaSolar.java`: Contiene todo el código fuente del simulador, incluyendo las clases:
    - `SimuladorEnergiaSolar`: Clase principal que orquesta la simulación.
    - `DatosEntrada`: Clase para almacenar los datos de entrada.
    - `CapturadorDatos`: Clase responsable de obtener y validar los datos del usuario.
    - `CalculadorEnergia`: Clase que realiza el cálculo de la energía generada.
    - `Clasificador`: Clase que muestra los resultados y la clasificación de la energía.
- `bin/`: Carpeta donde se guardan los archivos `.class` compilados.

## Cómo Empezar

1.  **Clonar el repositorio (si aplica).**
2.  **Compilar el código:**
    Navega al directorio `src` y compila el archivo Java:
    ```bash
    javac SimuladorEnergiaSolar.java -d ../bin
    ```
3.  **Ejecutar el simulador:**
    Navega al directorio `bin` (o asegúrate de que esté en tu classpath) y ejecuta la clase principal:
    ```bash
    java SimuladorEnergiaSolar
    ```
    Sigue las instrucciones en la consola para ingresar los datos requeridos.

## Principios de Diseño Aplicados

- **Principio de Responsabilidad Única (SRP):** Cada clase (`CapturadorDatos`, `CalculadorEnergia`, `Clasificador`) tiene una única responsabilidad.
- **Abierto/Cerrado (OCP) (parcialmente):** La clase `Clasificador` está diseñada para ser extendida fácilmente con nuevas clasificaciones o lógicas de visualización sin modificar el cálculo de energía.

# Diagrama UML

![image](https://github.com/user-attachments/assets/71d924f7-bc74-4b8c-add1-3be25ee8c383)


