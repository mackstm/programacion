<div align="justify">

# Creación de métodos y pruebas

## Índice

1. [Ejercicio 1](#ejercicio1)
2. [Ejercicio 2](#ejercicio2)
3. [Ejercicio 3](#ejercicio3)
    - [Mostrar números](#ejercicio3-1)
    - [Mostrar suma](#ejercicio3-2)
    - [Orden creciente](#ejercicio3-3)
    - [Orden decreciente](#ejercicio3-4)

## Ejercicio 1 <a name="ejercicio1"></a>

Realizar un programa que calcule el sueldo de un trabajador, el programa debe de tener un método que reciba el numero de
horas que has trabajado en un mes, las horas se pagan a 10€.

#### Pseudocódigo

1. Pasar parámetro: __horas__
2. Retornar __horas * 10__

## Ejercicio 2 <a name="ejercicio2"></a>

Realiza un programa que tenga un método al que se le pase un número e indique si es positivo o negativo y si es par o
impar.

#### Pseudocódigo

1. Pasar parámetro: __número__
2. Inicializar cadena de texto: __resultado = "Número es negativo"__
2. Si el parámetro __número >= 0__
3. resultado = "Número es positivo"
4. FinSi
5. Si __numero % 2 = 0__
6. __resultado = resultado concatenado con " y par"__
7. Sino
8. __resultado = resultado concatenado con " e impar"__
9. Retornar __resultado__

## Ejercicio 3 <a name="ejercicio3"></a>

Realiza un programa que contenga los suficientes métodos para: pedir 5 números, mostrar los 5 números, muestra la suma y
los muestra en orden creciente y en orden decreciente.

### Mostrar números <a name="ejercicio3-1"></a>

#### Pseudocódigo

1. Pasar lista como parámetro: __números__
2. Inicializar cadena de texto: __resultado__
3. Recorrer lista y añadir cada elemento a __resultado__
4. Retornar __resultado__

### Mostrar suma <a name="ejercicio3-2"></a>

#### Pseudocódigo

1. Pasar lista como parámetro: __números__
2. Inicializar: __suma = 0__
3. Recorrer lista y sumar elementos: __suma = suma + elemento__
4. Retornar __suma__

### Orden creciente <a name="ejercicio3-3"></a>

#### Pseudocódigo

1. Pasar lista como parámetro: __números__
2. Ordenar números de menor a mayor
3. Retornar cadena de lista ordenada

### Orden decreciente <a name="ejercicio3-4"></a>

#### Pseudocódigo

1. Pasar lista como parámetro: __números__
2. Ordenar números de mayor a menor
3. Retornar cadena de lista ordenada

</div>