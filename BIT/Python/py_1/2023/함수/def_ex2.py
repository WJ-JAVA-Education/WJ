# def_ex2.py

def morning1 (name): # 함수정의 , 반환값이 없다.
    print(name,"씨 굿모닝 입니다.")

def morning2 (name): #반환값이 1개
    s = name+"씨 굿모닝 입니다."
    return s

def morning3 (name): # 반환값이 2개
    s1 = "오늘 날씨 쾌청"
    s2 = name+"굿모닝 입니다."
    return s1,s2

# 메인프로그램

morning1("파이썬")

s=morning2("파이썬")
print(s)

s2=morning3("파이썬")
print(s2)

