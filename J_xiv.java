import java.util.Scanner;

class Engine extends Thread{
    public static int max_torque, max_power, fuel_efficiency, fuel_level, dis_traveled;
    private Boolean is_running;
    public Engine(int t, int p) {
        max_torque = t;
        max_power = p;
        is_running = false;
        dis_traveled = 0;
    }
    public Engine() {
        this(0, 0);
    }
    public void run() {
        while (fuel_level>0 && is_running) {
            try {
                sleep(100);
                if(Car.speed>0)
                {
                    fuel_level--;
                    dis_traveled+=Car.speed;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(fuel_level==0 && is_running) {
            is_running = false;
            System.out.println("Engine is not running.");
            System.out.println("Out of fuel.");
        }
        
    }
    public void startcar() {
        is_running = true;
        start();
    }
    public void stopp() {
        is_running = false;
    }
    public void add_fuel(int f) {
        fuel_level += f;
    }

}
class Car extends Engine {
    // Class variables
    protected int maxspeed, weight, fuelcapacity;
    public static int speed;
    public Car(int eng_tor, int eng_pow, int ... props) {
        super(eng_tor, eng_pow);
        maxspeed = props[0]+0;
        weight = props[1]+0;
        fuelcapacity = props[2]+0;
        fuel_level = 0;
        speed = 0;
    }
    void accelerate(int throtle) {
        if(speed<maxspeed)
            speed+=throtle;
    }
    void brake(int throttle) {
        if(speed>0)
        speed-=throttle;
    }
    
    static void status() {
        System.out.println("Car speed: " + speed + " km/h");
        System.out.println("Car fuel level: " + fuel_level + " l");
        System.out.println("Car distance traveled: " + dis_traveled + " km");
    }
    
}

public class J_xiv {
    public static void main(String[] args) {
        Car car = new Car(400, 1000, 60, 2000, 100);
        Scanner scan = new Scanner(System.in);
        while(true) {
            int op;
            System.out.println("1. Accelerate\n2. Brake\n3. Show status\n4. Stop\n5. Re-fuel\n6. Exit\n7: Start");
            System.out.print("Enter operation: ");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    car.accelerate(10);
                    break;
                case 2:
                    car.brake(10);
                    break;
                case 3:
                    Car.status();
                    break;
                case 4:
                    car.stopp();
                    break;
                case 5:
                    car.add_fuel(100);
                    break;
                case 6:
                    scan.close();
                    System.exit(0);
                    break;
                case 7:
                    car.startcar();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
