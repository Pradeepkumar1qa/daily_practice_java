package Genrics;

public class Student extends ParentStudent {
    String name;
    public  Student(String name){
        this.name=name;
    }
    @Override
    public String  toString(){
        return this.name;
    }
}
