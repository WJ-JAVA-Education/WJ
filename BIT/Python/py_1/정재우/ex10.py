# ex10.py

from gpiozero import LED # gpio 모듈에서 LED 불러오기
from time import sleep # time 모듈에서 sleep() 불러오기

led = LED(4) # LED 핀 번호를 입력해준다. (객체생성)

while True:
  # led를 1초마다 깜빡거리게 하는법
  led.on() # Turn On
  sleep(1)  # 1초 대기
  led.off() # Turn Off
  sleep(1)  # 1초 대기


