//  Need for interface
interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, develop, compile , run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, develop, compile , run : Faster");
    }
}
class Dev{
    public void devApp(Computer Lap){
        Lap.code();
    }
}
public class Test11 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Dev Partha = new Dev();
        Partha.devApp(lap);
        Partha.devApp(desk);
    }
}
 