// parent

class A{    
    public void show(){
        System.out.println("In show A");
    }
}

// Child

class B extends A{
    public void show(){
        System.out.println("In Show B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In Show C");
    }

}
public class Test02{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
        
        obj = new C();
        obj.show();
    }
}