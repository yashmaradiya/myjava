package branching_statements;

public class Switchdemo {

	public static void main(String[] args) {
		
		int statusCode = 4;
		
		switch(statusCode)
		{
		case 1:
			System.out.println("Status Code = " + statusCode);
			break;
		case 2:
		System.out.println("Status Code = " + statusCode);
		break;
		case 3:
		System.out.println("Status Code = " + statusCode);
		break;
		case 4:
		System.out.println("Status Code = " + statusCode);
		break;
		case 5:
		System.out.println("Status Code = " + statusCode);
		default:
			System.out.println("Invalid Status Code");
		}
		char ch='a';
		
		switch(ch)
		{
		case 'a','A':
			System.out.println("it is vowel");
			break;
		case 'e','E':
		System.out.println("it is vowel");
		break;
		case 'i','I':
		System.out.println("it is vowel");
		break;
		case 'o','O':
		System.out.println("it is vowel");
		break;
		case 'u','U':
		System.out.println("it is vowel");
		default:
			System.out.println("Invalid Status Code");
	}

}
}