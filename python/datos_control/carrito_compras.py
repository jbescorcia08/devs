lista_compra = []

while True:
    articulo = input("Deseas comprar?... [Q] - Salir: ")
    if "Q" == articulo:
        break
    elif articulo in lista_compra:
        print("Este articulo esta en el carrito...")
    else:
        if input("Seguro que desea Agregar el articulo: {} a la lista? - \n[S]i - [N]o: ".format(articulo)) == "S":
            lista_compra.append(articulo)
        else:
            print("Producto no agregado :( ")


print("Articulos: {}".format(lista_compra))