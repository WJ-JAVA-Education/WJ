# md_random_ex.py

import itertools

list1 = [1,2,3]
list2 = [4,5,6]


# 리스트 1과 2를 연결하는 메소드 - itertools.chain()
for i in itertools.chain(list1,list2):
  print(i,end=' ')

# 해당 숫자만큼 시작해서 무한대로 숫자를 출력 - itertools.count()
for i in itertools.count(100):
  print (i,end=' ')