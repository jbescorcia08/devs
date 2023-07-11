numero = int(input("ingresa un numero positivo: "))
if numero > 0:
    for i in range(numero):
        suma = i + numero
        print("La suma es: {} + {} =  {}".format(i,numero,suma))
else:
    print("Numero no valido Intenta de nuevo!")
