import java.util.Arrays;

//Merge sort
//This problem will have O(n) complexity at best, and this answer achieves that. Anything else will be microoptimization.

//Merge two sorted arrays together, final result must be sorted as well
public class merge_sorted_arrays {

	//Creating a merge method that takes in two array as arguments
	public static int[] merge(int[] a, int[] b) {

		//Creating answer array with a + b number of elements
	    int[] answer = new int[a.length + b.length];
	    //Initialize i,j and k to be 0
	    int i = 0, j = 0, k = 0;
	    //Loop as long as a and b number of elements doesn't reaches 0
	    while (i < a.length && j < b.length)
	    {
	    	//if first element of a is smaller than first element of b
	        if (a[i] < b[j])
	        {
	        	//store element into answer array
	            answer[k] = a[i];
	            //move to next element of array a
	            i++;
	        }
	        else
	        {	//if first element of a is bigger than first element of b,
	        	//store element of b into answer array
	            answer[k] = b[j];
	            //move to next element of array b
	            j++;
	        }
	        //move to next element of answer array
	        k++;
	    }

//*--------To get last element of array, as there will be one last element left not being compared----------*
	    //Loop as long as array a element doesn't reaches 0
	    while (i < a.length)
	    {	
	    	//store element into answer array
	        answer[k] = a[i];
	        //move onto next element in array a
	        i++;
	        //move onto next element in array answer
	        k++;
	    }

	    //Loop as long as array b element doesn't reaches 0
	    while (j < b.length)
	    {	
	    	//store element into answer array 
	        answer[k] = b[j];
	        //move onto next element in array b
	        j++;
	        //move onto next element in array answer
	        k++;
	    }
	    //return answer aray
	    return answer;
	}	
	
	
	public static void main(String[] args) {
		
		//Declaring array1 and array2
		int[] array1 = {0,3,4,31};
		int[] array2 = {4,6,30};
		
		//Expected result = [0,3,4,4,6,30,31]
		System.out.print(Arrays.toString(merge(array1,array2)));
		
	}

}
