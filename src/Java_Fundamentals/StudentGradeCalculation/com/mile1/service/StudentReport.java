package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {

    public String validate(Student s)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException,
                   MarksOutOfBoundException {

        if (s == null)
            throw new NullStudentException();

        if (s.name == null || s.name.trim().isEmpty())
            throw new NullNameException();

        if (s.marks == null)
            throw new NullMarksArrayException();

        for (int mark : s.marks) {
            if (mark < 0 || mark > 100)
                throw new MarksOutOfBoundException();
        }

        return "VALID";
    }

    public String findGrades(Student s) {

        int total = 0;

        for (int mark : s.marks) {
            total += mark;
        }

        int avg = total / s.marks.length;

        if (avg >= 80)
            return "A";
        else if (avg >= 60)
            return "B";
        else if (avg >= 40)
            return "C";
        else if (avg >= 35)
            return "D";
        else
            return "F";
    }
}