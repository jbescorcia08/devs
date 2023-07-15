
lista_compra = []
articulo_usuario = None
compra_articulo = True

# for para agregar produtos a la list..
while(compra_articulo != False):
    articulo_usuario = input("Articulo a Comprar: ")
    # comparar si el articulo se encuentra en la lista...
    if(articulo_usuario in lista_compra):
        print("El articulo ya esta en el carrito... ")
    else:
        lista_compra.append(articulo_usuario)
        seguir_comprando = input("Desea seguir comprando: ".lower())
        if(seguir_comprando == "si"):
            compra_articulo = True
        else:
            compra_articulo = False

print(lista_compra)
print("Compra realizada...")