b=[]
e=[]
f=[]
x=int(input())
for i in range(2,x+1):
    a=0
    for j in range(2,x+1):
        if i%j==0:
            a+=1
            if j==i:
                a-=1
    if a==0:
        b.append(i)
print(b,'is prime number')
for i in range(0,len(b)):
     for j in range(0,len(b)):
         if len(str(b[i]))>=1 and len(str(b[j]))==1:
             d=(b[i]*10)+b[j]
             e.append(d)
         elif len(str(b[i]))>=1 and len(str(b[j]))>1:
             d=(b[i]*100)+b[j]
             e.append(d)
print(e)
for i in range(0,len(e)):
    c=0
    for j in range(2,100):
        if e[i]%j==0:
            c+=1
            if j==e[i]:
                c-=1
    if c==0:
        f.append(e[i])
print(f)
print(len(f))
    
    
    
