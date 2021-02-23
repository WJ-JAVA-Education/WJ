# exam27.py

num = (1, 2, 4, 4, 2, 3, 7, 7, 9, 3)
list = []

for i in range(len(num)):
    if num[i] not in list:
        list.append(num[i])
        if num.count(num[i]) >= 2:
            print("중복된 숫자 :", num[i], ",", num.count(num[i]))
list.sort()
print("중복이 제거된 리스트 : ", list)
