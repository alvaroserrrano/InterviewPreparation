i = 0
while i < len (a):
    p = i
    j = i +1
    while j < len(a):
        if(a[j] <  a [p]):
            p = j
        j +=1
    temp = a [p]
    a[p] = a [i]
    a[i] = a [p]
    i+=1