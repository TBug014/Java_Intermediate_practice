interface A{
    // Final and Static variable can be used only
    int age = 12;
    String area = "Delhi";

    void show();
    void config();
}
class B implements A{
    public void show() {
        System.out.println("In Show");
    }
    public void config() {
        System.out.println("In Config");
    }   
}
public class Test12 {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        // A.area = "Bangalore"; // we cannot change final variable

        System.out.println(A.age + ":" + A.area);
    }
}
