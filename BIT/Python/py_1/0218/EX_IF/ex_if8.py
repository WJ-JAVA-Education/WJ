score = int(input(" 값을 입력 해주세요 "))

if score >= 60:
    if score >= 70:
        if score >= 80:
            if score >= 90:
                print("A")
            else:
                print("B")
        else:
            print("C")
    else:
        print("D")
else:
    print("F")
