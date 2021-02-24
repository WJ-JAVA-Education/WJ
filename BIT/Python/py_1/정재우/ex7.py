# ex7.py

import random

set1 = set()
for i in range(8):
  set1.add(random.randint(1,50))

list1 = list(set1)
print("생성된 집합:",set1)
list1.sort()
print("집합에서 가장 큰 수 : ",list1[0])
print("집합에서 가장 작은 수 : ",list1[-1])

