import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        defineLeapYear(year);
        int clientOS = 1;
        int clientDeviceYear = 2015;
        defineRequiredLink(clientOS, clientDeviceYear);
        int deliveryDistance = 95;
        countingDays(deliveryDistance);
    }

    public static void defineLeapYear(int year) {
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year < 1584) {
            System.out.println(year + " год находится на числовой оси до введения високосного года в 1584");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void defineRequiredLink(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear) {
            System.out.print("Установите по ссылке версию приложения для ");
        } else
            System.out.print("Установите по ссылке облегченную версию приложения для ");
        switch (clientOS) {
            case 0:
                System.out.println("iOS");
                break;
            case 1:
                System.out.println("Android");
                break;
            default:
                break;
        }
    }

    public static void countingDays(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else
            System.out.println("Доставки нет");
    }
}