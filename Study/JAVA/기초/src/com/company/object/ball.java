package com.company.object;

public interface ball {
    public default void set_total_speed(int speed1, int speed2) {
        balls ball = new balls();
        ball.speedUp(speed1, speed2);
    }
}
