def numero_primo(n):
    cont = 0
    for i in range(1, n + 1):
        if n % i == 0:
            cont += 1

    if cont <= 2:
        print("El numero es primo")
    else:
        print("El numero no es primo")


numero_primo(2)