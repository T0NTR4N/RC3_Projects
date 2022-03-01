
public class CashRegister{
  private int quantity;
  private double retail;
  private double tax = .06;



  public CashRegister(RetailItem item , int q){
    quantity = q;
    retail = item.getPrice();
  }

  public double getSubtotal(){

    return quantity * retail; 
  }

  public double getTax(){
    return getSubtotal() * tax;
  }

  public double getTotal(){
    return getSubtotal() + getTax();
  }
}
