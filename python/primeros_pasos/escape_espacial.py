import random

bienvenida = "\nEscapa de la Prision Espacial"
print(bienvenida+"\n" +"_" * len(bienvenida)+"\n")

print("\nDurante el camino te encontraras con diferentes Opciones elige tu ruta")

opcion = input("A. Salir por la puerta esta medio abierta\nB. Salir Por la escotilla: \n")
print("_" * len(bienvenida)+"\n")
if opcion == "A":
    print("Te haz encontrado con un guardia")
    opcion = input("A. Hacerse el dormido\nB. Correr")
    if opcion == "B":
        print("El alien esta detras de ti :(, te cansaste el alien te alcanzo ")
        
    else:
        print("Te han arrestado :( ")
        
elif opcion == "B" :
    print("el paso esta libre, te haz encontrado una rata de 2mtros")
    acertijo_ok = False
    acertijo = int(input("LA RATA, te tengo unos acertijos elige un numero del 1 al 3: "))
    if acertijo == 1:
        numero = random.randint(1, 90)
        resultado =  int(input("Cual es el resultado de esta operacion: 12 * {} = ?: ".format(numero)))
        if 12 * numero == resultado:
            print("Has logrado pasar...")
            acertijo_ok = True
    elif acertijo == 2:
        numero = random.randint(1, 90)
        resultado =  int(input("Cual es el resultado de esta operacion: 4 % {} = ?: ".format(numero)))
        if 4 % numero == resultado:
            print("Has logrado pasar...")
            acertijo_ok = True
    elif acertijo == 3:
        numero = random.randint(1, 90)
        resultado =  int(input("Cual es el resultado de esta operacion: 41 - {} = ?: ".format(numero)))
        if 41 - numero == resultado:
            print("Has logrado pasar...")
            acertijo_ok = True
    else:
        print("la rata te entrego a los aliens")

opcion_palo = input("Hay un Palo en el camino:\nA.Tomal el palo.\nB. Dejarlo y seguir el camino.\n").lower
print("_" * len(bienvenida)+"\n")
print("Al pasar el acertijo sigues el camino")
if acertijo_ok != False:
    palo = False
    
    print("ANDA !!, Hay un abismo :O")
    if opcion_palo == "a":
        palo = True
        print("Usar palo para crusar :), GENIAL HAZ LOGARDO ESCAPAR")
    elif opcion_palo == "b":
        palo =  False
        print("Los alien estan cerca, andate rapido, perdiste  :(")
        print("Se acabo el tiempo, muy tarde te han pillado :(")


