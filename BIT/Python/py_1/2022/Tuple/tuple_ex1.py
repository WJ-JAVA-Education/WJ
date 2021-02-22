# tuple_ex1.py

# 튜플을 만드는법
t1 = (1, 2, 3, 4)
t2 = 11, 22, 33, 44

type(t1), type(t2)

# 튜플의 index 조회
t1[2]

# 튜플은 변경은 불가능
''' t1[2] = 20 '''

# 문자열을 튜플에 넣는방식
lan = 'python'
t3 = tuple(lan)
print(t3)

# 튜플에 리스트를 넣는방식
t1 = (1, 2, [10, 20, 30])

# 튜플 안의 리스트에서 조회하는 방식
t1[2][1]

# 컬러 튜플의 white 의 갯수를 확인할 때
color = ('white', 'red', 'yellow', 'black')
color.count('white')

# 컬러 튜플의 red의 인덱스 번호
color.index('red')
