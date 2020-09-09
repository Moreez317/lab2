package ru.mirea.lab2.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1;
        ball1 = new Ball(15, 10);
        System.out.println(ball1.getX());
        ball1.setX(10);
        System.out.println(ball1);
        System.out.println(ball1.toString());
    }
}
