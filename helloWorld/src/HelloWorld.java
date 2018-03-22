public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = Integer.parseInt(args[0]);		
		System.out.println(power(point,3));		
	};
	
	public static double power(int x, int n)
	{
		int result = 1;
		for(int i = 0 ; i < n ; i++)
		{
			result *= x;
		}
		return result;
	}

}