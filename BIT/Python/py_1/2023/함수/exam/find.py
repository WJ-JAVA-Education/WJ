import sys
sys.path.append('C:/Users/user/Documents/GitHub/WJ/BIT/Python/py_1/2023/함수/exam')
import find
dir(find)


# 모듈 생성

def findMax(a,b,c):
  if a>b>c:
    return print("가장 큰 숫자는 :",a)
  if b>a>c:
    return print("가장 큰 숫자는 :",b)
  if c>b>a:
    return print("가장 큰 숫자는 :",c)

def findMin(a,b,c):
  if a<b<c:
    return print("가장 작은 숫자는 :",a)
  if b<a<c:
    return print("가장 작은 숫자는 :",b)
  if c<b<a:
    return print("가장 작은 숫자는 :",c)

def findSum(a,b,c):
  return print("합계는 : ",a+b+c)




