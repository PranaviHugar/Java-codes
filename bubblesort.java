import java.util.Scanner;

public class bubblesort 
{
   public static void main(String[] args) 
   {
      Scanner s = new Scanner(System.in);

      System.out.print("Enter the no of elements:");
      int n = s.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements:");
      for (int i = 0; i < n; i++) 
      {
          arr[i] = s.nextInt();
      }
      System.out.println("\n\nBefore sorting:");
      for (int i = 0; i < n; i++) 
      {
         System.out.print(arr[i] + " ");
      }


      bubbleSort(arr);

      System.out.println("\n\nAfter sorting:");
      for (int i = 0; i < n; i++) 
      {
         System.out.print(arr[i] + " ");
      }

      
   }

   public static void bubbleSort(int[] arr) 
   {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) 
      {
         for (int j = 0; j < n - i - 1; j++) 
         {
            if (arr[j] > arr[j + 1]) 
            {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }
   }
}