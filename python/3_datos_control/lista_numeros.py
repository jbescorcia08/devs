""""En esta clase veremos cómo se resuelve un pequeño ejercicio , si quieres realizarlo antes por aquí te dejamos el enunciado 👇

Crea un programa que encuentre dentro de una lista de números el valor más pequeño y el más grande.  

El resultado de nuestro programa debería ser este: 12, 56, -3, 1789, 237, -45
Nº  pequeño: -45
Nº  grande: 1789"""

lista_numeros = [12, 56, -3, -1789, 237, -45]
numero_mayor = float('-inf')  # Initialize with smallest possible value
numero_menor = float('inf')   # Initialize with largest possible value

for i in lista_numeros:
    if i > numero_mayor:
        numero_mayor = i
    if i < numero_menor:
        numero_menor = i

print("Número Mayor: {}, Número Menor: {}".format(numero_mayor, numero_menor))
