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
11. Sino, Finalizar programa
12. FinSi
13. Fin

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
13. FinSi
14. "El MCD de " __valorA__ " y " __valorB__ " es: " __mcd__
15. Fin

</div>
