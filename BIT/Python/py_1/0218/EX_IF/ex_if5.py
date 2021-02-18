x = int(input("첫번째 숫자를 입력 해 주세요 : "))
y = int(input("두번째 숫자를 입력 해 주세요 : "))

if x < y:
    print(" 두 수 ", x, ",", y, " 중  ", "{} 이 더 큰 수입니다. ".format(y))
else:
    print(" 두 수 ", x, ",", y, " 중  ", "{} 이 더 큰 수입니다. ".format(x))
