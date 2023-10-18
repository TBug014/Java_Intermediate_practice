class laptop{
    String brand;
    int price;

    public String toString(){
        return brand + " : " + price ;
    }

    public boolean equals(laptop that){
        return this.brand.equals(that.brand) && this.price == that.price;
        }
    }



public class Test04 {
    public static void main(String[] args) {
        laptop obj = new laptop();
        obj.brand = "MacBook";
        obj.price = 80000;


        laptop obj1 = new laptop();
        obj1.brand = "MacBook";
        obj1.price = 80000;

        boolean result = obj.equals(obj1);
        System.out.println(result); 
    }
   
}
