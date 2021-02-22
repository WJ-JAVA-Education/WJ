# exam18.py


while True:
    month = int(input("가장좋아하는 월은 ? (종료 : 0 두번입력 )"))
    if 0 < month < 13:
        if 3 <= month <= 5:
            print("*****", month, "*****")
            print("봄 입니다")
        elif 6 <= month <= 8:
            print("*****", month, "*****")
            print("여름 입니다")
        elif 9 <= month <= 11:
            print("*****", month, "*****")
            print("여름 입니다")
        else:
            print("*****", month, "*****")
            print("겨울 입니다")
    else:
        print("다시 확인 해 주세요")
    if month == 0:
        break
