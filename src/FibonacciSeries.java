
public class FibonacciSeries {
	
	static void findSeries(int num, int first, int secend)
	{
		System.out.print(first + " " + secend + " ");
		int counter =0, sum;
		
		while (counter < num -2)
		{
			sum=first + secend;
			System.out.print(sum + " ");
			first=secend;
			secend=sum;
			counter++;
		}
	}

	public static void main(String[] args) {
		int n=5, first=2, second=4;
		
		findSeries(n,first,second);

	}

}
