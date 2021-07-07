
class Stack {
    private int arr[], top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }
    public int pop() throws Exception
    {
        if(top<0)
        {
            throw new Exception("Underflow");
        }
        else
        {
            return arr[top--];
        }
    }
    public void push(int x) throws Exception
    {
        if(top<arr.length-1)
        {
            arr[++top]=x;
        }
        else
        {
            throw new Exception("Overflow");
        }
    }

}
public class J_iv {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        try {
            
            System.out.println("Popping "+stack.pop());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        
        for (int i = 0; i < 15; i++) {
            try {
                
                stack.push(i+1);
                System.out.println("Pushing "+(i+1));

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i < 15; i++) {
            try {
                
                System.out.println("Popping "+stack.pop());

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
      
    }
}
