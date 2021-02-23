# def_ex3.py

def changeData1(x,y): # 정수를 매개변수로 사용
    x = x+y
    print("x 값은 : ", x)

def changeData2(num): #리스트를 매개변수로 사용
    num[1] = 200
    print(num)

# 메인 프로그램

a = 10
b = 20
changeData1(a,b)
print(a)

list1 = [10,20,30]
changeData2(list1)
print(list1) #원본 값 까지 변경된다.
