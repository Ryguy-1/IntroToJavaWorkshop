package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {

String question1=JOptionPane.showInputDialog("Do you knoqw how to write code?");

if (question1.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null,"You will rule the world!");
}else{
JOptionPane.showMessageDialog(null,"Good luck washing dishes.");	
}
}


	}

