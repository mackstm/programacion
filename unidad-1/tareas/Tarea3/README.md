<div align="justify">

# Tarea 2 PRO

## Índice

- [Ejercicio 1](#ejercicio01)
- [Ejercicio 2](#ejercicio02)
- [Ejercicio 3](#ejercicio03)
- [Ejercicio 4](#ejercicio04)
- [Ejercicio 5](#ejercicio05)
- [Ejercicio 6](#ejercicio06)
- [Ejercicio 7](#ejercicio07)
- [Ejercicio 8](#ejercicio08)
- [Ejercicio 9](#ejercicio09)
- [Ejercicio 10](#ejercicio10)

## Ejercicio 1 <a name="ejercicio01"></a>

Escribe un programa en Java que imprima el patrón siguiente:

1

2 3

4 5 6

7 8 9 10

### Diagrama de Flujo

<img src="images/diagrama-tarea3-01.png"/>

### Pseudocódigo

1. Inicio
2. Inicializar __sum = 1__, i = 0, j = 0
3. Escribir: __sum__ " "
4. __sum = sum + 1__
5. __j = j + 1__
6. Si __j <= i__, repetir desde el paso 3
7. De lo contrario, escribir un doble salto de línea
8. FinSi
9. __i = i + 1__
10. Si __i < 4__, repetir desde el paso 3
11. FinSi
12. Fin

## Ejercicio 2 <a name="ejercicio02"></a>

Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.

### Diagrama de Flujo

<img src="images/diagrama-tarea3-02.png"/>

### Pseudocódigo

1. Inicio
2. Escribir "Introduzca el valor de A: "
3. Leer __valorA__ por teclado
4. Escribir "Introduzca el valor de B: "
5. Leer __valorB__ por teclado
6. Inicializar: __mcd = 1__, __i = 1__
7. Si __i <= valorA__ e __i <= valorB__
8. Si __valorA % i = 0__ y __valorA % i = 0__
9. __mcd = i__
11. FinSi
12. __i = i + 1__
13. Repetir desde el paso 7
14. FinSi
15. "El MCD de " __valorA__ " y " __valorB__ " es: " __mcd__
16. Fin

## Ejercicio 3 <a name="ejercicio03"></a>

Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.

### Diagrama de Flujo

<img src="images/diagrama-tarea3-03.png"/>

### Pseudocódigo

1. Inicio
2. Escribir "Introduzca la posición del número de Fibonacci: "
3. Leer __posicion__ por teclado
4. Inicializar: __fibo1 = 0__, __fibo2 = 1__, __i = 1__
5. __fibo2 = fibo1 + fibo2__
6. __fibo1 = fibo2 - fibo1__
7. __i = i + 1__
8. Si __i < posicion__ repetir desde el paso 5
9. Escribir "El número de Fibonacci de la posición " __posicion__ " es: " __fibo1__
10. Fin

## Ejercicio 4 <a name="ejercicio04"></a>

Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.

### Diagrama de Flujo

<img src="images/diagrama-tarea3-04.png"/>

### Pseudocódigo

1. Inicio
2. Escribir "Introduzca un número: "
3. Leer __numero__ por teclado
4. Inicializar: __resto__, __inverso = 0__, __auxiliar = numero__
5. Si __auxiliar > 0__
6. __resto = auxiliar % 10__
7. __inverso = (inverso * 10) + resto__
8. __auxiliar = auxiliar / 10__
9. Repetir desde el paso 5
10. FinSi
11. Si __inverso = numero__
12. Escribir __numero__ " es palíndromo"
13. Sino
14. Escribir __numero__ " no es palíndromo"
15. FinSi
16. Fin

## Ejercicio 5 <a name="ejercicio05"></a>

Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.

### Diagrama de Flujo

<img src="images/diagrama-tarea3-05.png"/>

### Pseudocódigo

1. Inicio
2. Escribir "Introduzca la posición del número de Fibonacci: "
3. Leer __limit__ por teclado
4. Inicializar: __fibo1 = 0__, __fibo2 = 1__, __i = 0__
5. Escribir __fibo1__ " "
6. __fibo2 = fibo1 + fibo2__
7. __fibo1 = fibo2 - fibo1__
8. __i = i + 1__
9. Si __i < limit__ repetir desde el paso 5
10. Fin

## Ejercicio 6 <a name="ejercicio06"></a>

Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.

### Diagrama de Flujo

<img src="images/diagrama-tarea3-06.png"/>

### Pseudocódigo

1. Inicio
2. Inicializar __i = 1__
3. Inicializar: __auxiliar = i__, __mult = 0__, __result = 0__
4. Si __auxiliar > 0__
5. __mult = auxiliar % 10__
6. __result = result + (mult * mult * mult)__
7. __auxiliar = auxiliar / 10__
8. Repetir desde el paso 4
9. FinSi
10. Si __result = i__
11. Escribir i
12. FinSi
13. i = i + 1
14. Si __i <= 1000__
15. Repetir desde el paso 3
16. FinSi
17. Fin

## Ejercicio 7 <a name="ejercicio07"></a>

Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch. El día a verificar se debe de pedir por teclado.

### Diagrama de Flujo

<img src="images/diagrama-tarea3-07.png"/>

### Pseudocódigo

1. Inicio
2. Escribir "Introduzca el número correspondiente al día de la semana deseado:"
3. Leer __numDia__ por teclado
4. Switch __numDia__
5. Caso 1: Escribir "Lunes" y finalizar programa
6. Caso 1: Escribir "Martes" y finalizar programa
7. Caso 1: Escribir "Miércoles" y finalizar programa
8. Caso 1: Escribir "Jueves" y finalizar programa
9. Caso 1: Escribir "Viernes" y finalizar programa
10. Caso 1: Escribir "Sábado" y finalizar programa
11. Caso 1: Escribir "Domingo" y finalizar programa
12. Por defecto: Escribir "El número introducido no corresponde a ningún día de la semana."
13. Fin

## Ejercicio 8 <a name="ejercicio08"></a>

Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.

### Diagrama de Flujo

<img src="images/diagrama-tarea3-08.png"/>

### Pseudocódigo

1. Inicio
2. Escribir "Introduzca el límite inferior del rango: "
3. Solicitar valor de limInferior
4. Escribir "Introduzca el límite superior del rango: "
5. Solicitar valor de limSuperior
6. Inicializar: __counter = 0__, __i = limInferior__, __j = 1__
7. Inicializar: __sum = 0__
8. Si __i % j = 0__
9. __sum = sum + j__
10. FinSi
11. __j = j + 1__
12. Si __j < i__
13. Repetir desde el paso 8
14. FinSi
15. Si __sum = i__
16. __counter = counter + 10__
17. Escribir "Número perfecto " counter ": " i
18. FinSi
19. i = i + 1
20. Si __i < limSuperior__
21. Repetir desde el paso 7
22. FinSi
23. Fin

## Ejercicio 9 <a name="ejercicio09"></a>

Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.

### Diagrama de Flujo

<img src="images/diagrama-tarea3-09.png"/>

### Pseudocódigo

</div>
