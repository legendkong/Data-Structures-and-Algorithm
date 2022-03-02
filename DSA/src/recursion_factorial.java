//Write two functions that finds the factorial of any number
//One should use recursive, the other should just use a for loop

public class recursion_factorial {

	//Recursive method
	static int findFactorialRecursively(int number) {
		if(number == 1) {
			return 1;
		}
		return number * findFactorialRecursively(number - 1);
	}
	
	//Iterative method
	static int findFactorialIteratively(int number) {
		int result = 1;
		for(int i = number; i > 0; i--) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(findFactorialRecursively(5));
		System.out.println(findFactorialIteratively(5));
	}

}
