score = int(input("점수를 입력 해주세요! "))

if 90 < score <= 100:
    print("A학점 입니다.")
elif 80 < score <= 90:
    print("B 학점 입니다.")
elif 70 < score <= 80:
    print("C 학점 입니다.")
elif 60 < score <= 70:
    print("D 학점 입니다.")
else:
    print("F")
