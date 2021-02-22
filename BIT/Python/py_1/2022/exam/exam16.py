# exam16.py
"""
num = 0
cnt = 1
while cnt <= 100:
    num = num+(cnt)
    cnt = cnt+1
    if cnt % 10 == 0:
        print(num)
"""

""" 선생님풀이 """
hap = 0
i = 1

while True:
    hap = hap+i

    if i % 10 == 0:
        print("1-", i, ":", hap)

    i = i+1

    if i > 100:
        break
