package testpack;

public class Calculate {

	
	public int add(int... number) {
		int result = 0;
		for(int i: number) {
			result +=i;
		}
		return result;	
	}
	
	public int multiply(int... number) {
		int result =1;
			for(int i: number)
			{
				result *=i;
			}		
		return result;
	}
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(10,5));
		System.out.println(c.add(1,2,3));
		System.out.println(c.add(2,2,2));
		System.out.println(c.multiply(4,5));

	}

	public Object sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
