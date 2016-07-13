package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {

		for (int i =0; ;i++) {

			String name = JOptionPane.showInputDialog("What is your name?");
			String address = JOptionPane.showInputDialog("What is your address?");
			String ssn = JOptionPane.showInputDialog("What is your social security number?");
			String age = JOptionPane.showInputDialog("How old are you?");
			JOptionPane.showMessageDialog(null, name + " " + address + " " + ssn + " " + age);
			String answer = JOptionPane.showInputDialog("Is this information correct?");
			if (answer.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Sanchoo for the info!!!");
				break;

			} else if (answer.equals("No")) {
			}
		}
	}
}
