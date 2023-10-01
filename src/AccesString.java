
public class AccesString {

	public static void main(String[] args) {
		// parcourir les caractères d’une chaîne
		String s = "Hello World";

		for (int i = 0; i < s.length(); ++i) {
		  char c = s.charAt(i);
		  System.out.println(c);
		}

	}

}
