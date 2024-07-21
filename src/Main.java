public class Main {
    public static void main(String[] args) {
        System.out.println("Example 1");
        int year = 2021;
        defineLeapYear(year);
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
}