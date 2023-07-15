lista_numeros = [12,35,4,67,-54,1]


numero_mayor = 0
numero_menor = 0

for i in lista_numeros:
    if i > numero_mayor:
        numero_mayor = i
    elif i < numero_menor:
        numero_menor = i
print("Numero mayor: {}\nNumero menor: {}".format(numero_mayor,numero_menor))