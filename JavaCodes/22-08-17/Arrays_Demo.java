//Tasks: Given an array, , of  integers, print array's elements in reverse order as a single line of space-separated numbers.



import java.io.*;
import java.util.*;


public class Arrays_Demo {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
		 System.out.print("Enter the size of the aaray you want to reverse and print");
        
        int array[] = new int[size];
        
        for(int k=0;k<size;k++){
		 System.out.print("Input array element : "+(k+1));
            array[k]= scan.nextInt();
        }
        for(int k=0;k<size;k++){
           
         
           if(k<(size-1)){
          System.out.print(array[(size-k-1)]+" ");
           }
            if(k==(size-1)){
          System.out.print(array[(size-k-1)]);
           }
       
        scan.close();
    }
    }
}
