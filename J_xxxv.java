
public class J_xxxv {
    public static void main(String[] args) {        

        try {
            catchingMethod();
        } 
        catch (Throwable e) {
            System.out.println("Caught in main method");
            System.out.println(e.getMessage());
        }
        
    }
    static void catchingMethod() throws Exception {
        try {
            exceptionalMethod();
        }
        catch(Exception e) {
            System.out.println("Caught in catching method");
            System.out.println(e.getMessage());
            throw e;
        }
    }
    static void exceptionalMethod() throws Exception {
        throw new Exception("Catch this");
    }
}