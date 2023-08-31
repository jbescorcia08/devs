def secuencia_fibonacci(n):
    if n <= 0:  # Caso base: Fib(0) = 0, Fib(1) = 1
        return n
    elif n == 1:
        return n
    else:
        return secuencia_fibonacci(n - 1) + secuencia_fibonacci(n - 2)

def main():
    print("SECUENCIA FIBONACCI:")
    n = 10 
    for i in range(n):
        print(secuencia_fibonacci(i), end=" ")

if __name__ == "__main__":
    main()

