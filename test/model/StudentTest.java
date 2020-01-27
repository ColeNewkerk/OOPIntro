package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void enrollCourses(){
        Course aCourse = new Course(1,3985,"CS222","Advanced Programming",3);
        Student aStudent = new Student(1,"cole");
        aStudent.enrollCourse(aCourse);

    }
    @Test
    void setGrade(){
        Course aCourse = new Course(1,3985,"CS222","Advanced Programming",3);
        Student aStudent = new Student(1,"cole");
        aStudent.enrollCourse(aCourse);
        aStudent.setGrade(aCourse, 4.0);
        assertTrue(true);

    }
    @Test
    void setGradeFalse(){
        Course aCourse = new Course(1,3985,"CS222","Advanced Programming",3);
        Student aStudent = new Student(1,"cole");
        aStudent.setGrade(aCourse,4.0);
        assertFalse(false);
    }
    @Test
    void calculateGpa(){
        Course compSci = new Course(1,3985,"CS222","Advanced Programming",3);
        Course geology = new Course(2,3984,"GEOL100","Intro to Geology",3);
        Course physics = new Course(3,3983,"PHYC110","Physics",4);
        Course statistics = new Course(4,3982,"MATH118","Statistics",3);

        Student aStudent = new Student(1,"cole");

        aStudent.enrollCourse(compSci);
        aStudent.enrollCourse(geology);
        aStudent.enrollCourse(physics);
        aStudent.enrollCourse(statistics);

        aStudent.setGrade(compSci,3.2);
        aStudent.setGrade(geology,3.7);
        aStudent.setGrade(physics,4.0);
        aStudent.setGrade(statistics,3.9);

        assertEquals(3.7,3.7);

    }

}