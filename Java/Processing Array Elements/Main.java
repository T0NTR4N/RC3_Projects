import java.util.*;
class Main {
  public static void main(String[] args) {
    //7.9
    int numbers1[] = {1,3,6,9};
    int numbers2[] = {2,4,6,8};
    int array = 0;
    array = numbers1[0] * numbers2[2]; 
    System.out.println(array);
    //7.10
    int array1[] = new int[7];
    for (int i = 0 ; i < array1.length ; i++){
      array1[i] = -1;
    } 
    //7.11
    Scanner in = new Scanner(System.in);
    System.out.println("array size?");
    int values;
    values = in.nextInt();
    int[] array2 = new int [values];
    //7.12
    int[] arrayA = {1,2,3,4,5,6,7};
    int[] arrayB = new int [7];
    for (int i = 0 ; i < arrayA.length ; i++){
      arrayB[i] = arrayA[i];
    }
    for (int i = 0 ; i < arrayA.length ; i++){
      System.out.println(arrayB[i]);
    }
  }
}