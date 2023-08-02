def main():
    n = 12
    serie_fibonacci_secuencia = serie_fibonacci(n)
    print("Serie Fibonacci {} terminos".format(n))
    print(serie_fibonacci_secuencia)

def serie_fibonacci(n):
    if n <= 0:
        return []
    
    serie = [0,1][:n]
    for i in range(2, n):
        serie.append(serie[-1] + serie[-2])

    return serie


main()