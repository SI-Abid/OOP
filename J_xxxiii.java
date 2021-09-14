interface Size {
    static void show() {
        System.out.println("Very big");
    }
}
abstract class figure {
    int x, y;
    
    figure(int x, int y) {
        this.x=x;
        this.y=y;
    }
    abstract void area();
}

class triangle extends figure {
    triangle(int x, int y) {
        super(x, y);
    }
    void area() {
        System.out.println("Area of triangle "+x*y*0.5);
    }
}
class square extends figure {
    square(int x, int y) {
        super(x, y);
    }
    void area() {
        System.out.println("Area of square "+x*y);
    }
}

public class J_xxxiii {
    public static void main(String[] args) {
        figure a = new triangle(10, 20);
        a.area();
        a = new square(10, 20);
        a.area();
        Size.show();
    }
}
