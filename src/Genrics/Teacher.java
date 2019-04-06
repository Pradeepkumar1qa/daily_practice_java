package Genrics;

import java.util.Objects;

public class Teacher<T> {
    Object[] enrollment;
    int count;
    public Teacher(){
        this.enrollment=new Object[4];
    }

    public void display(){
        for(int j=0;j<enrollment.length;j++){
            System.out.println(enrollment[j]);
        }
    }
    public void add(T e){
        this.enrollment[count++]=e;
    }
    public static void main(String[] args) {
        Teacher<ParentStudent> teacher=new Teacher<>();
        teacher.add(new Student("pradeep kumar"));
        teacher.add(new Student("dipti sharma"));
        teacher.add(new StudentNew("sharma","255","25"));
        teacher.add(new StudentNew("bijender","366","28"));
        teacher.display();

    }
}
