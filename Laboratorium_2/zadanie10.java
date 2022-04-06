package com.company;

class Numbers{
    int x,y,z;

    public Numbers(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {return x;}

    public void setX(int x) {this.x = x;}

    public int getY() {return y;}

    public void setY(int y) {this.y = y;}

    public int getZ() {return z;}

    public void setZ(int z) {this.z = z;}

    public int sum(){
        return x+y+z;
    }
    public int average(){
        return (x+y+z)/3;
    }
    public int min(){
        return Math.min(x, Math.min(y, z));
    }
    public int max(){
        return Math.max(x, Math.max(y, z));
    }
    public double geometric(){
       double iloczyn = (x*y*z);
        return Math.pow(iloczyn, 1.0/3.0);
    }
}
public class Main {

    public static void main(String[] args) {
	 Numbers liczby = new Numbers(1,2,3);
     System.out.println(liczby.sum());
        System.out.println(liczby.average());
        System.out.println(liczby.min());
        System.out.println(liczby.max());
        System.out.println(liczby.geometric());
    }
}
