//  Annotation uses
class A{
    
    public void show(){
        System.out.println("In show A");
    }
}

class B extends A{
    @Override // This is a annotation
    public void show(){
        System.out.println("In show B");
    }
}
public class Test17 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
