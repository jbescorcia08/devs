import string



texto = " Hola,    .......,,,,,,,,,,,,,,,,,,,Soy jesus. Y tu como te llamas?"
espacios = 0
puntos = 0
comas = 0
mayusculas = 0

for i in texto:

    if i == " ":
        espacios += 1
    elif i == ".":
        puntos += 1 
    elif i == ",":
        comas += 1
    elif i in string.ascii_uppercase:
        mayusculas += 1
    else:
        pass


print("Espacios: {}\nPuntos: {}\nComas: {}\nMayusculas: {}".format(espacios,puntos,comas, mayusculas))