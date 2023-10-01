
public class valuemaxtab {

	public static void main(String[] args) {
		// Écrivez une méthode qui renvoie le plus grand entier dans un tableau.
		
		int[] tab = {1, 2, 9, 4};
		
		int maxNum = tab[0];
		
		for(int max : tab) {
			if(max > maxNum)
				maxNum = max;
		}
		
		System.out.println("Le nombre maximum est de " + maxNum);
	}

}
