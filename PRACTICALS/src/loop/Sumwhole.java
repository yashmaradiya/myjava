package loop;

public class Sumwhole {

	public static void main(String[] args) {
		int n,r,sum=0;
		
		n=154;
		
		// 5+4+3+2+1 = 15  sum of digits
		
		while(n>0)
		{
			r=n%10;
			sum=sum+r;		
			n=n/10;
		}
			System.out.println("Sum of digits :" +sum);
			
	}

}
