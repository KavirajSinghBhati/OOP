package com.kaviraj;

class Students {
    int rno;
    String name;
    float marks;

//    Constructors
    Students () {  //default constructor
        rno = 0;
        name = "default";
        marks = 100.0f;
    }
    Students (int rno, String name, float marks) {  //parameterized constructor
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Students (Students s) {   //copy constructor
        this.rno = s.rno;
        this.name = s.name;
        this.marks = s.marks;
    }

//    Methods

    void greeting() {
        System.out.println("Hello, I am " + this.name);
    }
}

public class Student {
    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.rno + " " + s1.name + " " + s1.marks);

        Students s2 = new Students(101, "Kaviraj", 92.8f);
        System.out.println(s2.rno + " " + s2.name + " " + s2.marks);

        Students s3 = new Students(s2);
        System.out.println(s3.rno + " " + s3.name + " " + s3.marks);

        s2.greeting();
    }
}

