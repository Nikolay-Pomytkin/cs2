running = True
numStudents = 0
totalAverages = 0
classAverage = 0
studentAverages = [0, 0, 0, 0, 0, 0, 0]
while(running):
    numStudents += 1
    score1 = int(input("Enter first score:"))
    score2 = int(input("Enter second score:"))
    score3 = int(input("Enter third score:"))
    score4 = int(input("Enter fourth score:"))
    studentAverage = (score1 + score2 + score3 + score4) / 4
    print ("This student's average is: " + str(studentAverage))
    studentAverages[numStudents] = studentAverage
    totalAverages += studentAverage
    inp = input("Would you like to enter another student's scores? (y/n)")
    if inp == 'n':
        running = False
classAverage = totalAverages / numStudents
print("The class average is: " + str(classAverage))
print("The student averages in order were: " + studentAverages)