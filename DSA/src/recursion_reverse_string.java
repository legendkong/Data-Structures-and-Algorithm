
public class recursion_reverse_string {

	
	static String recursiveReverseString(String n) {
		
		//base case
		if(n.length() == 0) {
			return "";
		}
		//recursive case
		else {
			return recursiveReverseString(n.substring(1)) + n.charAt(0);
		}
	}

	public static void main(String[] args) {
		System.out.println(recursiveReverseString("I love Java!"));
	}
}

/* How this works:
 The function takes the first character of a String - str.charAt(0) - 
 puts it at the end and then calls itself - reverse() - on the remainder - str.substring(1), 
 adding these two things together to get its result - reverse(str.substring(1)) + str.charAt(0)
 When the passed in String is one character or less and so there will be no remainder left -
 when str.length() == 0) - it stops calling itself recursively and just returns the String passed in.

reverse("Hello")
(reverse("ello")) + "H"
((reverse("llo")) + "e") + "H"
(((reverse("lo")) + "l") + "e") + "H"
((((reverse("o")) + "l") + "l") + "e") + "H"
(((("o") + "l") + "l") + "e") + "H"
"olleH"
*/