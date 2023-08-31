def main():
    lista = [1,2,1,2,4,5,6,3]
    eliminar_duplicados(lista)
    print(lista)

def eliminar_duplicados(lista):
    for i in lista:
        if i != 