# def_ex4.py

def func1(a,b):     # a,b 지역변수
    c = a+b         # c 지역변수
    print("x,y의 값은 : ",x,y) # 전역변수 x,y 가 출력

def func2(x,y): # x,y는 전역변수와 지역변수 이름 동일
    x=x*2
    y=y*2
    print("x,y의 값은 : ",x,y) # 이름이 같을 경우는 지역변수가 출력//
    global z    # Global을 사용하면 전역변수
    z = x+y

# 메인 프로그램

x = 10  # x,y 는 전역 변수
y = 20  
func1(x,y)
""" print(c) c는 지역변수 --> 오류호출 """

func2(x,y)  # 안에있는 함수 범위 내에서 계산한 값이 출력.
print(x,y)  #전역변수가 출력된다.
print(z)
