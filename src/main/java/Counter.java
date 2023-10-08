import java.util.Scanner;
//Класс для подсчёта челоек
public class Counter {

    Сalculator сalculator = new Сalculator();
    Scanner scanner = new Scanner(System.in);

    void count() {
        while (true) {

            System.out.println("На какое количество человек необходимо разделить счёт?");
            int command = scanner.nextInt();

            if (command < 1) {
                System.out.println("Некорректное значение для подсчёта. Значение должно быть больше 2");
            } else if (command > 1) {
                сalculator.addProduct(command); // запускаем функцию добавления товаров в калькуляторе
                break;
            } else if (command == 1) {
                System.out.println("Количество человек равно 1, нет смысла ничего подсчитывать");
                break;
            }
        }
    }
}
