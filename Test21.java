// Exceptions / these are runtime errors


// runtime errors
public class Test21 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        // Exception Handling
        try
        {
            j = 18/i;

        }
        catch(Exception e){
            System.out.println("Something Went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");

    }
}
