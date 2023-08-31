def main():
    cadena = "jesus"
    cant_vocales = busqueda_voacal(cadena)
    print("En la cadena {}, hay {} VOCALES".format(cadena,cant_vocales))



def busqueda_voacal(cadena):
    cont = 0
    for i in cadena:
        if i == "a":
            cont += 1
        elif i == "e":
            cont += 1
        elif i == "i":
            cont += 1
        elif i == "o":
            cont += 1
        elif i == "u":
            cont += 1
    return cont


main()