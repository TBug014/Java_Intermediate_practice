// Lamda Expression
@FunctionalInterface
interface A{
    void show(int i);
}

public class Test19 {
    public static void main(String[] args) {
        A obj = i ->  // Lamda Expression to reduce the systactical code
            System.out.println("In Show : " + i);
        obj.show(5);
    }
}
