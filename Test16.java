//  Enum Class

enum Laptop{
    Macbook(2000), MSI(1000) , Microsoft, Thinkpad(1500);
    private int price;
    private Laptop() {
    }
    private Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }   
}
public class Test16 {
    public static void main(String[] args) {
        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice() );
        }
    }
}
