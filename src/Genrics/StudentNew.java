package Genrics;

public class StudentNew extends ParentStudent {
    String name;
    String rollno;
    String age;

    public StudentNew(String name,String rollno,String age){
        this.name=name;
        this.rollno=rollno;
        this.age=age;
    }
    public String toString(){
       return this.name+"\t"+this.age+"\t"+this.rollno;
    }
}
