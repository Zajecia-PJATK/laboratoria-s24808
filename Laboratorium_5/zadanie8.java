package com.company;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable{
    private double x,y,xSpeed, ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint {" +
                "x: " + x + ", " +
                "y:" + y + ", " +
                "xSpeed: " + xSpeed + ", " +
                "ySpeed: " + ySpeed + ", " +
                '}';
    }

    public void moveUp() {
        y = y + ySpeed;
    }

    public void moveDown() {
        y = y - ySpeed;
    }

    public void moveLeft() {
       x = x - xSpeed ;
    }

    public void moveRight() {
        x = x + xSpeed;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
}

public class Main {
    public static void main(String[] args)  {
        MovablePoint a1 = new MovablePoint(5, 2, 10, 7);
        System.out.println(a1);
        a1.moveUp();
        a1.moveRight();
        System.out.println(a1);
        a1.moveDown();
        a1.moveLeft();
        System.out.println(a1);
    }
}
