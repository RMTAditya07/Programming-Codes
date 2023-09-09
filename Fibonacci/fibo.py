
n = int(input("Enter the range : "))
f1=0
f2=1
next=0
print(f1)
for i in range(n+1):
    print(f2)    
    next = f1+f2
    f1=f2
    f2=next
