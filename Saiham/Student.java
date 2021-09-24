package Saiham;

public class Student {
    public int id;
    public String name;
    public String department;
    public char section;

    Student() {
        this(102,'C',"Johny","LAW");
    }
    Student(int id, char sec, String name, String dept) {
        this.id = id;
        this.section = sec;
        this.name = name;
        this.department = dept;
    }
    public Student clone() {
        Student st = new Student(this.id,this.section,this.name,this.department);
        return st;
    }

    public void printInfo() {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Section: "+section);
        System.out.println("Department: "+department);
    }
}
