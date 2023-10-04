package exceptionsHomeWork;
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		float userNumber = promptInt("Введите дробное число: ");
		System.out.println("Вы ввели: " + userNumber);
	}

	public static float promptInt(String message) {

		Scanner in = new Scanner(System.in);
		float result = 0;
		boolean valid = false;

		while (!valid) {
			try {
				System.out.print(message);
				result = Float.parseFloat(in.nextLine());
				valid = true;
			} catch (NumberFormatException e) {
				System.out.println("Пожалуйста, введите корректное целое или дробное число.");
			}
		}

		return result;
	}
}
