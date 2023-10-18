// Final keyword - Variable , method, class



//  Variable

// public class Test03 {
//     public static void main(String[] args) {
//         final int num = 8; // value will be constant
//         // num = 9; // cannot change the value is we use the final keyword
//         System.out.println(num);
//     }    
// }

// Class , Method

class Calc{
    // to stop someone from method overriding we will use final keyword in below
    public final void show(){
        System.out.println("in Partha");
    }
    public void add(int a, int b){
        System.out.println(a+b);

    }
}
class AdvCalc extends Calc{
    //     public void show(){
    //     System.out.println("in Partha");
    // }
}


public class Test03{
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(10, 20);
    }
}