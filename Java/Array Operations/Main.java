/**
   This program demonstrates a solution to the
   Array Operations programming challenge.
*/

public class Main
{
   public static void main(String[] args)
   {
      // Some arrays of various types.
      int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      float[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      double[] array3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     
      System.out.println("the total of this array is: " + ArrayOperations.getTotal(array1));
      System.out.println("the average of this array is: " + ArrayOperations.getAverage(array2));
      System.out.println("the highest number of this array is: " + ArrayOperations.getHighest(array3));
      System.out.println("the lowest number of this array is: " + ArrayOperations.getLowest(array3));
   }
}