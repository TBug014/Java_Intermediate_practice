// Stream API

import java.util.Arrays;
import java.util.List;

public class Test36 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(7,4,5,6);

        // using for each method
        nums.forEach(n -> System.out.println(n));
        
        // using enhanced for loop
        for (int n : nums)
        {
            System.out.println(n);
        }

        int sum = 0;
        for(int n : nums){
            if(n%2 == 0){
                n = n*2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
    } 
}
