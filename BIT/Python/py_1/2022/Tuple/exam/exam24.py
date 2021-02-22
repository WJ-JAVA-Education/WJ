# exam24.py

fruit = ('사과', '배', '파인애플', '포도')
price = (5000, 7000, 4500, 6000)

list = []


for i in range(len(fruit)):
    list.append(fruit[i])
    list.append(price[i])
print('과일 튜플 : ', fruit)
print('가격 튜플 : ', price)
print('튜플로 부터 생성 된 과일 + 가격 리스트 : ', list)
