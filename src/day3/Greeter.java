package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String hi="Hello";
hi=JOptionPane.showInputDialog("What's your name");
JOptionPane.showMessageDialog(null, "Hello "+hi);

}
}
