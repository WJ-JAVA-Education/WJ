# exam-11.py

# 별 출력
# star = '*'
# sc = 1
# num = int(input(" 별 개수를 입력 해 주세요 : "))

# star = '*'
# n = int(input(" 숫자를 입력 해 주세요 "))
# for i in range(n, -1):
#     print(star, end='')


# num = int(input("숫자 입력 : "))
# i = 1
# while i <= num:  # 줄 수 증가
#     j = num
#     while j <= i:  # 별을 출력
#         print("*", end="")
#         j = j-1
#         print()  # 줄 바꿈
#         i = i-1
#     break

# n = int(input("숫자 입력 : "))
# for i in range(n, 0, -1):
#     print(i*"*")

# #일반적인 별찍기
# while i <= num:
#     j = 1
#     while j <= i:
#         print("*", end='')
#         j = j+1
#         print()
#         i = i+1


while 1 <= num:
    j = 1
    while j <= num:
        print("*", end='')
        j = j+1
        print()
