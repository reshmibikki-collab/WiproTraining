package Java_Fundamentals.AbstractClasses.com.mile1.service;

import Java_Fundamentals.AbstractClasses.com.mile1.bean.Student;
import Java_Fundamentals.AbstractClasses.com.mile1.exception.NullStudentObjectException;

public class StudentService {

    public int findNumberOfNullMarks(Student[] students)
            throws NullStudentObjectException {

        if (students == null) {
            throw new NullStudentObjectException();
        }

        int count = 0;

        for (Student student : students) {
            if (student == null) {
                throw new NullStudentObjectException();
            }

            if (student.marks == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students)
            throws NullStudentObjectException {

        if (students == null) {
            throw new NullStudentObjectException();
        }

        int count = 0;

        for (Student student : students) {
            if (student == null) {
                throw new NullStudentObjectException();
            }

            if (student.name == null) {
                count++;
            }
        }

        return count;
    }
}