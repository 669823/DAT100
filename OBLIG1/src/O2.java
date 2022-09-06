
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
public class O2 {

	public static void main(String[] args) {
		//for loop for å begrense + innskriving
		for (int i = 1; i <= 10; i++) {
			String poengsumTxt = showInputDialog("Hvor mange poeng fikk du?");
			int poeng= parseInt(poengsumTxt);
			
			//utregning og grense for antall poeng
			if (poeng> 100 || poeng< 0) {
				i--;
				System.out.println("Skriv inn en gyldig verdi");
			} else {

				if (poeng<= 39) {
					System.out.println("Du skrev inn " + poeng+ ", som tilsvarer karakteren F");
				} else if (poeng<= 49) {
					System.out.println("Du skrev inn " + poeng+ ", som tilsvarer karakteren E");
				} else if (poeng<= 59) {
					System.out.println("Du skrev inn " + poeng+ ", som tilsvarer karakteren D");
				} else if (poeng<= 79) {
					System.out.println("Du skrev inn " + poeng+ ", som tilsvarer karakteren C");
				} else if (poeng<= 89) {
					System.out.println("Du skrev inn " + poeng+ ", som tilsvarer karakteren B");
				} else {
					System.out.println("Du skrev inn " + poeng+ ", som tilsvarer karakteren A");
				}
			}
		}
	}
}