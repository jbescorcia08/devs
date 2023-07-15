import string

mayusculas = 0

texto_usuario = input("Ingresa un texto: ")

for i in texto_usuario:
    if i in string.ascii_uppercase:
        mayusculas += 1
print("Mayusculas: {}".format(mayusculas))