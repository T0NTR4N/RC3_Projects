public class Main
{
     public static void main(String[] args) {
      Employee first = new Employee("Susan Meyers", 47899, "Marketing", "Sales Rep");
      Employee second = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee third = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
      System.out.println(first.getName() + " " + first.getIdNumber() + " " + first.getDepartment() + " " + first.getPosition());
      System.out.println(second.getName() + " " + second.getIdNumber() + " " + second.getDepartment() + " " + second.getPosition());
      System.out.println(third.getName() + " " + third.getIdNumber() + " " + third.getDepartment() + " " + third.getPosition());
    }
}
