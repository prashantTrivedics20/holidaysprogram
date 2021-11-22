import java.util.Scanner;
public class Totalfees {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("enter original fees value greater then R50 000.");
        int original=readme.nextInt();
        System.out.println("enter amount to deposit before calculating final total fees.");
        int deposit=readme.nextInt();
        int discount=0;
        if(deposit>=(original/2))
        {
            discount=discount+(original*5)/100;
        }
        int schoollevy=(original*10)/100;
        int sportfee=(original*5)/100;
        int totalfees=schoollevy+sportfee+original-discount;
        System.out.println("total fees paid to the school=:-" + totalfees);
    }
}
