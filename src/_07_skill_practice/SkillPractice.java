package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
			skills.skill1();
			skills.skill2();
			skills.skill3();
			skills.skill4();
			skills.skill5();
	}
	void skill1() {
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes2  = Integer.parseInt(dimes);
		System.out.println("You have"+dimes2*10+"cents");
		String wheaties = JOptionPane.showInputDialog("How tall are you?");
		int hello = Integer.parseInt(wheaties);
		if(hello < 36) {
			System.out.println("You need to eat your wheaties!");
		}
		
	}
	void skill2() {
		for(int i = 1; i < 31; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	void skill3() {
		int hello = new Random().nextInt(20);
		System.out.println(hello);
		int heola = new Random().nextInt(10);
		System.out.println(heola);
		System.out.println(hello - heola);
	}
	void skill4() {
		String city = JOptionPane.showInputDialog("What city do you live in???");
		if(city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You are living in America's finest city.");
		}else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego");
		}
		int cars = 2;
	}
	void skill5() {
		String school = JOptionPane.showInputDialog("What is the name of your school?");
		JOptionPane.showInputDialog(school + "is very school");
	}
	

}
