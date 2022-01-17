package com.kaviraj;

class Students {
    int rno;
    String name;
    float marks;
}

public class Student {
    public static void main(String[] args) {
        Students s = new Students();
        s.rno = 101;
        s.name = "Kaviraj";
        s.marks = 92.8f;
        System.out.println(s.rno + " " + s.name + " " + s.marks);
    }
}
