import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      //time it takes to sort the array using the bubble sort algorithm
      long startTime = System.nanoTime();
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
    System.out.println("Elapsed time: " + elapsedTime + " nanoseconds");
      Lab4.outputList(bubbleSortedList);


      System.out.println("\n\nInsertion sort results -------------------------------------------");
      //time it takes to sort the array using the insertion sort algorithm
      long startTime1 = System.nanoTime();
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList); 
      long endTime1 = System.nanoTime();
      long elapsedTime1 = endTime1 - startTime1;
      System.out.println("Elapsed time: " + elapsedTime1 + " nanoseconds");
      Lab4.outputList(insertionSortedList);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
   
    
    int n = integerList.size();
    for (int i = 1; i < n; ++i) {
        int key = integerList.get(i);
        int j = i - 1;

        while (j >= 0 && integerList.get(j) > key) {
          integerList.set(j + 1, integerList.get(j));
            j = j - 1;
        }
        integerList.set(j + 1, key);
    }
    return integerList;
    
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    int n = integerList.size();
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (integerList.get(j) > integerList.get(j + 1)) {
                int temp = integerList.get(j);
                integerList.set(j, integerList.get(j + 1));
                integerList.set(j + 1, temp);
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}