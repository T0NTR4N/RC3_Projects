import java.util.*;
class Main {
  public static void main(String[] args) {
    String item;
    int units;
    double price;
    int sold;
    Scanner in = new Scanner(System.in);
    System.out.println("what item is being sold?");
    item = in.next();
    System.out.println("how many " + item + " are for sale?");
    units = in.nextInt();
    System.out.println("what is the price of the " + item + "s being sold?");
    price = in.nextDouble();
    System.out.println("how many " + item + "s are sold?");
    sold = in.nextInt();
    RetailItem purchase1 = new RetailItem( item , units , price );
    CashRegister cash1 = new CashRegister(purchase1, sold);
    System.out.println("Your subtotal is: " + cash1.getSubtotal());
    System.out.println("Your total tax is: " + cash1.getTax());
    System.out.println("Your final total is: " + cash1.getTotal());
  }
}