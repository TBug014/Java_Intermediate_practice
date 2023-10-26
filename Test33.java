// Set collection in java

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;


public class Test33 {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(63);
        nums.add(54);
        nums.add(24);
        nums.add(31);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) 
            System.out.println(values.next());

        
        // for(int n : nums){
        //     System.out.println(n);
        // }
    }
}