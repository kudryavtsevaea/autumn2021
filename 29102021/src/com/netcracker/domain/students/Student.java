package com.netcracker.domain.students;


public class Student {
    private String fullName;
    private long id;
    private String faculty;

    public String getFullName(){return fullName;}
    public void setFullName(String name){this.fullName = name;}

    public long getId(){return id;}
    public void setId(long id){this.id = id;}

    public String getFaculty(){return faculty;}
    public void setFaculty(String faculty){this.faculty = faculty;}

    Student(String fullName){
       this.fullName = fullName;
    }

    Student(String fullName, long id){
        this(fullName);
        this.id = id;
    }

    Student(String fullName, long id, String faculty){
        this(fullName, id);
        this.faculty = faculty;
    }
    @Override
    public String toString(){
        return "Student " + fullName + " with ID ¹" + id + " is  studying on faculty " + faculty;
    }
}
