package com.example.Student_management_app;

public class Student {


    //primary key
    private int adminNo;

    private String name;

    private int age;

    private String email;

    private String course;

    public Student() {
    }

    public Student(int adminNo, String name, int age, String email, String course) {
        this.adminNo = adminNo;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
