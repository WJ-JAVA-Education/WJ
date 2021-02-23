# exam33.py

"""
내가 푼 방식
def threefnc(a,b,c):
  if a > b > c :
    print("가장 큰 수는 : ",a)
  if b > a > c :
    print("가장 큰 수는 : ",b)
  if c > b > a :
    print("가장 큰 수는 : ",c)

"""


""" 선생님 풀이 """
def findMax(a,b,c):
  if (a>b):
    biggist = a
  else:
    biggist = b
  if biggist < c:
    biggist = c
  return biggist



# 메인프로그램

a = int(input("첫 번째 숫자 입력 : "))
b = int(input("두 번째 숫자 입력 : "))
c = int(input("세 번째 숫자 입력 : "))

biggist=findMax(a,b,c)
print("가장 큰 값은 : ",biggist)