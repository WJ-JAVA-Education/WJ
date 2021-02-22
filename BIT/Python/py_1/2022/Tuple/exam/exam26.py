# exam26.py

list = []

for i in range(1, 1001):
    dcnt = 0
    for j in range(1, i+1):
        if i % j == 0:
            dcnt = dcnt+1
    if dcnt == 2:
        list.append(i)
print("1부터", 1000, "까지의 소수의 리스트 : ", list)
print("1부터", 1000, "까지의 소수의 갯수 : ", len(list))
