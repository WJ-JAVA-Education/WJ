x = int(input("첫번째 숫자는 ?"))
y = int(input("두번째 숫자는 ?"))

if x % 2 == 0 and y % 2 == 0:
    print("모두 짝수입니다.")
elif x % 2 == 0 and y % 2 != 0:
    print("x {} 는 짝수 이며 y {} 는 홀수 입니다..".format(x, y))
elif x % 2 != 0 and y % 2 == 0:
    print("y {} 는 짝수 입니다 x {} 는 홀수입니다.".format(y, x))
else:
    print("모두 홀수 입니다.")
