package com.example.Student_management_app;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> studentDb = new HashMap<>();
    Map<Integer,Teacher> teacherDb = new HashMap<>();
    Map<Integer, List<Integer>> teacherStudentsDb = new HashMap<>();

    public Student getStudent(int adminNo){
        return studentDb.get(adminNo);
    }

    public void addStudent(Student student) {
        studentDb.put(student.getAdminNo(),student);
    }

    public void addTeacher(Teacher teacher) {
        teacherDb.put(teacher.getId(),teacher);
    }

    public Teacher getTeacherByName(String name) {
        for(Integer teacherId: teacherDb.keySet()){
            if(teacherDb.get(teacherId).getName().equals(name)){
                return teacherDb.get(teacherId);
            }
        }
        return null;
    }

    public List<String> getAllStudents() {
        List<String> students = new ArrayList<>();
        for(Integer id: studentDb.keySet()){
            students.add(studentDb.get(id).getName());
        }

        return students;
    }

    public void deleteTeacherByName(String teacherName) {
        int teacherId =-1;
        for(Integer id: teacherDb.keySet()){
            if(teacherDb.get(id).getName().equals(teacherName)){
                teacherId=id;
                break;
            }
        }

        if(teacherId!=-1){
            teacherDb.remove(teacherId);
            teacherStudentsDb.remove(teacherId);
        }
    }

    public void addStudentTeacherPair(Integer studentid, Integer teacherid) {
        if(studentDb.containsKey(studentid) && teacherDb.containsKey(teacherid)){
            if(!teacherStudentsDb.containsKey(teacherid)){
                teacherStudentsDb.put(teacherid,new ArrayList<>());
            }
            teacherStudentsDb.get(teacherid).add(studentid);
        }
    }

    public List<String> getStudentByTeacherId(Integer teacherId) {
        List<Integer> studentIds = teacherStudentsDb.get(teacherId);
        List<String> students = new ArrayList<>();
        if(studentIds!=null){
        for(int studentId: studentIds){
            students.add(studentDb.get(studentId).getName());
        }}
        return students;
    }
}
