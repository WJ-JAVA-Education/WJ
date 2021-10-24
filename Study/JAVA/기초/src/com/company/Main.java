package com.company;

import com.company.object.a;
import com.company.object.ball;

public class Main implements ball {

    @Override
    public void set_total_speed(int speed1, int speed2) {
        ball.super.set_total_speed(speed1, speed2);
    }

    public static void main(String[] jj) {


        String b = "12345";

        a ab = new a();
        ab.a = "12345";

        if (ab.a == b) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }


        System.out.println();

    }
}
