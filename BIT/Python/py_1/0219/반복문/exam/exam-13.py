cnt = 0


while True:
    score1 = int(input("첫 번째 점수 입력 : "))
    score2 = int(input("두 번째 점수 입력 : "))
    score3 = int(input("세 번째 점수 입력 : "))

    if(score1 == 0 and score2 == 0 and score3 == 0):
        break

    total = score1+score2+score3
    avg = total/3
    cnt = cnt+1

    print(cnt, "번째 학생 : 총점", total, "점, 평균", '%.1f' % avg, "점")

print("총", cnt, "명 성적 처리")
