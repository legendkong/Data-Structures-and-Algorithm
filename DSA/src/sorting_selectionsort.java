import java.util.Arrays;

public class sorting_selectionsort {

	static int[] selectionSort(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			int minValue = array[i];
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				//Searching min value and it's index
				if(minValue > array[j]) { 
					minValue = array[j];
					minIndex = j;
				}
			}
			//Swapping the min value found
			int temp = array[i];
			array[i] = minValue;
			array[minIndex] = temp;
		}
		return array;
	}
	

	public static void main(String[] args) {
		
		int[] array = {5,4,3,2,1};
		
		Arrays.stream(selectionSort(array)).forEach(System.out::println);
		
		
		
		
	}

}
