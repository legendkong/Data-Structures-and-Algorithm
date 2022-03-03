import java.util.Arrays;

public class sorting_bubblesort {

	
	static int[] bubbleSort(int[] numbers) {
		
		int length = numbers.length;
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length - 1; j++) {
				if(numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		return numbers;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] array = {4,3,2,1};
		//System.out.println(bubbleSort(Arrays.toString(array)));   <--- unable to do this
		
		//Use this to print vertically
		Arrays.stream(bubbleSort(array)).forEach(System.out::println);
		
		
	}

}
