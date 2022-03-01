import java.util.*;
class Main {
  final static int NUM_EMPLOYEES = 7;
  public static void main(String[] args) {
    int hours;
    double payrate;
    Scanner in = new Scanner(System.in);
    payroll pr = new payroll();

    for (int i = 0 ; i < NUM_EMPLOYEES; i++){
      System.out.println("Enter the number of hours worked for employee" + pr.getEmployeeIdAt(i) + ":");
      hours = in.nextInt();
      while (hours < 0){
        System.out.println("please enter a number above 0");
        hours = in.nextInt();
      } 
      System.out.println("Enter the number of payrate of the employee" + pr.getEmployeeIdAt(i) + ":");
      payrate = in.nextDouble();
      while (payrate > 6){
        System.out.println("please enter a number above 6");
        payrate = in.nextDouble();
      }
      pr.setHoursAt(i, hours);
      pr.setPayRateAt(i, payrate);
    }
    System.out.println("\nPAYROLL DATA");
    System.out.println("===============");
    for(int i = 0; i < NUM_EMPLOYEES; i++){
    System.out.println("Employee #:" + pr.getEmployeeIdAt(i));
    System.out.println("Gross pay:" + pr.getGrossPay(i));
  }
  } 
}