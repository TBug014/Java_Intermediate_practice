// forEach Method in java

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test37 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,6,7,9,8);


        // Long method
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n ){
                System.out.println(n);
            }
        };
        nums.forEach(con);

        // Short Method
        // nums.forEach(n -> System.out.println(n));



    }
}
