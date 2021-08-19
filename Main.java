import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Bus {
    String ID, name, dest, from;

    Bus(String name, String dest, String from) {
        this.name = name;
        this.dest = dest;
        this.from = from;
        this.ID = this.toString().split("@")[1];
    }

    void enrollAgency(BasicTravelAgency b, Bus a) {
        b.addAffiliates(a);
    }
}

abstract class TravelAgency {
    private int budget, limit;
    private String ID, name;
    private String status;
    private ArrayList<Bus> affiliates;

    public TravelAgency() {
    }

    public TravelAgency(String name, int budget, String status) {
        this.ID = this.toString().split("@")[1];
        this.name = name;
        this.budget = budget;
        this.status = status;
        affiliates = new ArrayList<Bus>();
        if (status == "Basic") {
            limit = 5;
        } else {
            limit = 7;
        }
    }

    String getID() {
        return ID;
    }

    String getName() {
        return name;
    }

    int getBudget() {
        return budget;
    }

    String getStatus() {
        return status;
    }

    void setID(String id) {
        ID = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBudget(int budget) {
        this.budget = budget;
    }

    void setStatus(String status) {
        this.status = status;
    }

    void showAffiliates() {
        System.out.println("All bus company: ");
        for (Bus bus : affiliates) {
            System.out.println(bus.name);
        }
    }

    void addAffiliates(Bus b) {
        if (affiliates.size() < limit) {
            affiliates.add(b);
        }
    }

    void removeAffiliates(String s) {
        for (Bus b : affiliates) {
            if (b.name == s) {
                affiliates.remove(b);
                break;
            }
        }
    }

    void tostring() {
        System.out.println("Name------From------To");
        for (Bus bus : affiliates) {
            System.out.println(bus.name + " " + bus.from + " " + bus.dest);
        }
    }

    void addBudget(double amount) {
        budget += amount;
    }

    double withdraw(double amount) {
        if (status == "Basic") {
            if (4 * amount <= budget) {
                return amount;
            } else {
                return 0;
            }
        } else if (2 * amount <= budget) {
            return amount;
        } else {
            return 0;
        }
    }
}

class BasicTravelAgency extends TravelAgency {

    public BasicTravelAgency(String name, int budget) {
        super(name, budget, "Basic");
    }

}

class PremiumTravelAgency extends TravelAgency {
    public PremiumTravelAgency(String name, int budget) {
        super(name, budget, "Premium");
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("in.txt"));

            Bus b[] = new Bus[10];

            for (int i = 0; i < 10; i++) {
                String name, dest, from;
                System.out.print("Enter Bus name(" + (i + 1) + "): ");
                name = sc.nextLine();
                System.out.print("Enter destination: ");
                dest = sc.nextLine();
                System.out.print("Enter Reporting location: ");
                from = sc.nextLine();
                b[i] = new Bus(name, dest, from);
            }

            PremiumTravelAgency p1, p2;
            BasicTravelAgency b1, b2, b3;

            String name;
            int budget;

            System.out.print("Enter the name of First Premium Travel Agency: ");
            name = sc.nextLine();
            System.out.print("Enter the budget: ");
            budget = sc.nextInt();
            String garbage = sc.nextLine();
            p1 = new PremiumTravelAgency(name, budget);

            System.out.print("Enter the name of Second Premium Travel Agency: ");
            name = sc.nextLine();
            System.out.print("Enter the budget: ");
            budget = sc.nextInt();
            garbage = sc.nextLine();

            p2 = new PremiumTravelAgency(name, budget);

            System.out.print("Enter the name of First Basic Travel Agency: ");
            name = sc.nextLine();
            System.out.print("Enter the budget: ");
            budget = sc.nextInt();
            garbage = sc.nextLine();
            b1 = new BasicTravelAgency(name, budget);

            System.out.print("Enter the name of Second Basic Travel Agency: ");
            name = sc.nextLine();
            System.out.print("Enter the budget: ");
            budget = sc.nextInt();
            garbage = sc.nextLine();
            b2 = new BasicTravelAgency(name, budget);

            System.out.print("Enter the name of Third Basic Travel Agency: ");
            name = sc.nextLine();
            System.out.print("Enter the budget: ");
            budget = sc.nextInt();
            garbage = sc.nextLine();
            b3 = new BasicTravelAgency(name, budget);

            for (int i = 0; i < 7; i++) {
                p1.addAffiliates(b[i]);
            }

            for (int i = 2; i < 9; i++) {
                p2.addAffiliates(b[i]);
            }

            for (int i = 0; i < 5; i++) {
                b1.addAffiliates(b[i]);
            }

            for (int i = 5; i < 10; i++) {
                b2.addAffiliates(b[i]);
            }

            for (int i = 2; i < 7; i++) {
                b3.addAffiliates(b[i]);
            }

            p1.tostring();
            p1.tostring();
            b1.tostring();
            b2.tostring();
            b3.tostring();

            System.out.print("Kun bus walare bash ditay: ");
            String victim = sc.nextLine();
            p1.removeAffiliates(victim);
            p2.removeAffiliates(victim);
            b1.removeAffiliates(victim);
            b2.removeAffiliates(victim);
            b3.removeAffiliates(victim);

            p1.tostring();
            p1.tostring();
            b1.tostring();
            b2.tostring();
            b3.tostring();

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}