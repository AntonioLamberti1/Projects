vettore = [5,3,1,15,9]
i = len(vettore)
while (i > 0):
    j = 0
    while (j < len(vettore)-1):
        if vettore[j] > vettore[j+1]:
            temp = vettore[j]
            vettore[j] = vettore[j+1]
            vettore[j+1] = temp
        j += 1
    i -= 1
print (vettore)