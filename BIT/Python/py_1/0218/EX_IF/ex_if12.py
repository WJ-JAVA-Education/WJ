level = int(input("직급 입력"))
age = int(input("나이 입력"))

if (level == 7 or level == 8) and (40 <= age <= 49):
    print("연금 80% 대상자")
elif (level == 5 or level == 6) and (50 <= age <= 59):
    print("연금 100% 대상자")
else:
    print("연금 대상자 아님")
