package com.example;

public class Student {
    String name;
    static String universityName = "Southeast University";

    public Student() {}

    public void displayName() {
        System.out.println("Studnet name: " + this.name);
    }

    public static void displayUniversityName() {
        System.out.println("University name: " + universityName);
    }
}
