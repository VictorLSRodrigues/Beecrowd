import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    int Maiorab = (A+B+Math.abs(A-B))/2;
	    int Maior = (Maiorab + C + Math.abs(Maiorab-C))/2;
		System.out.println(Maior + " eh o maior");
	}
}
