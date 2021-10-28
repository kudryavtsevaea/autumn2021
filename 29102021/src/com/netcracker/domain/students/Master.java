package com.netcracker.domain.students;

public class Master extends Student{

    private String facultyMaster;

    public String getFacultyMaster(){return facultyMaster;}
    public void setFacultyMaster(String faculty){this.facultyMaster = faculty;}

    Master(String fullName){
        super(fullName);
    }

    Master(String fullName, long ID){
        super(fullName, ID);
    }

    Master(String fullName, long ID, String faculty){
        super(fullName, ID, faculty);
    }

    Master(String fullName, long ID, String faculty, String facultyMaster){
        super(fullName, ID, faculty);
        this.facultyMaster = facultyMaster;
    }

    @Override
    public String toString(){
        return "Student " + getFullName() + " with ID ¹" + getID() + " studied on faculty "
                + getFaculty() + " is studying now on faculty" + facultyMaster;
    }

}
