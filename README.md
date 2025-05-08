# Método de Bisección

## Descripción

Este proyecto implementa el **método numérico de Bisección** para encontrar la raíz de una función continua. En este caso, la función utilizada es \( f(x) = x^2 - 2 \), y el objetivo es encontrar la raíz de la ecuación \( f(x) = 0 \) utilizando el método de Bisección. El código permite al usuario ingresar los valores de los intervalos \( a \) y \( b \), así como la tolerancia deseada para el cálculo de la raíz.

El método de bisección divide el intervalo en dos subintervalos y selecciona el que contiene la raíz. Este proceso se repite hasta que la diferencia entre los valores \( a \) y \( b \) sea menor que la tolerancia proporcionada.

## Instrucciones de uso

1. Clona este repositorio o descarga los archivos.
2. Abre una terminal o consola y navega hasta la carpeta donde se encuentra el archivo `MetodoBiseccion.java`.
3. Compila el archivo con el siguiente comando:
   ```bash
   javac MetodoBiseccion.java
