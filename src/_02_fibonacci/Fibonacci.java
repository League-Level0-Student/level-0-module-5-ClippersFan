package _02_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int third;
		System.out.println(first);
		System.out.println(second);
		for(int i = 0; i < 12; i++) {
			third = second+first;
			System.out.println(third);
			first = second;
			second = third;
		}
	}
}
