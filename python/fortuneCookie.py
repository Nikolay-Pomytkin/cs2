import random

def fortuneMessage(n):
    if n == 1:
        return "You will have a long and happy life."
    if n == 2:
        return "You will not get zoned."
    if n == 3:
        return "You will have a successful career."
inp = input("Would you like a fortune cookie? (y/n)")
if inp == 'n':
    print("Never again victor")
elif inp == 'y':
    print(fortuneMessage(random.randrange(0,4)))
    print("Your lucky numbers are: ")
    for i in range(0,5):
        print(random.randrange(0,100))
else:
    print("You entered an unacceptable answer. For only $29, you can remove ur extra 21st chromosome")
