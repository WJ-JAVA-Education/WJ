# Exam5 팩토리얼 값을 구하여라.

n = int(input(" 팩토리얼 숫자 입력 : "))
fac = 1

for i in range(n, 0, -1):
    fac = fac * i

print("%d의 팩토리얼 값은 : " % n, fac)
