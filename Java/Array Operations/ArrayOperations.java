/**
   The ArrayOperations class performs operations on an array
   for the Array Operations programming challenge.
*/

public class ArrayOperations
{
   /**
      getTotal method.
      @param array An array of integers.
      @return The total of the values stored in the
              argument array.
   */
   public static int getTotal(int[] array){
     int total = 0;
     for (int i = 0; i < array.length; i++){
       total += array[i]; 
     }
     return total;
   }
   /**
      getTotal method.
      @param array An array of floats.
      @return The total of the values stored in the
              argument array.
   */
   public static float getAverage(float[] array){
     float total = 0;
     for (int i = 0; i < array.length; i++){
       total += array[i]; 
     }
     return total / array.length;
   }
   public static double getHighest(double[] array){
     double highest = 0;
     for (int i = 0; i < array.length; i++){
       if (array[i] > highest){
         highest = array[i];
       }
     }
     return highest;
   }

   /**
       getLowest method
       @param array An array of doubles.
       @return The lowest value in the argument array.
    */
   public static double getLowest(double[] array){
     double lowest = array[0];
     for (int i = 1; i < array.length; i++){
       if (lowest > array[i]){
         lowest = array[i];
       }
     }
     return lowest;
   }
   
}