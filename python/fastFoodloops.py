running = True
totalPayment = 0;
averagePayment = 0; 
numCustomers = 0;
while (running):
	payment = 0
	numCustomers += 1;
	firstOrder = input("What is the first item you would like to order? (h/c)")
	if firstOrder == 'h':
		firstOrderAmount = input("How many hamburgers would you like to order? (#)")
		payment += int(firstOrderAmount) * 1.19
	elif firstOrder == 'c':
		firstOrderAmount = input("How many cheeseburgers would you like to order? (#)")
		payment += int(firstOrderAmount) * 1.39	
	secondOrder = input("What is the second item you would like to order? (h/c)")
	if secondOrder == 'h':
		secondOrderAmount = input("How many hamburgers would you like to order? (#)")
		payment += int(secondOrderAmount) * 1.19
	elif secondOrder == 'c':
		secondOrderAmount = input("How many cheeseburgers would you like to order? (#)")
		payment += int(secondOrderAmount) * 1.39
	print("Your total is: " + str(round(payment, 2)))
	taxes = payment * 0.05
	print ("The taxes on your payment are: " + str(round(taxes, 2)))
	payment += taxes
	print ("Your final total is: " + str(round(payment, 2))) 
	totalPayment += payment
	another = input("Another customer? (y/n)")
	if (another == 'n'):
		running = False
print ("Today's statistics:")
print ("Total Customers: " + str(round(numCustomers, 2)))
print ("Total payments: " + str(round(totalPayment, 2)))
averagePayment = totalPayment / numCustomers
print ("Average Payment: "+ str(round(averagePayment, 2)))
