import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	   DecimalFormat Df = new DecimalFormat();
	  Df.applyPattern("0");
	 
	 int X = sc.nextInt();
	 int A = X / 3600;
	 int B = (X - (A*3600))/60;
	 int C = (X - (A*3600+B*60));
     
     System.out.println(A+":"+B+":"+C);
     }
	 
	}
