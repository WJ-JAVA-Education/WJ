# exam 4

x = int(input("원하는 숫자를 입력 해 주세요 : "))
total = 0

if 0 < x <= 1000:
    True
else:
    print("올바른 숫자를 다시 입력 해 주세요 : ")


for i in range(x, 1001, x):
    total = total+i

print('1 ~ 1000 까지의 {}의 배수의 합은 : {}'.format(x, total))
# print('1 ~ 1000 까지의 % d의 배수의 합은: % d)
