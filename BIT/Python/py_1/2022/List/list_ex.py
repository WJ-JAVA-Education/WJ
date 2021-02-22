# list_ex.py

# 리스트 생성
list1 = [1, 2, 3, 4]

# 리스트 안에 튜플을 넣어서 만들수도 있다.
# 서로 다른 자료형도 넣을수 있다.
list2 = [1, 'one', (1, 2, 3)]

# 리스트에 삽입
st = 'python'
list3 = list(st)
print(list3)

# index[2] 번에 튜플 (1,2,3)을 삽입.
list1[2] = (1, 2, 3)
print(list1)

# del 연산자로 리스트 안에있는 내용을 삭제 할 수있다.
del list1[0]
print(list1)

# 리스트 안의 정수형 자료를 더할수 있다.
list3 = [1, 2, 3, 4]
sum(list3)
# 리스트 안의 정수형 자료중 가장 높은 수를 출력
max(list3)
# 리스트 안의 정수형 자료중 가장 낮은 수를 출력
min(list3)

# append 매소드는 리스트의 가장 마지막에 추가된다.
list1 = [1, 2, 3, 4]
list1.append((1, 2, 3))
print(list1)

# insert 메소드는 원하는 위치에 삽입가능
list1.insert(2, 'kor')
print(list1)

# extend 는 리스트 자료형으로 리스트를 확장 해준다.
list1.extend('python')
print(list1)

# list에 여러 숫자를 넣을때 효율적으로 넣으려면 range 를 사용해서 넣을수 있다.
# range 범위는 끝나는 첨자 -1 로 출력이 되기때문에 105까지 출력을 하고싶다면 106을 입력 해야한다.
list1.extend(range(100, 105))
print(list1)


# pop 은 List 의 제일 마지막을 반환해주는 메소드
# pop 을써서 리스트의 제일 마지막이 삭제되었다.
cities = ['seoul', 'busan', 'daegu', 'daejeon']
last_city = cities.pop()
print(last_city)
print(cities)

# pop에 인덱스를 사용해서 원하는 위치의 자료를 뺄수있다.
first_city = cities.pop(0)
print(first_city)
print(cities)

# list 에서 원하는 단어를 제거할때 사용하는 메소드
cities.remove('busan')
print(cities)

# Clear 메소드를 사용하면 리스트 내의 모든 자료를 지울수 있다.
cities.clear()
print(cities)

# index 를 사용하면 해당하는 인덱스의 번호를 알려준다.
num1 = [33, 44, 11, 22, 77, 88, 55]
print(num1.index(11))

# List 내의 자료를 정렬 할 때 오름차순으로 사용
num1.sort()
print(num1)
# List 내의 자료를 정렬 할 때 내림차순으로 사용
num1.sort(reverse=True)
print(num1)
