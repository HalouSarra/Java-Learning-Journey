package oop;

public class StudentCls extends Person{
    double gpa;

    StudentCls(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first +"'s gpa is: " + this.gpa);
    }

}
