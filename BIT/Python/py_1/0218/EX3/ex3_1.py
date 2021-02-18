x = int(input("x 값 : "))
y = int(input("y 값 : "))

tuple = (x, y)


print("두 수의 합 : {}".format(sum(tuple)))
print("두 수의 차 : {}".format((x - y)))
print("두 수의 곱 : {}".format(x * y))
print("두 수의 평균 : {}".format(sum(tuple) / len(tuple)))
