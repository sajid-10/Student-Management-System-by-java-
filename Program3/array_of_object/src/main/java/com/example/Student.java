package com.example;

public class Student {
    String name;
    double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public void displayName() {
        System.out.println(this.name);
    }

    public void displayCgpa() {
        System.out.println(this.cgpa);
    }
}
