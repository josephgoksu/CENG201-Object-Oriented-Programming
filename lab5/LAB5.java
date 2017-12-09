import java.util.ArrayList;
import java.util.Random;

/**
 * Developer: y7usuf
 * Created Date:  3.11.2017
 */
public class LAB5 {
    public static void main(String args[]) {
        Integer parameter = 10;
        System.out.print(randomOddNumber(parameter));
    }

    private static ArrayList<Integer> randomOddNumber(Integer parameter) {
        ArrayList<Integer> randoms = new ArrayList<>(parameter);
        Random rand = new Random();

        while (randoms.size() < parameter) {
            Integer degerler = rand.nextInt(100);
            if (degerler % 2 != 0){
                randoms.add(degerler);
            }
        }

        return randoms;
    }
}
