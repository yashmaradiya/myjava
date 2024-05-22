package branching_statements;

public class nestedif {

	public static void main(String[] args) {
		
		int a,b,c;
		//a=30;
		//b=10;
		//c=20;
		a=20;
		b=30;
		c=10;
		
		if(a>b && a>c)
		{
			System.out.println("Big= " +a);
			System.out.println("it's first");
		}
		if(b>a && c>b)
		{
			System.out.println("Big= " +b);
			System.out.println("it's second");
		}
		else
			System.out.println("all are equal");
			System.out.println("it's else");
	}

}
