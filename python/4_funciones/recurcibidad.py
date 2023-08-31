from time import sleep

def suma_numero(x):
    print(x)
    sleep(2)
    x += 1
    if x != 100:
        suma_numero(x)


def main():
    suma_numero(12)


if __name__ == "__main__":
    main()