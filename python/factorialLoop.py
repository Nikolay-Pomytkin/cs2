inp = input("Enter a number to apply factorial to:")
n = int(inp)
def factorial(n):
    total = 1
    for i in range(1, n+1):
        total *= i
    return total
print(str(factorial(n)))