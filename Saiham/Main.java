package Saiham;

public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        Student s2 = s1.clone();
        Student s3 = s1.clone();

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        s2.department = "CSE";
        s3.name = "Sukanto";

        System.out.println("------------------------------");
        
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}