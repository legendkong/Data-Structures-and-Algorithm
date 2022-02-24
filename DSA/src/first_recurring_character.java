import java.util.HashSet;

//Find the first recurring character (Google interview)
//For example, given array = [2,5,1,2,3,5,1,2,4] 
//return 2

//Given another example, given array = [2,1,1,2,3,5,1,2,4]
//return 1

//Given another example, array = [2,3,4,5]
//return undefined

//---------------------NAIVE APPROACH :(------------------------//
//-------Not good. Why -> Nested for loop resulting in O(n square) :(------------//
/*
public class first_recurring_character {

	static int firstRecurringCharacter(int[] input) {
		
		for(int i = 0; i < input.length; i++) {
			for(int j = i + 1; j < input.length; j++) {
				if(input[i] == input[j]) {
					return input[i];
				}
			}
		}
		return 000000;	
	}
	public static void main(String[] args) {
		
		int[] array1 = {7,5,1,2,3,5,7,2,4};		
		System.out.println(firstRecurringCharacter(array1));
	}
}
*/

//----------------------IDEAL APPROACH---------------------------------//
//----UTILIZING HASHMAP :) Why? -> Optimises code, fast(time complexity O(1)----//
//Hash tables are usually the answer to improve time complexity
//Space - time tradeoffs(use more space, but get more time optimisation)

public class first_recurring_character {
	
	//Method to return first repeated character in hash set
	static int firstRecurringCharacter(int[] input) {
		
		//Create an empty hashset
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//Traverse the input array from left to right
		for(int i = 0; i <=input.length-1; i++) {
			
			int c = input[i];
			
			//If element is already in hashset, update program and break
			if(hs.contains(c)) {
				return c;
			}
			//If element not in hashset, add element into hashset
			else {
				hs.add(c);
			}
		}
		//After traverse finish and there are no repeating elements, return 0
		return 0;
	}
	
	//Main method
	public static void main(String[] args) {
		
		int[] array1 = {7,5,1,2,3,5,7,2,4};	
		System.out.println(firstRecurringCharacter(array1));
	}

}