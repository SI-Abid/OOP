import java.util.Scanner;

class Solid {
    private double height, width, depth;

    Solid() {
        height = width = depth = 0;
    }

    Solid(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double totalSurfaceArea() {
        return 2 * ((height * width) + (width * depth) + (height * depth));
    }

    public double volume() {
        return height * width * depth;
    }

    public void setDimension(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void setDimension(double[] dime) {
        if (dime.length < 3)
            return;
        height = dime[0];
        width = dime[1];
        depth = dime[2];
    }
}

public class J_vi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Solid cube1 = new Solid();
        Solid cube2 = new Solid(10.5, 5.4, 8);

        double[] param = { 7, 8, 9.6 };

        cube1.setDimension(param);

        System.out.println("Cube 1 total surface area = " + cube1.totalSurfaceArea());
        System.out.println("Cube 1 volume = " + cube1.volume());

        System.out.println("Cube 2 total surface area = " + cube2.totalSurfaceArea());
        System.out.println("Cube 2 volume = " + cube2.volume());

        scan.close();
    }
}
