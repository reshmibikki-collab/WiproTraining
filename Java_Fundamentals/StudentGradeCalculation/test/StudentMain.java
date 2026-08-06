package com.mile1.test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

public class StudentMain {

    public static void main(String[] args) {

        int[] marks = {85, 75, 90};

        Student student = new Student("Reshmitha", marks);

        StudentReport report = new StudentReport();

        try {

            String result = report.validate(student);
            System.out.println(result);

            String grade = report.findGrades(student);
            System.out.println("Grade: " + grade);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}