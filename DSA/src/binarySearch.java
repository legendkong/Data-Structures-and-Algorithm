
public class binarySearch {

	public static void main(String[] args) {
		
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right){
			int middle = (left+right)/2;
			if(nums[middle] == target){
				return middle;
			}
			if(target > nums[middle]{
				left = middle + 1;
			}
			else{
				right = middle - 1;
			}
		}
	return -1;
}
