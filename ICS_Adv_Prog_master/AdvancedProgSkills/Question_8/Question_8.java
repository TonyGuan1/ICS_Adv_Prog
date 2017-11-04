package ICS_Adv_Prog_master.AdvancedProgSkills.Question_8;

import java.util.Scanner;

public class Question_8 {

    public static void hanoi(int discs) {
        int moves = (int) (Math.pow(2, discs) - 1);
        System.out.println("Minimum number of moves : " + moves);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of discs: ");
        int discs = reader.nextInt();
        hanoi(discs);
    }

}
