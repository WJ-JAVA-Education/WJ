# exam30.py

phone = {}
for i in range(5):
    id = (int(input(str(i+1)+"번째 학생 학번 : ")))
    pnum = (input(str(i+1)+"번째 학생 전화번호 : "))
    phone[id] = pnum
print("전화번호부 완성")
id = int(input("검색을 원하는 학번 : "))
if id in phone:
    print("입력한 학생의 전화번호 : " + phone[id])
else:
    print(" 입력한 학생의 전화번호가 없습니다. ")
