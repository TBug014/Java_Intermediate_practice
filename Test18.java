// Functional Interface

// Singgle abstract method interface or functional interface
@FunctionalInterface
interface A{
    void show();
}
// class B implements A{
//     public void show(){
//         System.out.println("In Show");
//     }
// }

public class Test18 {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
            System.out.println("In Show");
            }
        };
        obj.show();
    }
}
