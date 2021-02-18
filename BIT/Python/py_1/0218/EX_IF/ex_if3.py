국어 = int(input("국어 점수를 입력 해주세요 : "))
영어 = int(input("영어 점수를 입력 해주세요 : "))
수학 = int(input("수학 점수를 입력 해주세요 : "))
subjcet = (국어, 영어, 수학)
평균 = (국어 + 영어 + 수학) / len(subjcet)

if 평균 >= 95:
    print("당신의 평균은 {} 입니다".format(평균))
    print("축하합니다. A+ 입니다.")
print("감사합니다.")
