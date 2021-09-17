
interface Sender {
    boolean isPlayer();
}

class Console implements Sender {
    public boolean isPlayer() {
        return false;
    }
}

class Player implements Sender {
    public String name;
    public boolean isPlayer() {
        return true;
    }
}

class Executor {
    static void runCommand(Sender s, String arg) {
        // if(s instanceof Player)
        if(s.isPlayer()) {
            Player p = (Player) s;
            String trigger = arg.split(" ")[0];
            String msg = arg.replaceFirst(trigger, "");
            switch (trigger) {
                case "greet":
                    System.out.println("Hey "+p.name+", "+msg);
                    break;
                
                default:
                    break;
            }
        } else {
            System.out.println("This is a player only command.");
        }
    }
}

public class J_xxxiv {
    public static void main(String[] args) {

        Console c = new Console();
        
        Player p = new Player();
        p.name="sia_cat";
        
        Executor.runCommand(c, "greet Hello world");
        Executor.runCommand(p, "greet Hello world");

    }
}

// String s = "ABCDEFG";
// System.out.println("Input\n"+s);
// System.out.println("\nOutput");
// for(int i=0; i<s.length(); i++)
// {
//     for(int j=i; j<s.length()+i; j++)
//     {
//         System.out.print(s.charAt(j%s.length())+" ");
//     }
//     System.out.println();
// }
