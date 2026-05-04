package exercises;

public class MonthDays {

    public static int getDays(int month, int year) {
        if (month < 1 || month > 12)
            throw new IllegalArgumentException();

        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    return 29;
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}