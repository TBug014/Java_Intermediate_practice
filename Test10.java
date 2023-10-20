// Abstract and Annonymous Inner Class 

abstract class A{
    public abstract void show();
    public abstract void config();
}
// class B extends A{

// }

public class Test10 {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In B Show");
            }
            public void config(){
                System.out.println("In Config");
            }
    
        };
        obj.show();
        obj.config();
    }
}
