package branching_statements;

public class elseif {

	public static void main(String[] args) {
		
		int a,b,c,big;
		//a=30;
		//b=10;
		//c=20;
		a=5;
		b=3;
		c=9;
		
		if(a>b && a>c)
		{
			big=a;
			System.out.println("Big= " +big);
			System.out.println("it's first");
		}
		else
		{
			if(b>a && b>c)
			{
				big=b;
				System.out.println("big= " +big);
			}
			else
			{
				if(c>a && c>b);
				{
					big=c;
					System.out.println("big=" +big); 
				}
			}
		}
		System.out.println("all are equal");
	}

}
