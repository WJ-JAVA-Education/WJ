x = int(input("첫번째 숫자를 입력해 주세요 : "))
y = int(input("두번째 숫자를 입력해 주세요 : "))
ex = input("* , / , + , - 를 입력 해 주세요")

if ex == "+":
    print(x + y)
elif ex == "-":
    print(x - y)
elif ex == "*":
    print(x * y)
elif ex == "/":
    print(x / y)
else:
    print("기호를 확인 해 주세요")
