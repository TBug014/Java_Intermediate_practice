// Method Overiding

class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvClac extends Calc{
    public int add(int n1, int n2){

        return n1+n2+10;
    }
}


public class test {
    public static void main(String[] args) {
        AdvClac obj = new AdvClac();
        int r1 = obj.add(5,7);


        System.out.println(r1);
    }
     
}