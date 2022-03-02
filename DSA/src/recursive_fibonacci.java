//Given a number N, return the index value of the Fibonacci sequence
//where the sequence is: 
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
//the pattern of the sequence is that each value 
//is the sum of the 2 previous values
//that means that for (index)N=5 -> 2+3

public class recursive_fibonacci {

	//Recursion method O(2^n)
	static int recursionFunction(int n) {
		
		if(n > 2) {
			return n;
		}else {
			return recursionFunction(n - 1) + recursionFunction(n - 2);
		}	
	}
	
	//Iterative method O(n)
	static int iterativeFunction(int n) {
		 
		if(n == 0) {
			return 0;
		}
		int result = 1;
		int lastNumber = 0;
		int temp;
		for (int i = 1; i < n; i++) {
			temp = result;
			result += lastNumber;
			lastNumber = temp;
		}
		return result;
	}
	

	public static void main(String[] args) {

		System.out.println(recursionFunction(5));
		System.out.println(iterativeFunction(5));
	}

}
