package ICS_Adv_Prog_master.AdvancedProgSkills.Question_6;

/**
 *
 * @author Tonyg
 */
import java.util.Scanner;
import java.util.Arrays;

public class Question_6 {

    static Scanner reader = new Scanner(System.in);
    static int[] list = new int[]{2, 3, 5, 1, 4, 6, 10, 9, 25};

    public static void main(String[] args) {
        int exit = -1;
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("What would you like to search for?\nType -1 to exit");
        int n;
        String b;
        while (true) {
            try {
                n = reader.nextInt();
                if (exit == n) {
                    break;
                }
                if (binarySearch(list, n)) {
                    System.out.println("Found the number " + n);
                } else {
                    System.out.println("Not found\nTry again");
                }

            } catch (Exception e) {
                System.out.println("Error\nTry again");
                b = reader.next();
            }
        }
    }

    static boolean binarySearch(final int[] array, final int search) {
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                return true;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return false;
    }
}
