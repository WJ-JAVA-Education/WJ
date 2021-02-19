# Exam-14.py

num1 = int(input("첫 번째 숫자:"))
num2 = int(input("두 번째 숫자:"))
hap = 0

if num1 > num2:
    temp = num1
    num1 = num2
    num2 = temp

for i in range(num1, num2+1):
    if i % 2 != 0:
        hap = hap+i
print(num1, "부터", num2, "까지 홀수의 합 : ", hap)
