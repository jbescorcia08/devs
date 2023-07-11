x = int(input("Ingresa un numero: "))

print("Tabla de multiplicacion del [{}]\n".format(x))
for i in range(1, 10 + 1):
    mulplicacion = i * x
    print("{} * {} = {}".format(i,x,mulplicacion))