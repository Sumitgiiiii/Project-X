import java.util.Scanner;

public class Solution {

	
		    public static void main(String[] args) {
		        int B,H;
		        Scanner Scan=new Scanner(System.in);
		       // System.out.println("Enter the Height ");
		        H=Scan.nextInt();
		       // System.out.println("Enter the Breadth ");
		        B=Scan.nextInt();
		        int i=B*H;
		      
		        if(i>0  && B>0 &&H>0 ) {
		        System.out.println(i); 
		        }
		        else {
		      	 System.out.println("java.lang.Exception: Breadth and height must be positive"); 
		       }

			
			}
		}

	