import java.util.Scanner;

// Q1
interface ReptileInterface {
    public void setName(String name);

    public String getName();

    public int getAge();

    public void setAge(int age);

    public String getSpecies();
}

// Q2
class Lizard implements ReptileInterface {
    private String name;
    private String species;
    private int age;

    public Lizard() {
        name = "Lizard";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

}

// Q3
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many Lizard you wanna pet?");
        int size = sc.nextInt();
        Lizard lili[] = new Lizard[size];

        for (int i=0; i<size; i++) {
            lili[i] = new Lizard();

            System.out.print("Lizard's Name? ");
            lili[i].setName(sc.next());
            System.out.print("Age of the lizard? ");
            lili[i].setAge(sc.nextInt());
        }
        

        for (int i = 0; i < size; i++) {
            System.out.println("-----------------");
            System.out.println(lili[i]);
            System.out.println(lili[i].getName());
            System.out.println(lili[i].getAge());
        }

        sc.close();
    }
}