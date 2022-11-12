//WAP to sort an array using Selection Sort Algorithm

import java.util.Scanner;
public class Assignment2_5 {
    public static void main(String[] args) {
        
        //Asking for user input for array

        System.out.println("Enter the size of The array:");
        Scanner scan1 = new Scanner(System.in);
        int[] ar = new int[scan1.nextInt()];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter the elements of The array:");
            Scanner scan = new Scanner(System.in);
            ar[i]=scan.nextInt();
        }

        //Selection Sort Algorithm
        for (int i = 0; i < ar.length-1; i++) {
            int min=i;
            
            for (int j = i+1; j < ar.length; j++) {
                if (ar[j]<ar[min]) {
                    min=j;
                }
            }
            //swaping 
            int temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;
        }
        //Printing the sorted array
        System.out.println("The sorted array is:");
        for (int i : ar) {
            System.out.print(i+",");
        }

    }
}
