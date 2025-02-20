import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    //E
	   double R = sc.nextDouble();
	   double Pi = 3.14159;
	   //P
	   double M = (4.0/3)*Pi*Math.pow(R , 3); 
	    System.out.println(String.format("VOLUME = %.3f" , M));
	}
}
