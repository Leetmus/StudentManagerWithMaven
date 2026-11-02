package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

class StudentManager {
     private List<Student> students = new ArrayList<>();
 
  
     public void addStudent(Student student) {
         students.add(student);
     }
 
     public void removeStudent(Student student) {
         students.remove(student);
     }

     public void updateStudent(Student oldStudent, Student newStudent) {
         int index = students.indexOf(oldStudent);
         if (index != -1) {
             students.set(index, newStudent);
         }
     }
 
     public List<Student> getStudents() {
         return students;
     }
 }