import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        example(1);
        int year = 2021;
        defineLeapYear(year);
        example(2);
        String clientOS = "Android";
        int clientDeviceYear = 2015;
        defineRequiredLink(clientOS, clientDeviceYear);
        example(3);
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

    public static void defineRequiredLink(String clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case "iOS":
                if (clientDeviceYear >= currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                } else
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case "Android":
                if (clientDeviceYear >= currentYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                } else
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            default:
                System.out.print("");
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

    public static void example(int exampleNum) {
        System.out.println("Example " + exampleNum);
    }
}