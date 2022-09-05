
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class O1 {



		public static void main(String[] args) {
		String inntektTxt = showInputDialog("Hvor mye tjente du?");
		double lønn = parseDouble(inntektTxt);

		if (lønn <= 190349) {
			showMessageDialog(null, "Du skylder: kr 0 i skatt");
		} else if (lønn <= 267899) {
			double skattregnet = lønn * 0.017;
			showMessageDialog(null, "Du skylder: kr " + skattregnet + " i skatt");
		} else if (lønn <= 643799) {
			double skattregnet = lønn * 0.04;
			showMessageDialog(null, "Du skylder: kr " + skattregnet + " i skatt");
		} else if (lønn <= 969199) {
			double skattregnet = lønn * 0.134;
			showMessageDialog(null, "Du skylder: kr " + skattregnet + " i skatt");
		} else if (lønn <= 1999999) {
			double skattregnet = lønn * 0.164;
			showMessageDialog(null, "Du skylder: kr " + skattregnet + " i skatt");
		} else {
			double skattregnet = lønn * 0.174;
			showMessageDialog(null, "Du skylder: kr " + skattregnet + " i skatt");
		}
	}
}