// Map in java

import java.util.HashMap;
import java.util.Map;

public class Test34 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Partha ", 67);
        students.put("Protim ", 79);
        students.put("Sarmah ", 87);
        students.put("ABCD ", 90);


        System.out.println(students.keySet());
        for(String key : students.keySet()){
            System.out.println(key +" : " + students.get(key));
        }

    }
}
