package com.example;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Sadia", "Sultana", "A", 28, 10, 5.00);

        System.out.println("First student info: ");
        System.out.println("First Name: " + student1.first_name);
        System.out.println("Last Name: " + student1.last_name);
        System.out.println("Section: " + student1.section);
        System.out.println("Id: " + student1.id);
        System.out.println("Standard: " + student1.standard);
        System.out.println("Grade: " + student1.grade);
        System.out.println();

        System.out.println("Second student info: ");
        System.out.println("First Name: " + student2.first_name);
        System.out.println("Last Name: " + student2.last_name);
        System.out.println("Section: " + student2.section);
        System.out.println("Id: " + student2.id);
        System.out.println("Standard: " + student2.standard);
        System.out.println("Grade: " + student2.grade);
    }
}

