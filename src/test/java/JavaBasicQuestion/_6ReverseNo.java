package JavaBasicQuestion;

public class _6ReverseNo {

	public static void main(String[] args) {
		int number = 123456, reverse = 0;
		// we have not mentioned the initialization part of the for loop
		for (; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + reverse);

		// 2
		int num = 1234567, reversed = 0;

		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}

		System.out.println("Reversed Number: " + reversed);
	}
}