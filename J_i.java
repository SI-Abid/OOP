/**
 * InnerJa
 */
class InnerJa
{
    static void print(String text)
    {
        System.out.println(text);
    }
}
/**
 * Ja -- main
 */
public class J_i
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        InnerJa.print(greeting());
        OuterJa.work();
    }

    public static String greeting()
    {
        String str = "Welcome to the java programming";
        return str;
    }
}
/**
 * OuterJa
 */
class OuterJa 
{
    static void work()
    {
        String str = J_i.greeting();
        String[] arr = str.split(" ");
        for (String string : arr) 
        {
            System.out.println(string);
        }
    }
}