# exam33.py
"""
def twofnc(x,y):
  for i in range(x,y+1):
    dcnt = dcnt+1
    for j in range(1,i+1):
      if i%j == 0:
"""

def findPrime(x,y):
  print(x,"부터",y,"사이의 소수 : ",end = ' ')
  cnt = 0
  for i in range (x,y+1):
    for j in range(2,i):
      if i%j == 0:
        break
    else:
      print(i,end = ' ')
      cnt = cnt+1
  else:
    print('') # 줄바꿈을 위한 print
  return cnt

num1 = int(input("첫 번째 숫자 : "))
num2 = int(input("두 번째 숫자 : "))

cnt = findPrime(num1,num2)

print("소수는 모두 ",cnt,"개 입니다.")


