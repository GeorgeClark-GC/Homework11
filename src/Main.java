import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example 1");
        int year = 2021;
        defineLeapYear(year);
        System.out.println("Example 2");
        String clientOS = "Android";
        int clientDeviceYear = 2015;
        defineRequiredLink(clientOS, clientDeviceYear);
    }
    public static void defineLeapYear(int year){
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year + " год является високосным");
        }
        else if (year < 1584)
        {
            System.out.println(year + " год находится на числовой оси до введения високосного года в 1584");
        }
        else
        {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void defineRequiredLink(String clientOS, int clientDeviceYear){
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
                }
                else
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            default:
                System.out.println("");
        }
    }
}