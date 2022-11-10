import java.util.Scanner;

public class Str1 {



	public static void main(String[] args) {
		       Scanner  Scan = new Scanner(System.in);
		        int n = Scan.nextInt();
		        System.out.println(n);
		        String a=Scan.nextLine();
		       for(int i =0 ;i<n;i++){
		              a=Scan.nextLine();
		              if(a != "" && a.split(" ").length > 1) {
			          System.out.println(a.split(" ")[1]);
		              }
		          }
		    
		}

	
}

