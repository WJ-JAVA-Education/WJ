# exam22.py

num = int(input(" 숫자 입력 : "))
pnum = []  # 빈 리스트 생성

for i in range(1, num+1):
    dcnt = 0  # 약수의 갯수
    for j in range(1, i+1):
        if i % j == 0:
            dcnt = dcnt+1
    if dcnt == 2:
        pnum.append(i)
print("1부터", num, "까지의 소수의 리스트 : ", pnum)
print("1부터", num, "까지의 소수의 갯수 : ", len(pnum))
