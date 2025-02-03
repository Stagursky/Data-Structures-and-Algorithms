/*
 * IT-2660 - Lab 1
 * Student Name: Iuri Stagurschi
 */

public class Main {
 
  public static void main(String[] args) {

    Lab1 lab = new Lab1();
    System.err.println("The maximum value:");
    int a =4;
    int b=6;
    int number = lab.max(a,b);
    System.out.println(number);
    System.err.println("The minimum value:");
    int number1= lab.min(a,b);
    System.out.println(number1);
    int[] arrayOfNumbers= {5, 9, 3, 12, 7, 3, 11, 5};
    System.out.println("An array of numbers:");
    int j=0;
    while(j<arrayOfNumbers.length){
      System.out.print(arrayOfNumbers[j]+", ");
      j++;
    }

    System.err.println();
    System.out.println("The array in reverse:");
    for (int i =  arrayOfNumbers.length-1 ; i>=0; i--) {
      System.out.print(arrayOfNumbers[i]+", ");
        
    }
    System.err.println();
    System.out.println("The first and last values of the array:");
    System.err.println(arrayOfNumbers[0]+", "+ arrayOfNumbers[arrayOfNumbers.length-1]);
    System.out.println("The sum of all values in the array:");
    System.out.println(lab.sum(arrayOfNumbers));
    System.out.println("the average:");
    System.out.println(lab.average(arrayOfNumbers));
    System.out.println("The maximum value:");
    System.out.println(lab.max(arrayOfNumbers));
    System.out.println("The minimum value:");
    System.out.println(lab.min(arrayOfNumbers));
  }
}     

// Add all of the methods here
class Lab1 {

  public int max(int a, int b){
    if(a>b){
      return a;
    }
      else {
        return b;
      }
  }
  public int min(int a, int b){
    if(a<b){
      return a;
    }
      else {
        return b;
      }
  }
    public int sum(int[] nums){
      int sum=0;
      for (int i = 0; i < nums.length; i++) {
          sum+=nums[i];
      }
      return sum;
    }
    public int average(int[] nums){
      int sum=0;
      for (int j:nums) {
          sum+=j;
      }
      return sum/nums.length;
    }
    public int max(int[] nums){
      int a=nums[0];
      for (int i=0; i<nums.length;i++){
        
      if(nums[i]>a){
        a=nums[a];
      }
        
    }
    return a;
  }
  public int min(int[] nums){
    int a=nums[0];
    for (int i=0; i<nums.length;i++){
      
    if(nums[i]<a){
      a=nums[a];
    }
      
  }
  return a;
}
}