package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        String[]   FIRSTNAME = {"William", "Peter", "Mary", "John", "Jane", "Jill", "Jack", "Angie", "Betsy", "Ann", "Laquesha", "Antonio",
        "Melvin", "Evelyn", "Dawn"};
        String[]   LASTNAME = { "Johnson", "Smith", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson",
                "Thomas", "Jackson", "White", "Harris"};
        int sCount = FIRSTNAME.length;
        List<Student>  studentList = new ArrayList<>();
        for (int i = 0; i < sCount; i++) {
            Student student = new Student();
            student.setFirstName(FIRSTNAME[i]);
            student.setLastName(LASTNAME[i]);
            student.setId(String.valueOf(i+1));
            student.setGrade("1");
            studentList.add(student);
        }
//        System.out.println(studentList);


        String[]   TFIRSTNAME = {"Abraham", "George", "Thomas"};
        String[]   TLASTNAME = { "lincoln", "Washington", "Jefferson"};
        int tCount = TFIRSTNAME.length;
        List<Teacher>  teacherList = new ArrayList<>();
        for (int i = 0; i < tCount; i++) {
            Teacher teacher = new Teacher();
            teacher.setFirstName(TFIRSTNAME[i]);
            teacher.setLastName(TLASTNAME[i]);
            teacher.setId(String.valueOf(i+101));
            teacher.setGrade("1");
            teacherList.add(teacher);
        }
//        System.out.println(teacherList);


        Set<Object> studentSet1 = new HashSet<>();
        Set<Object> studentSet2 = new HashSet<>();
        Set<Object> studentSet3 = new HashSet<>();

                for (int j = 0; j < sCount; j++) {
                    if (j < 5 ) {
                        studentSet1.add(studentList.get(j));
                    }   else if (j < 10) {
                            studentSet2.add(studentList.get(j));
                    }       else {
                                studentSet3.add(studentList.get(j));
                    }
//                    System.out.println("Student set1: " + studentSet1 + "\n" +
//                            "Student set2: " + studentSet2 + "\n" +
//                            "Student set3: " + studentSet3);

        }

        Map<Object, Object> teacherMap = new HashMap<>();
            teacherMap.put(teacherList.get(0), studentSet1);
            teacherMap.put(teacherList.get(1), studentSet2);
            teacherMap.put(teacherList.get(2), studentSet3);

        System.out.println(" --- Key Set ---- \n " + teacherMap.keySet() + "\n --- Values ---- \n " + teacherMap.values());

        System.out.println("\n ---- EntrySet Values ---- \n" + teacherMap.entrySet());


        }


    }

