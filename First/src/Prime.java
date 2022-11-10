import java.math.BigInteger;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.lang.*;

public class Prime {


	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
          double d=scan.nextDouble();
          Currency cur = Currency.getInstance("USD");  
          String sl = cur.getSymbol(); 
          System.out.println("US: " +sl+d );
      
          {
        	  Currency cur1 = Currency.getInstance("INR");  
              String sl1 = cur1.getSymbol(); 
              System.out.println("INDIA: " +sl1+d );
          }
          {
          Currency cur2 = Currency.getInstance("CNY");  
          String sl2 = cur2.getSymbol(); 
          System.out.println("CHINA: " +sl2+d );
        }
          {
        	  Currency cur3 = Currency.getInstance("EUR");  
              String sl3 = cur3.getSymbol(); 
              System.out.println("FRANCE: " +sl3+d );
          }
   
	}
}

