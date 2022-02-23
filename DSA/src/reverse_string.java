//Reversing a string
public class reverse_string {

	  public static void main(String[] args) {
		    
		  //Declaring and defining variable
		  String name = "Jonathan Kong";
		  
		  //Store each element of name into stringCharArray array
		  char [] stringCharArray = name.toCharArray();
		  
		  //Declaring and initializing reversedString variable
		  String reversedString = "";
	    
		  //Loop through stringCharArray from the last element to the 0th element
		  for(int i = stringCharArray.length-1; i>=0; i--) {
			  //Store the the elements being looped into reversedString 
			  reversedString = reversedString + stringCharArray[i];
		    }
		    
		  System.out.print("The reversed string of the '"+name+"' is: " );
		  System.out.println(reversedString);
		  }
}
