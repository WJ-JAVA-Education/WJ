# exam17.py
cnt = 1
total = 0

while True:
    num = int(input(str(cnt)+"번째 숫자 입력. "))
    if cnt % 2 == 0:
        num = -num

    total = total+num
    cnt = cnt+1

    if cnt > 10:
        break
print("10개의 정수의 합 : ", total)
