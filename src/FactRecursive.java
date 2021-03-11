public class FactRecursive {
	
	//5! = 5*4*3*2*1
	public static int factorial(int number) {

		if(number==1)
			return 1;

		else		
			return number*factorial(number-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("팩토리얼은 = "+factorial(3));
	}

}
