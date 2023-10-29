// Sealed Classes

sealed class A  extends Thread implements Clonable permits B,C{

}

non-sealed class B extends A{

}

final class C extends A{

}
final class D extends B{

}
sealed interface X permits Y{

}

sealed interface Y extends X{

}
public class Test41 {
    public static void main(String[] args) {
        
    }
}
