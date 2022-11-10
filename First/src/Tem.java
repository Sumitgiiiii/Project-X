import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class Tem {

    public static void main(String[] args ) {
    
    Scanner scan =new Scanner(System.in);
    int S=scan.nextInt();
     int arr[]=new int[S];
      int count=0;
     for(int i=0;i<S; i++) {
     arr[0]=count+arr[i];
     i++;
     
     System.out.println(arr[i]);
     }
    }
}