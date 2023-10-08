public class Formatter {

    String r;
    String title = "";

        // Функция вывода результата
        void printResult(String result, double price){
            switchPrice(price);

            String output = "Добавленные товары: \n%s \nСумма на каждого - %.2f %s";
            System.out.println(String.format(output, result, price, r));
    }
    // Функфия склонения рубля
    String switchPrice(double price) {

        double inPrice = Math.floor(price) % 10;
        switch ((int) inPrice) {
            case 0:
            case 6:
            case 5:
            case 7:
            case 9:
            case 8: {
                r = "рублей";
                break;
            }
            case 1: {
                r = "рубль";
                break;
            }
            case 2:
            case 3:
            case 4: {
                r = "рубля";
                break;
            }
        }
        return r;
    }

}
