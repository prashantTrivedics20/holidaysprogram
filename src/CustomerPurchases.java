import java.util.Scanner;
public class CustomerPurchases {
    private int n;
    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    String first;
    String surname;
    String product;
    int price;
    int quantity;
}
class printing extends CustomerPurchases {
    public void printDetails(String first, String surname, String product, int price, int quantity) {
        System.out.println(first + "\n" + surname + "\n" + product + "\n" + price + "\n" + quantity);
    }
    int tax, discount;
    double commision;
    double total;
    public void CustomerPurchaseReport(String first, String surname, String product, int price, int quantity) {
        tax = price * 15 / 100;
        commision = price * 8.5 / 100;
        discount = price * 10 / 100;
        total = (price + tax) - (discount + commision);
        System.out.println("total price :=>" + total);
    }
}
class test1
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        printing obj=new printing();
       obj.setN(readme.nextInt());
        System.out.println("customer number:=>"+ obj.getN());
        obj.printDetails("prashant","trivedi","gold",20000,5);
        obj.CustomerPurchaseReport("prashant","trivedi","gold",20000,5);
    }
}

