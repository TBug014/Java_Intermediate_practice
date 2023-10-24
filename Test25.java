// Throws exception


class A{
    public void show() throws ClassNotFoundException{
        Class.forName("ABC");
    }
}
public class Test25 {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args)  {

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
