def fibonacii(n):
    serie = [0,1]
    if n < 2:
        return serie
    elif n >= 2:
        for i in range(n):
            temp = serie[i - 1] + serie[i - 2]
            serie.append(temp)

    return serie

def main():
    print(fibonacii(34))


if __name__ == "__main__":
    main()