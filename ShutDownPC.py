import os
print("Enter Number of Second to Shutdown System: ")
sec = int(input())

strOne = "shutdown /s /t "
strTwo = str(sec)
str = strOne + strTwo

os.system(str)
