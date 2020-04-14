package SeleniumPrerequisiteAssignment;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.Spring;

//convert digits to string
public class Q9 {

	public static final String[] units = {"","One","Two","Three","Four",
	"Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen",
	"Fourteen","Fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};
	}
    public static String convert(final int n)
    {
    	If(n<0){
    	return "Minus " + convert(-n);
    }
    if(n<20) {
    	return units[n];
    }
    if(n<100) {
    		
			String[] tens;
			return tens[n / 10] + ((n % 10 !=0) ? " ":" ") + units[n % 10];
    }	
    String[] convert;
	if(n<1000)	{
    	return units[n / 100] +"Hundreds" + ((n % 100 !=0) ? " ":" ") + convert[n % 100];
    }
    if(n<100000) {
    return convert(n / 1000) +"Thousand" + ((n % 1000 !=0) ? " ":" ") + convert[n % 1000];
    }	
    if(n<10000000) {
        return convert(n / 100000) +"Lakh" + ((n % 100000 !=0) ? " ":" ") + convert[n % 100000];
        }
        return convert(n / 10000000) +"Crore" + ((n % 10000000 !=0) ? " ":" ") + convert[n % 10000000];
        }	
    
    
    
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter value for convert numbers to word");
	 int n = sc.nextInt();
	 System.out.println(NumberFormat.getInstance().format(n) + " = " + convert(n) + "");
			 
 }
 }


