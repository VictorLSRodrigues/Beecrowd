import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 DecimalFormat Df = new DecimalFormat();
	  Df.applyPattern("0.000");
	  double A = sc.nextDouble();
	  double B = sc.nextDouble();
	  double M = (B*A) / 12;
	  
	  System.out.println(Df.format(M));
	 
	 
	}
}
