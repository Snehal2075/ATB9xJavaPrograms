package Nov.ex_21112024;

import java.util.ArrayList;
import java.util.List;

public class Lab061_Class {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 23);
        Student s2 = new Student("Prachiti", 12);
        Student s3 = new Student("Shristi", 22);

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

        System.out.println(myStudents);

    }
    }

