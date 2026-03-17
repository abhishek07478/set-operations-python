def fibonacci(n):
    a, b = 0, 1
    if n <= 0:
        print("Please enter a positive number")
    elif n == 1:
        print("Fibonacci series:")
        print(a)
    else:
        print("Fibonacci series:")
        for _ in range(n):
            print(a, end=" ")
            a, b = b, a + b
if _name_ == "_main_":
    n = int(input("Enter number of terms: "))
    fibonacci(n)
