package validators;

import course.Course;
import course.Material;
import exception.EnrollmentFailException;

public class CourseValidator {

    public static void validateCourse(Course course, Material material) {

        if (!course.getName().equals(material.getName())) {

            throw new EnrollmentFailException("Enrollment failed : course name does not match course id");

        }
        else if  (!course.getId().equals(material.getId())) {

            throw new EnrollmentFailException("Enrollment failed : course name does not match course id");
        }
    }
}
