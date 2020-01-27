package model;

public class Course {
    int courseId;
    int code;
    String courseName;
    String description;
    int credit;

    public Course(int courseId, int code, String courseName, String description, int credit){
        this.courseId = courseId;
        this.code = code;
        this.courseName = courseName;
        this.description = description;
        this.credit = credit;

    }

    public int getId(){
        return courseId;
    }
    public int getCode(){
        return code;
    }
    public String getName(){
        return courseName;
    }
    public String getDescription(){
        return description;
    }
    public int getCredit(){
        return credit;
    }
}
