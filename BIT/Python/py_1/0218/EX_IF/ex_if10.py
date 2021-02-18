성별 = input("성별을 입력 해주세요 ex( 남자 , 여자 )")
키 = float(input("키를 입력 해주세요 (cm) ")) / 100
몸무게 = float(input("몸무게를 입력 해 주세요 (kg) "))

M_BMI = 몸무게 / (키 * 키 * 20)
L_BMI = 몸무게 / (키 * 키 * 21)

if 성별 == "남자":  # 남자일 경우
    avg = 키 * 키 * 22
    if 110 <= 몸무게 / avg * 100 <= 119:
        print("과체중")
    elif 몸무게 / avg * 100 >= 120:
        print("비만체중")
    else:
        print("표준체중")
elif 성별 == "여자":  # 여자일 경우
    avg = 키 * 키 * 21
    if 110 <= 몸무게 / avg * 100 <= 119:
        print("과체중")
    elif 몸무게 / avg * 100 >= 120:
        print("비만체중")
    else:
        print("표준체중")
else:
    print("성별이 잘못 입력 되었습니다.")


"""
if 성별 == "남자" and M_BMI >= 110 and M_BMI <= 119:
    print("과체중 입니다.")
elif 성별 == "남자" and M_BMI >= 110 and M_BMI <= 119:
    print("비만체중 입니다.")
if 성별 == "여자" and L_BMI >= 110 and L_BMI <= 119:
    print("과체중 입니다.")
elif 성별 == "여자" and L_BMI >= 110 and L_BMI <= 119:
    print("비만체중 입니다.")
else:
    print("정상체중 입니다")
"""