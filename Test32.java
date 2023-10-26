// Arraylist

import java.util.ArrayList;
import java.util.Collection;

public class Test32 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);

        System.out.println(((ArrayList<Integer>) nums).get(3));

        for(int n : nums){
            System.out.println(n*2);
        }
        
    }
}
