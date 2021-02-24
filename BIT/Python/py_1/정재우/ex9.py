# ex9.py

import random

lotto = set()

i = 0
while True:
  lotto.add(random.randint(1,45))
  i = i+1

  if len(lotto) == 6:
    break

lottolist = []
lottolist = list(lotto)
lottolist.sort()
print("로또 넘버 : ",lottolist)
print("중복된 난수 횟수:",(i-len(lotto)))


