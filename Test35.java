// Comparator vs comprable in java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public int compareTo(Student that) {

        if (this.age >that.age) 
                return 1;
            else
                return -1;
    }
}
public class Test35 {
    public static void main(String[] args) {
        
        Comparator<Student> com =  (i,  j)-> i.age >j.age ? 1:-1;

        List<Student> studs = new ArrayList<>(); 
        studs.add(new Student(26, "Partha"));
        studs.add(new Student(22, "Udit"));
        studs.add(new Student(21, "Uddhab"));
        studs.add(new Student(28, "Sarmah"));       
        Collections.sort(studs);
        for(Student s : studs)
            System.out.println(s);
    }
}
