
public class Utensil {

    private String text;
    private int code;
    private char hex;
    public static String name;
    // static varriable is shared across all the objects !

    public Utensil() {
        text="";
        code=0;
        hex='0';
    }

    public Utensil(String t, int c, char h) {
        text=t;
        code=c;
        hex=h;
    }
    
    public void getAttr() {
        System.out.println(name);
        System.out.println(text+" "+code+" "+hex);
    }

    public void setAttr(String t, int c, char h, String n) {
        text=t;
        code=c;
        hex=h;
        name=n;
    }

}

/*
class ClassName {
    
    // instance varriable
    // class varriable

    ClassName() {
        ...
    }
    
    ClassName(...) {
        ...
    }



}
*/