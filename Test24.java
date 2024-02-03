//Custom Exception 

class ParthaException extends Exception{
    public ParthaException(String string)
    {
        super(string);
    }
}

public class Test24 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
            if (j == 0)
                throw new ParthaException("I dont want to print zero");
        }
        catch(ParthaException e){
            j = 18/1;
            System.out.println("Thats the default output. ");
        }
      
        catch(Exception e)
        {
            System.out.println("Something went wrong." + e);
        }

        System.out.println(j);
    }
}

