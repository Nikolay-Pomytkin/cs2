inp = input("Enter a number to apply addCubes to:")
n = int(inp)
def addCubes(n):
    total = 0
    for i in range(1, n+1):
        total += (i * i)
    return total
print(str(addCubes(n)))