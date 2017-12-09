import java.util.Arrays;
import java.util.Scanner;

/**
 * Developer: y7usuf
 * Created Date:  6.10.2017
 */
public class LAB1 {
    public static void main(String args[]){
        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        // System.out.println(Arrays.toString(days));

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter today's day: ");
        Integer day = Integer.valueOf(scanner.next());
        System.out.print("Enter the number of days elapsed since today: ");
        Integer elapsed = Integer.valueOf(scanner.next());

        Integer Newelapsed = elapsed % 7;
        Integer calculated = day + Newelapsed;

        if(calculated == 7){
            calculated = 0;
        }

        System.out.print("Today is ");
        System.out.print(days[day]);
        System.out.print(" and the future day is ");
        System.out.print(days[calculated]);
    }
}
