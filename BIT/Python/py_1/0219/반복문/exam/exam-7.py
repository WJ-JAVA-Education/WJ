# 하나의 숫자를 입력받은 숫자가 소수 인지 아닌지 여부를 출력하는 프로그램을 작성
# break 문을 사용

n = int(input('소수 검증 숫자 입력 : '))

for i in range(2, int(n/2)):
    if n % i == 0:
        print(' 소수가 아닙니다. ')
        break
else:
    print('소수 입니다.')
print('소수 판별 프로그램을 이용해 주셔서 감사합니다.')
