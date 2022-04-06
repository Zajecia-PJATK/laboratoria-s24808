package com.company;

class MyDate{
    int month,day,year;

    public int getMonth() {return month;}

    public void setMonth(int month) {if(month>0 || month<=12){this.month = month;}}

    public int getDay() {return day;}

    public void setDay(int day) {if(day>0 || day<=31){this.day = day;}}

    public int getYear() {return year;}

    public void setYear(int year) {if(year>=1990 || year<=2050){this.year = year;}}

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate(){
        System.out.printf("%,d/%,d/%d", day,  month, year);
    }
}

public class Main {

    public static void main(String[] args) {
	    MyDate dzien = new MyDate(4,5,2020);
        dzien.displayDate();
    }
}
