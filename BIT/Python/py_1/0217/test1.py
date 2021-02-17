a = 6
print(a)

print('한국', "Seoul", 2021, sep='-')

print('한국', "Seoul")
print("한국", 'Seoul')


print('한국', "Seoul", end='')
print("한국", 'Seoul')


# 큰따옴표 작은따옴표 출력은 같음
print("Hi python")

# 작은따옴표
print('Hi python')

# 따옴표를 포함한 출력 방식
print('"Hi python"')

# 따옴표를 포함한 출력 방식
print("'Hi python'")

# 문자열 반복연산도 가능
print("'Hi python' "*5)

# 포맷 형식 ( {} 에 값을 받는다 )
print("당신의 나이는 {}세 입니다.".format(26))

# 포맷을 받을때 여러개 ( ,를 사용하면 여러개의 값을 받을 수 있다)
print("당신의 이름은 {} 이며, 나이는 {}세 입니다.".format("정재우", 26))

# 포맷을 사용할 때 인덱스로 사용 할 수 있다.
print('{0}에 {0}을 더하면 {0}가 되고 , {1}에 {0}을 더하면 {1}이 된다.'.format('정수', '실수'))

print('이름은 {name}이며, 나이는 {age}세 이고 , 주소는 {add} 입니다.'.format(
    age=26, add="부산", name="정재우"))


name = input('이름입력: ')
print('이름은 {}'.format(name))

age = int(input("나이는:"))  # 나이는 정수로 age에 저장
print('나이는 {}'.format(age))

print('이름은 {} 나이는 {}'.format(name, age))
print(type(name))  # 스트링으로 표시
print(type(age))    # int 로 표시
