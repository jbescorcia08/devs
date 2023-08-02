def main():
    cadena = "anitalavalatina"
    if es_palindromo(cadena):
        print("Es palíndromo.")
    else:
        print("No es palíndromo.")


def es_palindromo(cadena):
    for i in range(len(cadena) // 2):
        if cadena[i] != cadena[-(i + 1)]:
            return False
    return True


main()
