# exam15.py
cnt = 1
total = 0


while True:
    num = int(input(str(cnt)+"번째 숫자 입력 : "))
    if num > 0:
        total = total + num
        cnt = cnt+1

    if cnt > 10:
        break

avg = total/(cnt-1)

print("전체 합 : ", total)
print("전체 평균 ", '%1.f' % avg)
