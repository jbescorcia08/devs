# uso de while
respuesta = None

# Hasta que repuesta sea una de las letras requeridas no rompera el siclo
while respuesta != "A" and respuesta != "B" and respuesta != "C":
    respuesta = input("Ingresa una respuesta: [A], [B], [C]: ")

if respuesta == "A":
    print("Haz seleccionando la A")
elif respuesta == "B":
    print("Haz seleccionando la B")
elif respuesta == "C":
    print("Haz seleccionando la C")
