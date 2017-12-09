import java.util.Scanner;

/**
 * Developer: y7usuf
 * Created Date:  20.10.2017
 */
public class LAB3 {
    public static void main(String args[]) {
        int rows;
        Scanner S = new Scanner(System.in);
        System.out.print("How many rows do you want?\n");
        rows = S.nextInt();


        System.out.print(" 1\n");
        for (int r = 1; r < rows; r++) {
            int c = 1;
            for (; c <= r; c++) {
                System.out.format("%2d", c);
            }
            for (; c > 0; c--) {
                System.out.format("%2d", c);
            }
            System.out.print("\n");
        }
    }
}
