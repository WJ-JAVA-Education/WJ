# m_ex8.py
import sys
sys.path.append('C:/Users/user/Documents/GitHub/WJ/BIT/Python/py_1/정재우')

def findMax(a,b,c):
  if a>b>c:
    return a
  if b>a>c:
    return b
  if c>b>a:
    return c

def findMin(a,b,c):
  if a<b<c:
    return a
  if b<a<c:
    return b
  if c<b<a:
    return c

def findSum(a,b,c):
  return a+b+c

  