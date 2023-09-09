n = int(input("Enter the range : "))
prime = []
for i in range(2,n+1):
    if i>1:
        for j in range(2,i):
            if(i%j==0):
                break
        else:
            prime.append(i)
prime = ', '.join(str(a) for a in prime)
# to print without brackets
print(prime)
