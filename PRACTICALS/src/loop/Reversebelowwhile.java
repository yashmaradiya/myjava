package loop;

public class Reversebelowwhile {

		public static void main(String[] args) {
			int n,r,rev=0;
			
			n=154;
			
			// 5+4+3+2+1 = 15  sum of digits
			
			while(n>0)
			{
				r=n%10;
				rev=rev*10+r;		
				n=n/10;
			}
				System.out.println("Sum of digits :" +rev);
				
		}



	}


