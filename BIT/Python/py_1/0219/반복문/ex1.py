
""" 반복 할 숫자를 받기 위함 """
num = int(input("합계를 원하는 숫자를 입력: "))


""" 반복문의 횟수를 위함 """
i = 1

"""더한 값을 저장하기 위한 변수"""
total = 0

while i <= num:
    total = total+i
    i = i+1
print(" '1'부터 '{}' 까지의 합:{}".format(num, total))
