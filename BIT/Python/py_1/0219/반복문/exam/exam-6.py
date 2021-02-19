# 1부터 100까지 숫자중에서 입력받은 숫자의 배수 합을 구하는 프로그램
# while , Continue 를 사용할 것.

n = int(input("배수 숫자 입력 : "))
i = 0
total = 0


while i <= 100:
    i = i+1
    if((i % n) != 0):
        continue  # 입력 된 배수가 아니면 반복문의 처음으로 이동
    total = total+i  # 입력된 수의 배수만 합계에 더함

print("1~100까지 %d 배수의 합: %d" % (n, total))
