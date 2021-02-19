x = int(input("첫 번째 숫자: "))
y = int(input("두 번째 숫자: "))

if x > y:
    temp = x
    x = y
    y = temp

print(x, "부터", y, "까지의 합은 : ", end='')
""" end 줄바꿈을 하지않고 이어서 프린트 문을 이어서 붙혀준다. """

sum = 0
while x <= y:
    sum = sum+x
    x = x+1
print(sum)
