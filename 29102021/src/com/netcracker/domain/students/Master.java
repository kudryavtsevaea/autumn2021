package com.netcracker.domain.students;

public class Master extends Student{

    private String facultyMaster;
    private Student student;

    public String getFacultyMaster(){return facultyMaster;}
    public void setFacultyMaster(String faculty){this.facultyMaster = faculty;}

    Master(String fullName){
        super(fullName);
    }

    Master(String fullName, long id){
        super(fullName, id);
    }

    Master(String fullName, long id, String faculty){
        super(fullName, id, faculty);
    }

    Master(String fullName, long id, String faculty, String facultyMaster){
        super(fullName, id, faculty);
        this.facultyMaster = facultyMaster;
    }

    @Override
    public String toString(){
        return "Student " + getFullName() + " with ID ¹" + getId() + " studied on faculty "
                + getFaculty() + " is studying now on faculty " + facultyMaster;
    }

}
