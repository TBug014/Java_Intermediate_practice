// Stream API

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test38 {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(5,4,6,8,9,2);
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2 ==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c +e);

        // short 
        int result = nums.stream()
            .filter(n -> n%2==0)
            .map(n -> n*2)
            .reduce (0, (c,e)-> c+e);


        System.out.println(result);
        // We can only use the stream only once 
        // s3.forEach(n -> System.out.println(n));

    }
}
