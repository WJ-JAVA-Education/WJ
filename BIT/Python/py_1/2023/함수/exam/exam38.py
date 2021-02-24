# exam38.py

def prime(num):

  for i in range(2,int(num/2)):
    if num%i == 0:
      print("소수가 아닙니다.")
      break
  else:
    print("소수 입니다")

def prime2(num):
  flag = 0
  for i in range(2,num):
    if num%i == 0:
      flag = 1
      break
    if flag == 0:
      print(num,"은 소수이다.")
    else:
      print(num,'은 소수가 아니다.')

#메인 프로그램

num = int(input("숫자 입력 : "))

prime(num)
