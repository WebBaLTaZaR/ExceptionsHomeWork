package exceptionsHomeWork;

import java.util.Scanner;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
public class Task4 {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Введите что-нибудь: ");
			String userIn = in.nextLine();

			if (userIn.isEmpty()) {
				throw new RuntimeException("пустые строки вводить нельзя");
			} else {
				System.out.println(userIn);
			}
		}
	}

}
