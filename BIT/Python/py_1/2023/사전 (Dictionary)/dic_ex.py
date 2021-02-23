# dic_ex.py

# 사전 Dictionary


# 키값과 벨류값으로 나뉜다
score = {202101: 98, 202102: 88, 202103: 90}

# dict 클래스
type(score)

# 키값은 중복될 수 없다.
# 키값이 중복될 때는 뒤에있는 값이 반영된다.
num = {1: 'a', 2: 'b', 1: 'c', 2: 'd'}
print(num)

# 빈 사전을 만들 때
empty = dict()
print(empty)
list1 = [[1, '하나'], [2, '둘'], [3, '셋']]
list_A = [{1: '하나'}, {2: '둘'}, {3: '셋'}]

# dict 딕셔너리를 생성(만들어주는) 메서드
dic1 = dict(list1)
print(dic1)

# 많은 리스트들을 딕셔너리 형식으로 출력
list2 = [[1, 2, 3], [4, 5], [7, 8, 9]]
list3 = [202101, 202102, 202103]
list4 = [99, 88, 90]

# zip 메서드를 사용하여 합쳐서 만들수 있다.
dic3 = dict(zip(list3, list4))
print(dic3)

# 원소의 요소가 2까지는 dict 로 만들수있으나
# 3개 이상부터는 만들 수 없다.
""" dic4 = dict(list2) """

# dict 의 [] <- 는 키값이다.
dict1 = {1: 'one', 2: 'two', 3: 'three'}
dict1[1]

# dict 키값에 벨류값을 준다면 추가하거나 변경 할 수 있다.
dict1[4] = 'four'
print(dict1)

# dict 1번의 키값을 지울수 있다.
del dict1[1]
print(dict1)

# 전체삭제를 할때.
del dict1

dic1 = {1: 'one', 2: 'two', 3: 'three', 4: 'four'}

# dic1 의 키값이 있는지 확인할 때
1 in dic1

# 키값으로는 확인 할 수 있으나 벨류값으로는 할 수 없다.
'one' in dic1

# dict 를 반복문 출력도 가능하다
for i in dic1:
    print(dic1[i])

# dict 의 최댓값
max(dic1)

# dict 의 합계
sum(dic1)

# get 메서드를 이용하면 해당하는 키값의 벨류를 검색할 수 있다.
dic1.get(3)
dic1.get(5)

# dict copy 메서드를 사용 할 수 있다.
dic2 = dic1.copy()
print(dic2)

# 참조할수 있다.
dic3 = dic1

# clear 메서드를 사용할 수 있다.
dic2.clear()
print(dic2)

# 기본값을 알수 있다.
dic1.setdefault(3)

# 4의 값을 삭제
dic1.pop(4)
print(dic1)

# 사전에서 임의이 아이템을 삭제 해 준다.
dic1.popitem()
print(dic1)

# update 메서드를 사용하면 dic 1에 dic2 를 합할수 있다.
dic2 = {7: 'seven', 8: 'eight'}
dic1.update(dic2)
print(dic1)

# 이때 dic2 의 값은 그대로 남아있다.
print(dic2)

# ** dic1 의 키값이 있다면 키값을 출력하라 **
for num in dic1.keys():
    print(num, end=' ')

# ** dic1 의 벨류값만 출력 **
for alpa in dic1.values():
    print(alpa, end=' ')

# 변수 두개를 주어서 모두 출력가능하다.
for num, alpa in dic1.items():
    print(num, "은 영어로 : ", alpa, end=' ')
