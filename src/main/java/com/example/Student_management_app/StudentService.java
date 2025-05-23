package com.example.Student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudent(int adminNo){
        return studentRepository.getStudent(adminNo);
    }

    public String addStudent(Student student) {
        studentRepository.addStudent(student);
        return "Student added successfully";
    }

    public String addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
        return "Teacher added successfully";
    }

    public Teacher getTeacherByName(String name) {
        return studentRepository.getTeacherByName(name);
    }

    public List<String> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void deleteTeacherByName(String teacherName) {
        studentRepository.deleteTeacherByName(teacherName);
    }

    public void addStudentTeacherPair(Integer studentid, Integer teacherid) {
        studentRepository.addStudentTeacherPair(studentid,teacherid);
    }

    public List<String> getStudentByTeacherId(Integer teacherId) {
        return studentRepository.getStudentByTeacherId(teacherId);
    }
}
