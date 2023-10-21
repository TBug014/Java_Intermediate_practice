interface A{
    // Final and Static variable can be used only
    int age = 12;
    String area = "Delhi";

    void show();
    void config();
}
// class to class -> extends
// 

interface X{
    void run();
}
interface Y extends X{
    
}

class B implements A,Y{
    public void show() {
        System.out.println("In Show");
    }
    public void config() {
        System.out.println("In Config");
    }
    public void run() {
        System.out.println("Running");
    }   
}
public class Test13 {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        X obj1 = new B(); 
        obj1.run();

        // A.area = "Bangalore"; // we cannot change final variable

        System.out.println(A.age + ":" + A.area);
    }
}
