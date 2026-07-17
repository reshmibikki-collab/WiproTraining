package Java_Fundamentals.AbstractClasses.com.mile1.main;

import Java_Fundamentals.AbstractClasses.com.mile1.bean.Student;
import Java_Fundamentals.AbstractClasses.com.mile1.exception.NullMarksArrayException;
import Java_Fundamentals.AbstractClasses.com.mile1.exception.NullNameException;
import Java_Fundamentals.AbstractClasses.com.mile1.exception.NullStudentObjectException;
import Java_Fundamentals.AbstractClasses.com.mile1.service.StudentReport;
import Java_Fundamentals.AbstractClasses.com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", new int[] {80, 70, 90});
        Student s2 = new Student(null, new int[] {60, 50, 40});
        Student s3 = new Student("Anu", null);

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        try {
            System.out.println("Student 1 Result : " + report.validate(s1));
            System.out.println("Student 2 Result : " + report.validate(s2));
            System.out.println("Student 3 Result : " + report.validate(s3));
        } catch (NullNameException | NullMarksArrayException e) {
            System.out.println(e.getMessage());
        }

        Student[] students = {s1, s2, s3};

        try {
            System.out.println("Students with Null Names : "
                    + service.findNumberOfNullNames(students));

            System.out.println("Students with Null Marks : "
                    + service.findNumberOfNullMarks(students));

        } catch (NullStudentObjectException e) {
            System.out.println(e.getMessage());
        }
    }
}