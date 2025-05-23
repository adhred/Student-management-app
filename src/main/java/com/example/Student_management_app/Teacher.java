package com.example.Student_management_app;

public class Teacher {

    private int id;

    private String name;

    private int age;

    private int numberOfStudents;


    public Teacher() {
    }

    public Teacher(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.numberOfStudents =0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
