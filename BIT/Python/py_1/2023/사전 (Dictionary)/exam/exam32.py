# exam32.py

num = int(input("숫자 입력 : "))

mul_2 = set()
mul_3 = set()
mul_7 = set()

for i in range(1, num+1):
    if(i % 2 == 0):
        mul_2.add(i)
    if(i % 3 == 0):
        mul_3.add(i)
    if(i % 7 == 0):
        mul_7.add(i)
print("2의 배수 : ", sorted(mul_2))
print("3의 배수 : ", sorted(mul_3))
print("7의 배수 : ", sorted(mul_7))
print("2,3,7 의 배수 : ", sorted(mul_2 & mul_3 & mul_7))
