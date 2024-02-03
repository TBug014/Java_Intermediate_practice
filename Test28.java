// Multiple threads in java

class A extends Thread{
    public void run(){
        for(int i = 0;  i <=10; i++){
        System.out.println("Hi");

        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;  i <=10; i++){
        System.out.println("Hello");
        }
    }
}
public class Test28 {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();


    }
}
