import java.util.Arrays;
public class calculateDay {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide a valid date in the format MM DD YYYY");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Please provide a valid date");
            return;
        }

        System.out.println("Day of the Week: " + getDayOfWeek(month, day, year));
    }

    public static String getDayOfWeek(int month, int day, int year) {
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int t = year;
        int m = month;
        if (m < 3) {
            m += 12;
            t--;
        }
        int f = (14 - m) / 12;
        int y = t + 4800 - f;
        int g = y % 100;
        int h = (day + (153 * (m - 3 + 12 * f - 4) / 5 + 2) % 7);
        int j = h % 7;
        return days[j];
    }
}
