# for 문을 위한 구구단 프로그램
""" 
x = int(input(" 출력을 원하는 단을 입력 해 주세요 : "))

print("***", x, "***")

for i in range(1, 10):
    print(x, "*", i, "=", x*i)
 """

y = int(input(" 출력을 원하는 단을 입력 해 주세요 : "))

i = 1

while i <= 9:
    print(y, "*", i, "=", y*i)
    i+1
