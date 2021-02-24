# exam37.py

def gugudan(a):
  sum = 0
  for i in range(1,10):
    print(a,"*",i,"=",a*i)
  for j in range(1,10):
    sum = sum+(a*j)
  return sum
    

dan = int(input("원하는 단을 입력하시오 : "))
sum = gugudan(dan)
print(dan,"단의 합 : ",sum)

