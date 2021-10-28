package com.netcracker.domain.students;


public class Student {
    private String fullName;
    private long ID;
    private String faculty;

    public String getFullName(){return fullName;}
    public void setFullName(String name){this.fullName = name;}

    public long getID(){return ID;}
    public void setID(long id){this.ID = id;}

    public String getFaculty(){return faculty;}
    public void setFaculty(String faculty){this.faculty = faculty;}

    Student(String fullName){
       this.fullName = fullName;
    }

    Student(String fullName, long ID){
        this(fullName);
        this.ID = ID;
    }

    Student(String fullName, long ID, String faculty){
        this(fullName, ID);
        this.faculty = faculty;
    }
    @Override
    public String toString(){
        return "Student " + fullName + " with ID ¹" + ID + " is  studying on faculty " + faculty;
    }
}
