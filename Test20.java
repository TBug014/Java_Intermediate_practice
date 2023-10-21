// Lamda expression with return
@FunctionalInterface
interface A{
    int add(int i,int j);
}
public class Test20 {
    public static void main(String[] args) {
        A obj = (i, j) -> i + j;
            int result = obj.add(10, 24);
                System.out.println(result);
    }
}
