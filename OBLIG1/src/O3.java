import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

public static void main(String[] args) {
		//Innskriving data
		String heltallTxt = showInputDialog("Oppgi et heltall");
		int heltall = parseInt(heltallTxt);
		//utregning
			if ( heltall > 0) {
				int i = 1;
				int sum = i;
				do {
					sum *= i;
					i++;
		//print ut data og feilmelding
				} while (i <= heltall);
				System.out.println(sum);
			} else {
				System.out.println("Prøv en ny verdi >0");
		}

	}

}


