""""En esta clase veremos cómo se resuelve un pequeño ejercicio , si quieres realizarlo antes por aquí te dejamos el enunciado 👇

Crea un programa que encuentre dentro de una lista de números el valor más pequeño y el más grande.  

El resultado de nuestro programa debería ser este: 12, 56, -3, 1789, 237, -45
Nº  pequeño: -45
Nº  grande: 1789"""

lista_numeros = [12, 56, -3, 1789, 237, -45]

for i in lista_numeros:
    pos = i + 1
    if i > lista_numeros.index(pos):
        temp = i
        numero_mayor = temp


print(list(numero_mayor))