# exam-10.py

# 사용자로부터 정수를 반복적으로 입력 받아 정수의 합이 1000 이상이 되었을 때 결과값의 평균을 구하는 프로그램

# 내가 푼 문제

total = 0
count = 0


while total <= 1001:
    count = count+1
    score = int(input("숫자를 입력 : "))
    total = total+score
    if total >= 1000:
        print("1000을 넘은수 : {} , 평균은 {}: ".format(total, total/count))


""" 선생님 문제풀이

hap = 0
cnt = 0

while True:
    num = int(input("숫자 입력 : "))
    hap = hap+num
    cnt = cnt + 1
    if hap >= 1000:
        break
print("1000을 넘은 수 : ", hap, end='')
print(", 평균은 : ", hap/cnt)

"""
