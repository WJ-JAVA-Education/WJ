# def_ex.py

# 함수
def BigSmall(a, b):  # 함수정의 ( 호출전에 정의 )
    if a > b:
        big = a
        small = b
    else:
        big = b
        small = a
    return big, small  # 함수 결과 반환


a = int(input("첫 번째 숫자 입력 : "))
b = int(input("두 번째 숫자 입력 : "))
x, y = BigSmall(a, b)  # 함수를 호출하고 결과값은 변수에 저장
print("큰값: ", x)
print("작은값: ", y)
