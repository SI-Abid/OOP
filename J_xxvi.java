import java.util.Scanner;

class BillCalculator {

    static double calculateBasicBill(double unit) {
        double price=0;
        if(unit>=600)   
        {
            price+=(unit-599)*2;
            unit=599;
        }
        switch ((int) unit / 200) {
            case 2:
                price += (unit-399)*1.8;
                unit=399;
            case 1:
                price += (unit-199)*1.5;
                unit=199;
            case 0:
                price += unit*1.2;
        }
        return price;
    }

    static double calculateSurcharge(double basicBill) {

        return basicBill > 400 ? basicBill * 0.15 : 0;
    }

    static double getTotalBill(double unit) {
        double bill = calculateBasicBill(unit) + calculateSurcharge(unit);
        return bill < 100 ? 100 : bill;
    }
}

public class J_xxvi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(BillCalculator.getTotalBill(sc.nextDouble()) + " Tk");
        System.out.println(BillCalculator.getTotalBill(sc.nextDouble()) + " Tk");
        System.out.println(BillCalculator.getTotalBill(sc.nextDouble()) + " Tk");

        sc.close();

    }

}
// +s.substring(1)