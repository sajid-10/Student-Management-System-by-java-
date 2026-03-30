package com.example;

public class Main {
    public static void main(String[] args) {
        Student [] students = new Student[4];

        students[0] = new Student("Mahim Howladar", 3.8);
        students[1] = new Student("Shihab Islam", 4.00);
        students[2] = new Student("Sadia Sultana", 3.75);
        students[3] = new Student("Bishal Mollik", 3.25);

        for(Student st : students) {
            System.out.println(st.name + "'s cgpa is " + st.cgpa);
        }
    }
}