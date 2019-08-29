package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String prime = JOptionPane.showInputDialog("Type any number into this box");
		int nprime = Integer.parseInt(prime);
		for(int i = 2; i < nprime; i++)	{
			if(nprime % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not a prime");
			   System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Your number is a prime number");
		}
}
