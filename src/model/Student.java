package model;
import java.util.*;

public class Student {
    int id;
    String name;
    HashMap<Integer, Double> grades;
    List<Course> enrolledCourses;

    public Student(int id,String name){
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList();
        this.grades = new HashMap<>();

    }
    public void displayCourses(){
        for(Course course : enrolledCourses){
            System.out.println(course.getName());
        }
        for(int i=0;i<enrolledCourses.size();i++){
            System.out.println(enrolledCourses.get(i).getName());
        }

    }

    public void enrollCourse(Course course){
        enrolledCourses.add(course);

    }

    public boolean setGrade(Course course, double grade){
        if(enrolledCourses.contains(course)){
            grades.put(course.getId(),grade);
            return true;
        }

        return false;

    }
    public double calculateGpa(){
        double gpa = 0.0;
        int totalCredits = 0;
        double gpaValue = 0.0;
        for(int i =0;i<enrolledCourses.size();i++){
            int credit = enrolledCourses.get(i).getCredit();
            double grade = grades.get(i);
            gpaValue = credit * grade;
            totalCredits += credit;
        }
        gpa = gpaValue/totalCredits;
        return gpa;

    }
    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    }
    public static void main(String[]args){
        Student aStudent = new Student(1,"cole");

    }


}
