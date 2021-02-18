x = int(input("첫번째 수를 입력 해주세요 "))
y = int(input("두번째 수를 입력 해주세요 "))
total = x + y

if 75 <= x and 75 <= y and total >= 180:
    print("최우수 학생")
elif 75 <= x and 75 <= y and x + y >= 160:
    print("우수 학생")
elif 75 <= x and 75 <= y and x + y >= 150:
    print("보통 학생")
elif 75 > x or 75 > y:
    print("분발합시다.")

    # 선생님 풀이
    """
    if (x >= 75) and (x >= 75):
        print('최우수 학생')
    elif 






    """
