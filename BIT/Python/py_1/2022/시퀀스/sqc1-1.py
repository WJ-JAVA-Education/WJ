# sqc1-1.py

s1 = 'i like python language'
s2 = s1.capitalize()  # 문자열의 가장 첫번째를 대문자로 변환 시켜준다.
print(s2)

s3 = s1.title()  # 모든 단어의 첫번째 글자들을 대문자로 바꿔준다.
print(s3)

s4 = s1.upper()  # 모든 단어를 대문자로 변환시켜준다.
print(s4)

s5 = s4.lower()  # 모든 단어를 소문자로 변환시켜준다.
print(s5)

s1 = 'i like python'
s2 = s1.center(30)  # 전체 30인 길이 중에서 s1에 있는 길이를 가운데로 출력하라.
print(s2)

s3 = s1.center(30, "*")  # 선터에 빈자리를 *로 채워준다.
print(s3)

s1.count('i')  # count 는 특정한 문자열의 갯수를 체크할때 사용

s5 = 'i like python language'
s5.count('a', 0, 12)  # index 0번부터 12번가지 a 의 개수를 찾아준다.

s5.count('a', 12)  # index 번호 12 이후에 a 의 갯수를 출력

s1 = 'i like Python language'
s1.index('i')  # i 라는 문자가 index 의 몇번째 인덱스인가 알려준다.
s1.index('l')  # l 문자의 인덱스번호를 출력
s1.rindex('l')

list1 = ['1', '2', '3', '4']  # list1 에는 문자열 1234 가 들어가있음
s1 = '-'.join(list1)  # list1 에다가 - 를 연결해라
print(s1)
type(s1)  # class str

list1 = [1, 2, 3, 4]  # list1 이 정수열이라면 연결할 수 없다.
s1 = '-'.join(list1)

s1 = ' i like python language'
list1 = s1.split()  # 리스트형으로 나눠서 출력해준다.
print(list1)

s2 = 'i-like-python-language'
s2.split('-')  # 해당단어 기준으로 분리해서 리스트로 반환시켜준다.

s1 = '   i like python language   '
s1.strip()  # 문자열의 앞과 뒤에있는 공백들을 전부 제거 해준다.

s3 = 'i like python language'
tup1 = s3.partition('python')
# partition 메소드는 python 을 기준으로 해서 앞 뒤 문자열을 나누어준다.(공백 포함하며 튜플로 반환해준다.)
print(tup1)

s3.istitle()  # is 대문자인지 아닌지 확인하여 불린값으로 반환

s2 = '1234'
s2.isalnum()  # s2 의 문자열이 숫자 또는 문자로만 구성되어있는가 확인 후 boolean 값으로 반환
s2.isdigit()  # s2의 문자열이 모두 숫자로만 구성되어있는가 확인 후 boolean 값으로 반환
s3.isupper()  # s3의 문자열이 모두 대문자로 구성되어있는가 확인 후 boolean 값으로 반환
