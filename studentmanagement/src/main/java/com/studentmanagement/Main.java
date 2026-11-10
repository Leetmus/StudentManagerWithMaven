package com.studentmanagement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("John Doe", 20, "S12345", "Computer Science");
        Student student2 = new Student("Jane Smith", 22, "S67890", "Mathematics");
        Student student3 = new Student("Alice Johnson", 21, "S54321", "Physics");
        Student student4 = new Student("Bob Brown", 23, "S98765", "Chemistry");
        Student student5 = new Student("Charlie Davis", 19, "S24680", "Biology");
        Student student6 = new Student("Diana Evans", 20, "S13579", "Engineering");
        Student student7 = new Student("Ethan Foster", 22, "S86420", "Economics");
        Student student8 = new Student("Fiona Green", 21, "S97531", "History");
        Student student9 = new Student("George Harris", 23, "S35791", "Philosophy");
        Student student10 = new Student("Hannah Jackson", 19, "S46802", "Political Science");

        // Add students info the StudentManager
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);
        studentManager.addStudent(student6);
        studentManager.addStudent(student7);
        studentManager.addStudent(student8);
        studentManager.addStudent(student9);
        studentManager.addStudent(student10);

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            System.out.println("PostgreSQL connected successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // System.out.printf("%-10s %-20s %-10s %-20s%n",
        //         "Student ID", "Name", "Age", "Major");

        // System.out.println("--------------------------------------------------------------");

        // for (Student s : studentManager.getStudents()) {
        // System.out.printf("%-10s %-20s %-10d %-20s%n",
        //     s.getStudentId(),
        //     s.getName(),
        //     s.getAge(),
        //     s.getMajor());
        // }

        // // Update a student's information
        // Student updatedStudent = new Student("Kofi Doe", 21, "S12345", "Software Engineering"); 
        // studentManager.updateStudent(student1, updatedStudent);
        
        // System.out.println("\nAfter updating student information:\n");
        //   System.out.printf("%-10s %-20s %-10s %-20s%n",
        //         "Student ID", "Name", "Age", "Major");

        // System.out.println("--------------------------------------------------------------");

        // for (Student s : studentManager.getStudents()) {
        // System.out.printf("%-10s %-20s %-10d %-20s%n",
        //     s.getStudentId(),
        //     s.getName(),
        //     s.getAge(),
        //     s.getMajor());
        // }

        // // Remove a student
        // studentManager.removeStudent(student3);

        // System.out.println("\nAfter removing a student:\n");
        //   System.out.printf("%-10s %-20s %-10s %-20s%n",
        //         "Student ID", "Name", "Age", "Major");

        // System.out.println("--------------------------------------------------------------");

        // for (Student s : studentManager.getStudents()) {
        // System.out.printf("%-10s %-20s %-10d %-20s%n",
        //     s.getStudentId(),
        //     s.getName(),
        //     s.getAge(),
        //     s.getMajor());
        // }

    }
}