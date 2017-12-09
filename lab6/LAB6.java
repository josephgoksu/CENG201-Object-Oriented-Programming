/**
 * Developer: y7usuf
 * Created Date:  24.11.2017
 */

import java.util.Objects;
import java.util.Random;

public class LAB6 {
    public static void main(String args[]) {
        Integer[] books = new Integer[200];
        Integer[][] user = new Integer[100][50];
        Random randomGenerator = new Random();
        int k = 0;
        int l = 0;

        for (int i = 0; i < 200; i++) {
            int randomInt = randomGenerator.nextInt(200);
            books[i] = randomInt;
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 50; j++) {
                user[i][j] = books[i];
            }
        }

//        User i
        for (int i = 0; i < 100; i++) {
//            User i + 1
            for (int j = i + 1; j < 100; j++) {
//                books
                if (user[i][k] == user[j][l]){
                    System.out.println("User" + i + " bought books " + user[i][k]);
                    System.out.println("User" + j + " bought books " + user[j][l]);
                    System.out.println("----------------------------------");
                    k++;
                    l++;
                }

            }
        }



    }
}
