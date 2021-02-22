# exam21.py
"""
num = [[11, 33, 22, 7], [77, 2, 90], [3, 66, 44, 9, 8]]

for j in range(len(num)):
    sum = 0
    for i in range(len(num)):
        sum = sum+num[sum[j][i]]
    print(num[j]+"번째 줄의 합은 : ", sum)
    print(min(num[j]))
"""

""" 선생님 풀이 """

list1 = [[11, 33, 22, 7], [77, 2, 90], [3, 66, 44, 9, 8]]
minvalue = min(list1[0])

for i in range(len(list1)):
    print((i+1), "번째 줄의 합 : ", sum(list1[i]))
    if minvalue > min(list1[i]):
        minvalue = min(list1[i])
print("리스트에서 가장 작은 값은 : ", minvalue)
