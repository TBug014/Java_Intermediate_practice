
enum Status{
    Running, Failed, Pending, Success;
}
public class Test15 {
    public static void main(String[] args) {
        Status s = Status.Running;

        // Switch Statements

        switch(s){
            case Running :
                System.out.println("All good");
                break;
            case Failed :
                System.out.println("Try Again");
                break;
            case Pending :
                System.out.println("Please Wait");
                break;
            case Success :
                System.out.println("Done");
                break;
        }


        // If Statement

        // if(s == Status.Running)
        //     System.out.println("All Good");
        // else if(s == Status.Failed)
        //     System.out.println("Try Again");
        // else if(s == Status.Pending)
        //     System.out.println("Please Wait");
        // else
        //     System.out.println("Done");
    }  
}
