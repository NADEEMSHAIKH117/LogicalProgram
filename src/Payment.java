import java.util.Scanner;

public class Payment {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	    System.out.print("Enter principal Amount : ");
	    double principal = scan.nextDouble();
	    System.out.print("Enter Rate of Interest : ");
	    double rate = scan.nextDouble();
	    rate = (rate/100)/12;
	    System.out.print("Enter Time period in Year: ");
	    int time = scan.nextInt();
	    time = time *12;
	    double p = (principal*rate)/(1-Math.pow(1 + rate, -time));
    
    System.out.println("payement: " + p);
    scan.close();
	}

}
