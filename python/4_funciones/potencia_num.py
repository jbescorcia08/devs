def main(x , *args, p=False):

    if p:
        return x ** p
    calculo = x**2

    print(calculo)


if __name__ == "__main__":
    main(5)
    main(10, 5)