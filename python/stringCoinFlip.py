def coinFlipScanner(s):
    tails = 0
    heads = 0
    for i in range(0, len(s)):
        if s[ i ] == 'h' or s[ i ] == 'H':
            heads += 1
        if s[ i ] == 't' or s[ i ] == 'T':
            tails += 1
    if tails != 0 and heads == 0 :
        return "All tails, no heads."
    elif heads != 0 and tails == 0:
        return "All heads, no tails."
    elif heads == 0 and tails == 0:
        return "No tails or heads."
    elif heads != 0 and tails != 0:
        return str(heads/tails)

s = input("Enter a sentence or string: (The counter will stop counting at a period.)")
print(coinFlipScanner(s))
