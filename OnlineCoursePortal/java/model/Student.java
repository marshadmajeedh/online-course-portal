package model;

import course.Course;
import course.Material;
import interfaces.Enroll;
import interfaces.ViewContent;
import validators.CourseValidator;

import javax.xml.validation.Validator;
import java.util.ArrayList;

public class Student extends Person implements Enroll, ViewContent {

    private String studentID;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, int age,String studentID) {
        super(firstName, lastName, age);
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    @Override
    public void login() {
        System.out.println("Student Logged in");

    }

    @Override
    public void enroll(Course course, Material material) {

        CourseValidator.validateCourse(course, material);
        courses.add(course);
    }

    @Override
    public void viewContent() {

        System.out.println("Enrolled courses : ");
        for (Course course : courses) {
            System.out.println(course);
        }

    }

    public String toString() {

        return "Student first name : "+getFirstName() +"\n"+
                "last name : "+getLastName()+"\n"+
                "age : "+getAge()+"\n"+
                "ID : "+studentID+"\n"+
                "Courses : "+courses;
    }

}
