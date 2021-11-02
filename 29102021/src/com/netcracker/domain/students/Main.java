package com.netcracker.domain.students;

public class Main {
    public static void main(String[] args) {
      Student student = new Student("huihiuhuih");
      Master master = new Master("IVAN IVANOVICH IVANOV", 124356L, "KNIIT", "KNIIT");
        Master master2 = new Master("IVAN IVANOVICH IVANOV", 124356L, "KNIIT");
      System.out.println(student);
      System.out.println(master);
        System.out.println(master2);
    }
}
