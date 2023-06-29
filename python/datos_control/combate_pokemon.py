from random import randint

vida_pycachu = 80
vida_squirtle = 90

while vida_pycachu > 0 and vida_squirtle > 0:
    #Inicia el combate
    input("Enter para iniciar...\n")
    print("La vida de Pycachu es de {} y la vida de Squirtle es {}\n".format(vida_pycachu,vida_squirtle))

    input("Enter para iniciar...")
    #Turno Pycachu
    print("Turno Pycachu")
    ataque_pycachu = randint(1, 2)
    if ataque_pycachu == 1:
        #Bola voltio
        print("Pycachu ataca con Bola Voltio")
        vida_squirtle -= 10
    else:
        #Onda de trueno
        print("Pycachu ataca con Onda de trueno")
        vida_squirtle -= 11

    print("La vida de Pycachu es de {} y la vida de Squirtle es {}\n".format(vida_pycachu,vida_squirtle))


    input("Enter para iniciar...")
    # Turno Squirtle
    print("Turno Squirtle")
    ataque_squirtle = None
    while ataque_squirtle != "P" and ataque_squirtle != "A" and ataque_squirtle != "B":
        ataque_squirtle = input("Que ataque deseas realizar: [P]lacaje. [A]gua. [B]urbuja\n")
    if ataque_squirtle == "P":
        vida_pycachu -= 12
        print("Ataca con placaje")
    elif ataque_squirtle == "A":
        print("Ataca con Pistola de Agua")
        vida_pycachu -= 10
    elif ataque_squirtle == "B":
        print("Ataca con Burbuja")
        vida_pycachu -= 9

if vida_pycachu > vida_squirtle:
    print("Gana Pycachu")
else:
    print("Gana Squirtle")