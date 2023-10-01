import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateactuel {

	public static void main(String[] args) {
		// Écrivez un programme Java pour afficher l’heure et la date actuelle dans un format spécifique.
		LocalDateTime dateTime = LocalDateTime.now();
		
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy, HH:mm:ss");
		 
		 String actualydate = dateTime.format(formatter);
		 System.out.println(actualydate);
				
	}

}
