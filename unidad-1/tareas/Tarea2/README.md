<div align="justify">

# Números Perfectos

Un número perfecto es aquel que es igual a la suma de sus divisores propios (excluyendo él mismo). Por ejemplo, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3, y 1 + 2 + 3 = 6.

El ejercicio consiste en escribir un programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000).

### Diagrama de Flujo

<img src="images/diagrama-tarea2.png"/>

### Pseudocódigo

- Inicio
- Inicializar variables: limInferior y limSuperior
- Escribir "Introduzca el límite inferior del rango: "
- Solicitar valor de limInferior
- Escribir "Introduzca el límite superior del rango: "
- Solicitar valor de limSuperior
- Inicializar variable __counter = 0__
- Para i = limInferior hasta limSuperior
- Inicializar variable __sum = 0__
- Para j = 1 hasta i
- Si i % j = 0, sum += j
- finSi
- finPara
- Si sum = i
- Incrementar valor de counter
- Escribir "Número perfecto " counter ": " i
- finSi
- finPara
- Fin


</div>