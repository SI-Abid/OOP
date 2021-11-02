/**
 * We have to calculate the total marks obtained in three subjects (each out of 100) 
 * by student A and in four subjects (each out of 100) by student B. Create an abstract class 
 * 'Marks' with an abstract method 'getTotalMarks'. It is inherited by two other classes 'A' 
 * and 'B' each having a method with the same name which returns the total marks of the students. 
 * The constructor of student A takes the marks in three subjects as its parameters and the marks 
 * in four subjects as its parameters for student B. Create an object for each of the two classes 
 * and print the total marks for both the students.
 */

abstract class Marks{
    public abstract int getTotalMarks();
}

class A extends Marks{
    private int a,b,c;
    public A(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getTotalMarks(){
        return a+b+c;
    }
}

class B extends Marks{
    private int a,b,c,d;
    public B(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public int getTotalMarks(){
        return a+b+c+d;
    }
}

public class Calculator {
    public static void main(String[] args) {
        A a = new A(70,80,90);
        B b = new B(80, 80,90,70);
        System.out.println("Total marks of student A = "+a.getTotalMarks());
        System.out.println("Total marks of student B = "+b.getTotalMarks());
    }
}
