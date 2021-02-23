# exam29.py
import random

"""
num1 = set()
lotto = random.randint(1, 46)
dcnt = 0

while True:
    if num1 not in lotto:
        num1.add(lotto)
    elif num1 in lotto:
        dcnt = dcnt+1
    if len(num1) > 7:
        break
"""

lotto = set()

i = 0

while True:
    lotto.add(random.randint(1, 46))
    i = i + 1
    if len(lotto) == 6:
        break
print(" 이번주 로또 넘버 : ", sorted(lotto))
print(" 중복된 난수 횟수 : ", i-len(lotto))
