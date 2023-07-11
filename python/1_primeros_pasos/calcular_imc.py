import math
peso = float(input("Ingresa tu peso: "))
altura = float(input("Ingresa tu altura: "))


imc = peso / math.pow(altura, 2)

print("Tu indice de masa corporar es de: {}".format(imc))