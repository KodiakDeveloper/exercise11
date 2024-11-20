package selectionStructures;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {

		int a, b, c, d, sum;

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a: "));

		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Input b: "));

		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Input c: "));

		d = Integer.parseInt(JOptionPane.showInputDialog(null, "Input d: "));

		sum = a + b + c + d;

		JOptionPane.showMessageDialog(null, "Total = " + sum);

	}

}
