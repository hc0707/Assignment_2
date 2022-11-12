//WAP to sort an array using Bubble Sort Algorithm
public class Assignment2_3 {
    public static void main(String[] args) {
        //also called as sinking sort/exchange sort
        int[] a ={5,3,7,1,6,10,4};
        int temp;    
        for (int i = 0; i < a.length; i++) {

            for (int j = 1; j < a.length-i; j++) {
               
                if (a[j]<a[j-1]) { //< for ascending and > for descending order
                  temp=a[j];
                  a[j]=a[j-1];
                  a[j-1]=temp;  
               } 
            }
        }
        for (int i : a) {
            System.out.print(i+" , ");
        }
    }
}
