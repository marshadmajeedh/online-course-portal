package model;

import java.util.ArrayList;

public class Admin extends Person {

        private ArrayList<Student> students;
        private ArrayList<Instructor> instructors;

        public Admin() {

            this.students = new ArrayList<>();
            this.instructors = new ArrayList<>();
        }
        @Override
        public void login() {
            System.out.println ("Admin Logged in");
        }

        public void addStudent(Student student) {
            this.students.add(student);
        }
        public void addInstructor(Instructor instructor) {
            this.instructors.add(instructor);
        }

        public void displayUsers() {

            System.out.println ("Student details");
            for (Student student : students) {
                System.out.println(student);
                System.out.println();
            }

            System.out.println ("Instructor details");
            for (Instructor instructor : instructors) {
                System.out.println(instructor);
            }
        }



    }
