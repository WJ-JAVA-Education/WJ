# exam-12.py
# 구구단 을 출력하되 짝수인 구구단만 출력하라
"""
v = 2  # 단
while v <= 9:
    print("**", v, "단 **")
    i = 1  # 열
    while i <= 9:
        if v*i % 2 == 0:
            print(v, "*", i, "=", v*i)
        i = i+1
    v = v+1
"""

for i in range(2, 10):
    print("{} 단 출력".format(i))
    for j in range(1, 10):
        if i*j % 2 == 0:
            print(i, "*", j, "=", i*j)
