public class Test22 {
    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        // Exception Handling

        int nums[] = new int[5];
        String str = null;

        try
        {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[4]);

        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero. " );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay with array limit.");
        }
    
        // parent class should be at the end
    
        catch(Exception e)
        {
            System.out.println("Something went wrong." + e);
        }

        System.out.println(j);
        System.out.println("Bye");

    }
}
