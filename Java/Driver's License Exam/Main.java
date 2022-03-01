import java.util.Scanner;
/**
   This program demonstrates a solution to the
   Driver's License Exam programming challenge.
*/
public class Main
{
   public static void main(String[] args) 
   {
     final int NUM_ANSWERS = 20;
      // To hold keyboard input
      // Number of answers
      String input;
      // Array to hold answers
      char[] hold = new char[NUM_ANSWERS];
      // Array to hold missed questions
      int[] missed = new int[20];

      // Create a Scanner object for keyboard input.
      Scanner in = new Scanner(System.in);
      
      // Get the user's answers to the questions.
      for (int i = 0; i < 20 ; i++){
        System.out.println("enter your answer in UPPERCASE for" + (i + 1)); 
        input = in.nextLine();
        while (!(valid(input))){
          System.out.println("enter your answer in UPPERCASE(A,B,C,D) for" + (i + 1));
          input = in.nextLine();
        }
          hold[i] = input.charAt(0);
       }
        }
         // Validate the answer.
      public static boolean valid(String input){
        boolean valid = true;
        if (((!"A".equals(input)) && (!"B".equals(input))) && ((!"C".equals(input)) && (!"D".equals(input)))){
          valid = false;
        }
        return valid;
      }         
}