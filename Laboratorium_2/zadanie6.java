package com.company;

class Segment{
    private Point x1;
    private Point x2;

    public Segment(Point x1, Point x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    public Point getX1() {return x1;}

    public void setX1(Point x1) {this.x1 = x1;}

    public Point getX2() {return x2;}

    public void setX2(Point x2) {this.x2 = x2;}
    
    public String toString(){
        return "Segment[" + "v1=" + x1 +  ",v2=" + x2 + "]";
    }

    public double getLength(){
        double dlugosc;
        dlugosc = x1.distance(x2);
        return dlugosc;
    }
}

class Triangle{
    private Point x1;
    private Point x2;
    private Point x3;

    public Triangle(Point x1, Point x2, Point x3){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public Point getX1() {return x1;}

    public void setX1(Point x1) {this.x1 = x1;}

    public Point getX2() {return x2;}

    public void setX2(Point x2) {this.x2 = x2;}

    public Point getX3() {return x3;}

    public void setX3(Point x3) {this.x3 = x3;}

    public String toString(){
        return "Triangle[" + "v1=" + x1 +  ",v2=" + x2 + ",v3=" + x3 +"]";
    }

    public double getDistaces(){
        double obwod;
        obwod = x1.distance(x2) + x2.distance(x3) + x3.distance(x1);
        return obwod;
    }

    public String getType(){
        if(x1.distance(x2)==x2.distance(x3) && x3.distance(x1)==x1.distance(x2)) {
            return "Rownoboczny";
        }
        if(x1.distance(x2)==x1.distance(x3) || x2.distance(x1)==x2.distance(x3) || x3.distance(x1)==x3.distance(x2)){
            return "Rownoramienny";
        }else{
            return "Roznoboczny";
        }


    }

}
class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ')';
    }

    public Point() {
        this.x = 320;
        this.y = 200;
    }

    public int getX() {
        return x;
    }

    public void setX(int number) {
        this.x = number;
    }

    public int getY() {
        return y;
    }

    public void setY(int number) {
        this.y = number;
    }

    public Point getCoordinates() {
        return new Point(this.x, this.y);
    }

    public void setCoordinates(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt(((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)));
    }
}


public class Main {

    public static void main(String[] args) {
	    Segment obiekt = new Segment(new Point(1,1), new Point(2,2));
        System.out.println(obiekt);
        Triangle trojkat = new Triangle(new Point(5,0), new Point(3,0), new Point(4,2));
        System.out.println(trojkat);
        double obw = trojkat.getDistaces();
        System.out.println(obw);
        double dlugosc = obiekt.getLength();
        System.out.println(dlugosc);
        String typ = trojkat.getType();
        System.out.println(typ);

    }
}
