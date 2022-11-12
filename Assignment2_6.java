//WAP to check whether an array is a subset of another array.
import java.util.Scanner;

public class Assignment2_6 {
    public static void main(String[] args) {
        
        //Asking user for array input
        System.out.println("Enter the size of first array:");
        Scanner scan1 = new Scanner(System.in);
        int[] ar1 = new int[scan1.nextInt()];

        for (int i = 0; i < ar1.length; i++) {
            System.out.println("Enter the elements of first array:");
            Scanner scan = new Scanner(System.in);
            ar1[i]=scan.nextInt();
        }

        System.out.println("Enter the size of subset array to be checked:");
        Scanner scan2 = new Scanner(System.in); 
        int[] ar2 = new int[scan2.nextInt()];

        for (int i = 0; i < ar2.length; i++) {
            System.out.println("Enter the elements of subset array to be checked:");
            Scanner scan = new Scanner(System.in);
            ar2[i]=scan.nextInt();
        }
        
        
        //checking of arrays

        if(ar1.length<ar2.length)
        System.out.println("The size of subset array should be less than or equal to first array");
        else{

            boolean flag=true;
            for (int i = 0; i <= ar1.length-ar2.length; i++) {
        
                if(flag){

                    int k=i;

                    for (int j = 0; j < ar2.length; j++) {
                        flag=false;
                        if (ar2[j]!=ar1[k]) {
                            flag=true;
                            break;
                        }
                        k++;
                    }
                }
                else
                break;
            }
            if(flag)
            System.out.println("The Array is Not a subset of first array");
            else
            System.out.println("The Array is a subset of first array");
        }
    }
}
