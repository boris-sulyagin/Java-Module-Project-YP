import java.util.Scanner;

// Калькулятор

public class Сalculator {

    double price; // Переменная для хранения суммы стоимости товаров
    String title = ""; // Переменная для хранения названий товаров
    String input; // Переменная для хранения ввода подтверждения или завершения

    Product product = new Product(); // Создаётся класс продукта
    Formatter formatter = new Formatter(); // Создаётся класс для форматирования цены и вывода
    Scanner scanner = new Scanner(System.in);

    void addProduct(int countOfPeople) { // Функция для добавления продуктов

        while (true) {

            System.out.println("Хотите ли добавить товар? (Если нет введите - \"Завершить\")");
            input = scanner.next(); // Ввод подтверждения или завершения

            if (input.equalsIgnoreCase("Завершить")) {
                countingTheResult(price, countOfPeople); // Сколько заплатит каждый участник
                formatter.printResult(title, price);
                break;
            } else {
                System.out.println("Введите название продукта:");
                product.title = scanner.next();

                System.out.println("Введите стоимость продукта:");
                product.price = scanner.nextDouble();

                saveTitle(product.title, product.price);
                System.out.println("Товар успешно добавлен");

                sum(product.price);
            }
        }
    }
    // Складываем бюджет
    double sum(double localPrice){
        price = price + localPrice;
        return price;
    }

    // Сохраняем название продуктов
    String saveTitle(String localTitle, double price) {

        if (title.equals(product.title)) {
            title = localTitle;
            title.concat(" - ")
                    .concat(String.valueOf(price))
                    .concat(" ")
                    .concat(formatter.switchPrice(price));
        } else {
            title = title.concat("\n")
                    .concat(localTitle)
                    .concat(" - ")
                    .concat(String.valueOf(price)
                            .concat(" ")
                            .concat(formatter.switchPrice(price)));
        } return title;
    }

    // Сколько заплатит каждый участник
    double countingTheResult(double localPrice, double countOfPeople){
        price = localPrice / countOfPeople;
        return price;
    }

}
