package com.company;

interface Analyzable{
    double getAverage();
    GradedActivity getHighest();
    GradedActivity getLowest();
}

class GradedActivity {
    private double score; // Wynik punktowy.

    public void setScore(double s)
    {
        score = s;
    }

    public double getScore()
    {
        return score;
    }

    public char getGrade(){
        char letterGrade;
        if (score >= 90)
            letterGrade = '5';
        else if (score >= 80)
            letterGrade = '4';
        else if (score >= 70)
            letterGrade = '3';
        else if (score >= 60)
            letterGrade = '2';
        else
            letterGrade = '1';
        return letterGrade;
    }
}

class CourseGrades implements Analyzable {
    private GradedActivity[] grades;

    public GradedActivity[] getGrades() {
        return grades;
    }

    public void setGrades(GradedActivity[] grades) {
        this.grades = grades;
    }

    @Override
    public double getAverage() {
        double suma = 0;
        for (int i = 0; i < grades.length; i++) {
            suma += grades[i].getScore();
        }
        return suma / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        double max = 0;
        int highest=0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getScore() > max)
                max = grades[i].getScore();
            highest=i;
        }
        return grades[highest];
}

    @Override
    public GradedActivity getLowest() {
        double min = grades[0].getScore();
        int lowest = 0;
        for(int i=1; i < grades.length; i++){
            if(grades[i].getScore()<min){
                min = grades[i].getScore();
                lowest = i;
            }
        }
        return grades[lowest];
    }
}


public class Main {
    public static void main(String[] args)  {
        CourseGrades courseGrades = new CourseGrades();
        GradedActivity a1 = new GradedActivity();
        a1.setScore(60);
        GradedActivity a2 = new GradedActivity();
        a2.setScore(55);
        GradedActivity a3 = new GradedActivity();
        a3.setScore(35);
        GradedActivity a4 = new GradedActivity();
        a4.setScore(90);
        courseGrades.setGrades(new GradedActivity[] {a1, a2, a3, a4});

        System.out.println(courseGrades.getAverage());
        System.out.println(courseGrades.getHighest().getScore());
        System.out.println(courseGrades.getLowest().getScore());
    }
}
