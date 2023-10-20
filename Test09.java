
class A{
    public void show(){
        System.out.println("In A Show");
    }
}
// class B extends A{
//     public void show(){
//         System.out.println("In B Show");
//     }
// }

public class Test09 {
    public static void main(String[] args) {
        A obj = new A(){
        public void show(){  // inner class - Annonymous inner class
            System.out.println("In new Show");
    }
        };
        obj.show();
    }
}
