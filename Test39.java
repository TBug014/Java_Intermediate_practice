// Map Filter Reduce sorted


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test39 {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(5,4,6,8,9,2);      




        // Function //
        // Function<Integer, Integer> fun = new Function<Integer,Integer>() {
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     }   
        // };

        // Predicate //
        // Predicate <Integer> p = new Predicate<Integer>() {

        //     public boolean test(Integer n) {

        //         return n%2 ==0;

                // if(n%2==0)
                //     return true;
                // else
                //     return false;
        //     }          
        // };
        // int result = nums.stream()
        //     .filter(n -> n%2==0)
        //     .map(n -> n*2) 
        //     .reduce (0, (c,e)-> c+e);

        // Sorted with stream //

            Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n%2 == 0)
                .sorted();
            sortedValues.forEach(n -> System.out.println(n));


        // System.out.println(result);
    }
}
