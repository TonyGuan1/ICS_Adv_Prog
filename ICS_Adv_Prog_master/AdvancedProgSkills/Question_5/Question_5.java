package ICS_Adv_Prog_master.AdvancedProgSkills.Question_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_5 {

    static Scanner reader = new Scanner(System.in);
    static ArrayList<String> Array = new ArrayList<>();

    public static void main(String[] args) {
        int i = 0;//Initalize i
        String[] list = {"Grapes", "Pears", "Peach", "Orange", "Cherry", "Mango"};
        System.out.println(Arrays.toString(list));
        System.out.println("What item would you like to search for ? ");
        while (true) {
            String item = reader.nextLine();
            if (item.equals("exit")) {
                break;
            }

            boolean found = false;

            for (i = 0; i < list.length; i++) {
                if (list[i].equalsIgnoreCase(item)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Found " + item + " at index " + i + ".");
            } else {
                System.out.println(item + "is not in this array.");
            }
        }

    }
}
