package model;

import interfaces.MaterialUpload;
import course.Material;

import java.util.ArrayList;

public class Instructor extends Person implements MaterialUpload {

    private String instructorID;
    private ArrayList<Material> uploadCourses;

    public Instructor(String firstName, String lastName, int age,String instructorID) {
        super(firstName,lastName,age);
        this.instructorID = instructorID;
        uploadCourses = new ArrayList<>();
    }

    @Override
    public void login() {
        System.out.println ("Instructor Logged in");
    }

    @Override
    public void uploadMaterial(Material material) {
        uploadCourses.add(material);
    }

    public void displayMaterials() {

        for (Material material : uploadCourses) {
            System.out.println(material);
        }
    }

    public String toString() {

        return "model.Instructor first name: " + getFirstName() +"\n"+
                "last name : "+getLastName()+"\n"+
                "age : "+getAge()+"\n"+
                "instructorID : "+instructorID+"\n"+
                "Instructing courses : "+uploadCourses;
    }

}
