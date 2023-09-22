## Ejercicio 1 <a name="ejercicio1"></a>

Desarrolle un algoritmo que permita leer dos valores distintos, determinar cual de los dos valores es el
mayor y escribirlo.

### Diagrama de Flujo

<img src="img/diagrama-flujo-01.png"/>

### Pseudocódigo

Pasos:

- Inicio
- Inicializar variables: __A = 0, B = 0__
- Solicitar la introducción de dos valores distintos
- Leer los dos valores
- Asignarlos a las variables A y B
- Si __A = B__ Entonces vuelve a 3 porque los valores deben ser distintos
- Si __A > B__ Entonces
- Escribir __A, “Es el mayor”__
- De lo contrario: Escribir __B, “Es el mayor”__
- Fin_Si
- Fin