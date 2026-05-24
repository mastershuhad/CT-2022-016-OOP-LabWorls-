package Q5;
import java.util.*;

class Course{
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public String getCourseName(){
        return courseName;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public Lecturer getLecturer(){
        return lecturer;
    }

    public void setCourseName(String Cname){
        courseName = Cname;
    }

    public void setCourseCode(String Ccode){
        courseCode = Ccode;
    }

    public void setLecturer(Lecturer lecturer){
        this.lecturer = lecturer;
    }
}

class Lecturer{
    private String lecturerName;
    private String courseTeaching;

    public Lecturer(){
        lecturerName = "Unknown";
        courseTeaching = "Unknown";
    }
    public String getLecturerName(){
        return lecturerName;
    }
    public void setLecturerName(String Lname){
        lecturerName = Lname;
    }

    public String getCourseTeaching(){
        return courseTeaching;
    }

    public void setCourseTeaching(String CTeach){
        courseTeaching = CTeach;
    }
}

class Student{
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public String getStuName(){
        return studentName;
    }
    public String getDegreeName(){
        return degreeName;
    }
    public String getCourseFollow(){
        return courseFollowing;
    }

    public void setStuName(String name){
        studentName = name;
    }
    public void setDegreeName(String Dname){
        degreeName = Dname;
    }
    public void setCourseFollow(String course){
        courseFollowing = course;
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println(" This Java program for a university course registration system\n");

        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr.Peris");
        lecturer.setCourseTeaching("OOP");

        Course course1 = new Course();
        course1.setCourseName("Object Oriented Programming");
        course1.setCourseCode("OOP101");
        course1.setLecturer(lecturer);

        Student student1 = new Student();
        student1.setStuName("kamal");
        student1.setDegreeName("BSc in IT");
        student1.setCourseFollow("Object Oriented Programming");

        System.out.println("Course Details");
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Course Code: " + course1.getCourseCode());

        System.out.println("\nLecturer Details");
        System.out.println("Lecturer Name: " + lecturer.getLecturerName());
        System.out.println("Course Teaching: " + lecturer.getCourseTeaching());

        System.out.println("\nStudent Details");
        System.out.println("Student Name: " + student1.getStuName());
        System.out.println("Degree Name: " + student1.getDegreeName());
        System.out.println("Course Following: " + student1.getCourseFollow());

    }
}

