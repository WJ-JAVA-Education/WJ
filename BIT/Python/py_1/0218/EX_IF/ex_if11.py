계절 = int(input("월 을 입력 해 주세요 "))

if 1 <= 계절 <= 12:
    if 3 <= 계절 <= 5:
        print("봄")
    elif 6 <= 계절 <= 8:
        print("여름")
    elif 9 <= 계절 <= 11:
        print("가을")
    else:
        print("겨울")
else:
    print(" 다시확인 해 주세요 ")
