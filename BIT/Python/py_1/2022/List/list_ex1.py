# list_ex1.py

num = [[11, 12, 13], [21, 22, 23], [31, 32, 33, 34], [41, 42]]

for j in range(len(num)):
    sum = 0
    for i in range(len(num[j])):
        sum = sum+num[j][i]
    print(j+1, "번째 줄의 합 : ", sum)
