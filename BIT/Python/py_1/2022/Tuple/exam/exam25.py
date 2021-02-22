# exam25.py

num = (1, 4, 6, 5, 4, 3, 2, 0, 1, 2, 4, 6, 7, 9, 4, 0)
print("생성된 튜플 : ", num)
list = []

for i in range(len(num)):
    if num[i] not in list:
        list.append(num[i])
        print(num[i], "개수", list.count(num[i]))
