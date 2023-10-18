public class Test06 {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num ; // Autoboxing

        int num2 = num1.intValue();

        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3*3);
    }
}
