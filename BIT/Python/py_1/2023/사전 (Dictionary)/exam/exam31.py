# exam31.py

import random
rset = set()

for i in range(10):
    rset.add(random.randint(1, 100))

temp = list(sorted(rset))
print("생성 된 집합 : ", temp)
print("집합에서 가장 큰 수 : ", temp[0])
# -를 index에 붙히면 뒤에서부터 시작한다.
print("집합에서 가장 작은 수 : ", temp[-1])
