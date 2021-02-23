# exam28.py

import random


num1 = set()
num2 = set()

while True:
    if len(num1) < 10:
        num1.add(random.randint(1, 101))
    if len(num2) < 10:
        num2.add(random.randint(1, 101))
    if len(num1) == 10 and len(num2) == 10:
        break
print("발생된 10개의 난수 num1 :", num1)
print("발생된 10개의 난수 num2 :", num2)
print("합집합 : ", num1 | num2)
print("교집합 : ", num1 & num2)
print("차집합 : ", num1-num2)
