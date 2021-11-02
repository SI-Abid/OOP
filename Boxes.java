/**
 * Write a code, which will create a class Box which has two instance variable (width and height), 
 * a constructor to initialize instance variables with -1, a parameterized constructor to initialize 
 * the instance variables with the given parameters value and a method to print the volume of the box 
 * and also create another class BoxTwo which will inherit the property of Box class and add an extra 
 * instance variable depth. Then create a method volume to calculate volume of BoxTwo and print it by 
 * creating an object of this class.
 */
class Box{
    int width, height;
    public Box(){
        width=height=-1;
    }
    public Box(int w, int h){
        width=w;
        height=h;
    }
    public void volume() {
        System.out.println("Volume: "+width*height);
    }
}
class BoxTwo extends Box{
    int depth;
    public BoxTwo(int w, int h, int d){
        super(w,h);
        depth=d;
    }
    public void volume(){
        System.out.println("Volume: "+width*height*depth);
    }
}
public class Boxes {
    public static void main(String[] args) {
        BoxTwo box = new BoxTwo(10, 20, 30);
        box.volume();
    }
}
