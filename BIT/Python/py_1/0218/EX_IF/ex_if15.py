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

""" 선생님 풀이 """
num1 = int(input("첫번째 숫자 입력: "))
op = input("연산자(+,-,*,/)입력")
num2 = int(input("두번째 숫자 입력"))

if(op == "+"):
    print("수식결과", num1, op, num2, "=", num1+num2)
elif(op == "-"):
    print("수식결과", num1, op, num2, "=", num1+num2)
elif(op == "*"):
    print("수식결과", num1, op, num2, "=", num1+num2)
else:
    print("해당 되는 연산자가 없습니다.")
