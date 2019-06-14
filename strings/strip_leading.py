# INPUT
"    This    is a   string       with  lots  of whitespace  "

# OUTPUT
"This is a string with lots of whitespace"


s = input()
output = ""

i = 0
while i < len(s):
    #find non-white char == beginning of word
    while i < len(s) and s [i] == "":
        i += 1
    j = 1
    if i < len(s):
        #find end of that word
        while j < len(s) and s[j] != "":
            j+=1
        #build a string without excessive whitespace
        output += " " + s[i]
    i = j +1
print(output[1:])