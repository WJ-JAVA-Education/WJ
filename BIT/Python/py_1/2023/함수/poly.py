# polyArea.py

# 임폴트하여 바로 사용가능
from polyArea import pi,recArea


print("** 사각형 넓이 **")
width = float(input("사각형 가로 : "))
depth = float(input("사각형 세로 : "))
print("사각형의 넓이 : ",recArea(width,depth))

"""
print("** 삼각형 넓이 **")
base= float(input("삼각형 밑변 : "))
height=float(input("삼각형의 높이 : "))
print("삼각형의 넓이 : ",polyArea.triArea(base,height))

print("**원의 넓이**")
r = float(input("반지름 : "))
print("원의 넓이 : ",polyArea.cirArea(r))
print("원의 둘레 : ",polyArea.circum(r))
"""
print("파이 값 : ",pi)