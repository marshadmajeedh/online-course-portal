import course.Material;
import course.Course;
import exception.EnrollmentFailException;
import model.Admin;
import model.Instructor;
import model.Student;

public class OnlineCoursePortal {
    public static void main(String[] args) {

        Material material1 = new Material("SE1020","DSA");
        Material material2 = new Material("SE1030","OOP");

        Course course1 = new Course("DSA","SE1020");
        Course course2 = new Course("OOP","SE1030");

        Instructor ins = new Instructor("Ilham","Aqeel",23,"INS1020");
        ins.login();

        System.out.println("Instructor uploading courses : ");
        ins.uploadMaterial(material1);
        ins.uploadMaterial(material2);

        ins.displayMaterials();
        System.out.println();

        Student st = new Student("Marshad","Ahamedh",20,"IT24102580");

        st.login();

        System.out.println("Student enrolling for courses : ");

        try {
            st.enroll(course1, material1);

        } catch (EnrollmentFailException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        try {
            st.enroll(course2, material2);

        } catch (EnrollmentFailException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        st.viewContent();
        System.out.println();

        Admin admin = new Admin ();
        admin.login();
        System.out.println("Admin managing users : ");
        admin.addStudent(st);
        admin.addInstructor(ins);

        admin.displayUsers();

    }

}
