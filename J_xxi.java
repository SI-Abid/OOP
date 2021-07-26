/**
 * conics
 * parabola
 * hyperbola
 * ellipse
 */
class conics {
    static String parser() {
        String s = "5x2 + 2xy + 5y2 + 26x + 34y + 65";
		String[] args = s.split(" ");
        String result = "";
		String patterns[] = {"[0-9][0-9]","[0-9]+[a-z]","[0-9]+[a-z][a-z]","[0-9]+[a-z]+[0-9]"};
		//parse s and get all numbers
		for (int i = 0; i < args.length; i++) {
			for (String pattern: patterns) 
				if (args[i].matches(pattern))
					result += args[i] + " ";
		}
		return result;
	}
}

public class J_xxi {
    public static void main(String[] args) {
		System.out.println(conics.parser());
	}
}