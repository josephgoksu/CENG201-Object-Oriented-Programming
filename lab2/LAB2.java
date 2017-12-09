import java.util.*;

/**
 * Developer: y7usuf
 * Created Date:  13.10.2017
 */
public class LAB2 {

    private static void language(final int n, final String[] syllables, final String currentWord) { // example of N = 3
        if (n == 0) {
            System.out.println(currentWord);
        } else {
            for (int i = 0; i < syllables.length; i++) {
                language(n - 1, syllables,  syllables[i]);
            }
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your 3 words sentence: ");
        String cumle = scanner.nextLine();
        String[] parcaliCumle = cumle.split("\\s+");

//        System.out.print(parcaliCumle[0] + " " + parcaliCumle[1] + " " + parcaliCumle[2]);
//        System.out.println();
//        System.out.print(parcaliCumle[0] + " " + parcaliCumle[2] + " " + parcaliCumle[1]);
//        System.out.println();
//        System.out.print(parcaliCumle[1] + " " + parcaliCumle[2] + " " + parcaliCumle[0]);
//        System.out.println();
//        System.out.print(parcaliCumle[1] + " " + parcaliCumle[0] + " " + parcaliCumle[2]);
//        System.out.println();
//        System.out.print(parcaliCumle[2] + " " + parcaliCumle[0] + " " + parcaliCumle[1]);
//        System.out.println();
//        System.out.print(parcaliCumle[2] + " " + parcaliCumle[1] + " " + parcaliCumle[0]);
//        System.out.println();

        for (int i = 0; i < parcaliCumle.length; i++){
            System.out.print(parcaliCumle[i].concat(parcaliCumle[i+1]));
        }

    }

}
