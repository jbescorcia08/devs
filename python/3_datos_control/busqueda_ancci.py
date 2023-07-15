# texto 
texto = "Hola, mucho gusto soy jesus barrios."

espacio = 0
puntos = 0
comas = 0

for i in texto:
    if i == " ":
        espacio += 1
    elif i == ",":
        comas += 1
    elif i == ".":
        puntos += 1


print("Espacios: {} \nPuntos: {}\nComas: {}".format(espacio,puntos,comas))