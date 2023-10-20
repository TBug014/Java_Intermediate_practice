// Inner-class Example
class A{
    int age;
    public void show(){
        System.out.println("in Show");
    }
    class B{ // Inner Class //static can be used only for the inner class not the outside class
        public void config(){
            System.out.println("In Config");
        }
    }
}
public class Test08 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.config();
    }
}
