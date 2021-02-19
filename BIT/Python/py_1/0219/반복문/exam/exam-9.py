# 5과목의 유요한 성적을 입력받아 각 과목의 점수와 총점과 평균을 출력하는 프로그램을 작성
# 1. 입력된 각 과목의 성적이 0-100 사이 점수가 아닌 경우에는 '유효한 성적이 아닙니다' 를 출력 후  다음 과목을 입력받는다.

sub = 1
total = 0

while sub <= 5:
    score = int(input(str(sub)+"번째 점수 입력 : "))
    if(0 <= score <= 100):
        total = total + score
        print(sub, "번째 성적 : ", score)
        sub = sub+1
    else:
        print("유효한 성적이 아닙니다.")

print("총점 : ", total)
print("평균 : ", total/5)


"""
while True:
    for i in range(1, 6):
        if 0 <= score <= 100:
            sum = i+score
            input('{}번째 성적을 입력 해 주세요 : '.format(i))
        else:
            print("유효한 성적을 입력 해 주세요.")
    continue
"""
