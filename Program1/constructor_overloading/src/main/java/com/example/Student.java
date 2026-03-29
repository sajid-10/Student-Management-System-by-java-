package com.example;

public class Student {
    public String first_name;
    public String last_name;
    public String section;
    public int id;
    public int standard;
    public double grade;

    // Default constructor
    public Student() {
        this.first_name = "";
        this.last_name = "";
        this.section = "";
        this.id = 0;
        this.standard = 0;
        this.grade = 0.0;
    }

    // Parameterized constructor
    public Student(String first_name, String last_name, String section, int id, int standard, double grade) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.section = section;
        this.id = id;
        this.standard = standard;
        this.grade = grade;
    }
}
