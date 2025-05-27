package model;

//Design an online learning platform where different types of users (students, instructors, admins) log in. Instructors can upload materials, students can enroll and view content, admins can manage users.
//
//🔹 Focus: Inheritance, Abstract Classes, Interfaces
abstract class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    abstract void login();

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person() {}

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

}
