# md_random_ex.py

import random

# 정수의 난수를 표시
print(random.randint(1,100))

# 1부터 10 사이의 수
print(random.randrange(10))

# 1,부터 100까지 사이의 수
print(random.randage(1,100))
# 홀수번만 가지고오기
print(random.randrange(1,100,2))
# 아주작은 소수를 반환 시킬 때
print(random.random())
# 100.1 부터 100.2 사이의 소숫점 단위를 반환시킬 때
print(random.uniform(100.1,100.2))


""" 문자열 반환  """

# 변수의 문자열 랜덤반환
s='python'
print(random.choice(s))

# 리스트의 랜덤반환
color = ['red','green','blue']
print(random.choice(color))

# 튜플안의 요소 중 랜덤반환
num = (1,2,3,6,8)
print(random.choice(num))

# 셔플은 요소의 순서를 임의로 바꾸어주는 함수
list1 = [1,2,3,4,5]
print(list1)
random.shuffle(list1)



