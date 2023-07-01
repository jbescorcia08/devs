from random import randint
import os

def limpiar_pantalla():
    os.system("clear")


VIDA_INICIAL_PYCACHU = 80
VIDA_INICIAL_SQUIRTLE = 90

vida_pycachu = 80
vida_squirtle = 90

while vida_pycachu > 0 and vida_squirtle > 0:
    #Inicia el combate
    input("Enter para iniciar...\n")
    limpiar_pantalla()

    print("La vida de Pycachu es de ")
    porcentaje_pycachu = "#" * int(10 *  vida_pycachu/ VIDA_INICIAL_PYCACHU)
    print("[{}] {}%".format(porcentaje_pycachu, vida_pycachu))
    print("La vida de Squirtle es de ")
    porcentaje_squirtle = "#" * int(10 * vida_squirtle / VIDA_INICIAL_SQUIRTLE)
    print("[{}] {}%\n".format(porcentaje_squirtle, vida_squirtle))



    #Turno Pycachu
    print("\nTurno Pycachu")
    ataque_pycachu = randint(1, 2)
    if ataque_pycachu == 1:
        #Bola voltio
        print("Pycachu ataca con Bola Voltio")
        vida_squirtle -= 10
    else:
        #Onda de trueno
        print("Pycachu ataca con Onda de trueno")
        vida_squirtle -= 11



    input("Enter para iniciar...")
    limpiar_pantalla()
    # Turno Squirtle
    print("Turno Squirtle")
    ataque_squirtle = None
    while ataque_squirtle != "P" and ataque_squirtle != "A" and ataque_squirtle != "B" and ataque_squirtle != "N":
        ataque_squirtle = input("Que ataque deseas realizar: [P]lacaje. [A]gua. [B]urbuja. [N]o\n")
    if ataque_squirtle == "P":
        vida_pycachu -= 12
        print("Ataca con placaje")
    elif ataque_squirtle == "A":
        print("Ataca con Pistola de Agua")
        vida_pycachu -= 10
    elif ataque_squirtle == "B":
        print("Ataca con Burbuja")
        vida_pycachu -= 9
    elif ataque_squirtle == "N":
        print("Paso")

    if vida_pycachu < 0:
        vida_pycachu = 0

    if vida_squirtle < 0:
        vida_squirtle = 0

limpiar_pantalla()
print("La vida de Pycachu es de ")
porcentaje_pycachu = "#" * int(10 *  vida_pycachu/ VIDA_INICIAL_PYCACHU)
print("[{}] {}%".format(porcentaje_pycachu, vida_pycachu))
print("La vida de Squirtle es de ")
porcentaje_squirtle = "#" * int(10 * vida_squirtle / VIDA_INICIAL_SQUIRTLE)
print("[{}] {}%\n".format(porcentaje_squirtle, vida_squirtle))

if vida_pycachu > vida_squirtle:
    print("Gana Pycachu")
else:
    print("Gana Squirtle")