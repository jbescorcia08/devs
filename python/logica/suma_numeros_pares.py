def suma_numeros_pares():
    numero = int(input("Ingresa un numero: "))
    suma = 0
    seguir = True

    while(seguir):
        if numero % 2 == 0:
            suma = suma + numero


        d_seguir = input("Desea seguir?: ").lower()
        if "no" in d_seguir:
            seguir = False
        else:
            print("error en la suma tiene que se un numero par. ")

    print(suma)


suma_numeros_pares();



