package Java_Fundamentals.AbstractClasses.com.mile1.service;

import Java_Fundamentals.AbstractClasses.com.mile1.bean.Student;
import Java_Fundamentals.AbstractClasses.com.mile1.exception.NullMarksArrayException;
import Java_Fundamentals.AbstractClasses.com.mile1.exception.NullNameException;

public class StudentReport {

    public String validate(Student student)
            throws NullNameException, NullMarksArrayException {

        if (student.name == null) {
            throw new NullNameException();
        }

        if (student.marks == null) {
            throw new NullMarksArrayException();
        }

        int sum = 0;

        for (int mark : student.marks) {
            sum += mark;
        }

        double avg = sum / student.marks.length;

        if (avg >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}