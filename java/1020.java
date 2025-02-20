import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	   int x = sc.nextInt();
	   
	   int[] arrayTempo = {365,30,12};
		
	    int Nt = x / arrayTempo[0];
	    int Nt1 = (x - (Nt*arrayTempo[0]))/30;
	    int Nt2 = x-(Nt*arrayTempo[0]+Nt1*30);
	    
	    System.out.println(Nt +" ano(s)");
	    System.out.println(Nt1+" mes(es)");
	    System.out.println(Nt2+" dia(s)");
	   
	}
}
