package branching_statements;

public class modernswitch {

	public static void main(String[] args) {
		
		String dayName;
		
		int day = 2;
		int x = 4;
		
		dayName=switch(day)
		{
		case 1 -> "Sunday"; // Lambda Expression (->)
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> "Invalid Day"; 
		};
		
		System.out.println("The Day Selected: " +dayName);
		dayName=switch(day)
				{
				 // Lambda Expression (->)
				case 1,2,3,4,5 -> "WeekDay";
				case 6,7 -> "Weekends";
				default -> "Invalid Day"; 
				};
				System.out.println("The Day Selected: " +dayName);

	System.out.println("The Day Selected: " +dayName);
	
	int Result=switch(x)
			{
			 // Lambda Expression (->)
			case 1 -> 1;
			case 2 ->
			{
				int sum;
				sum=x+x;
				yield sum;
			}
			default -> 0;
			};
			System.out.println("The Day Selected: " +dayName);

	}

}
