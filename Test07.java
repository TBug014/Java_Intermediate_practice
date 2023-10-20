abstract class car{ // abstract class
    public abstract void drive();
    public abstract void fly();


    public void playMusic(){
        System.out.println("Play Music");
    }
}
abstract class WagonR extends car{


    public void drive(){
        System.out.println("Driving");
    }
}

class UpdatedWagonR extends WagonR{ // concrete class
    public void fly(){
        System.out.println("Flying");
    }
}

public class Test07 {
    public static void main(String[] args) {
        car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
