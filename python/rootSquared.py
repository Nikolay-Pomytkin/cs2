import math
running = True
counter = 1
total = 0
epsilon = .000001
while (running):
	total += (1 / counter) * (1 / counter)
	counter += 1
	if (counter == 100) | ((1/counter) == epsilon):
		running = False
print ("The value of pi is: " + str(math.sqrt(total*6)))
