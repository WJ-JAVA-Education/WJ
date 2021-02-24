# exam36.py

def hap(a,b):
  sum = 0
  for i in range(a,b+1):
    sum = sum+i
  print("두 수 사이의 합 : ",sum)

a = int(input("첫번째 숫자 입력 : "))
b = int(input("두번째 숫자 입력 : "))

c = hap(a,b)