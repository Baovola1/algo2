
public class reverseString {

	public static void main(String[] args) {
		// Écrivez une méthode qui inverse une chaîne.
		
		String str = "WayToLearnX";
		System.out.println(str);
		
		String reverseStr = reverse(str);
		System.out.println(reverseStr);
	}
	
	public static String reverse (String str) {
		StringBuilder reversed = new StringBuilder(str);
		return reversed.reverse().toString();
	}

}
