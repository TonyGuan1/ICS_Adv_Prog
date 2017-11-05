package ICS_Adv_Prog_master.AdvancedProgSkills.Question_8;

import java.util.Scanner;

public class Question_8 {

    public static void Hanoi(int disk, int sum) {
        if (disk == 0) {
            System.out.println(sum + 1 + " Moves required");
        } else {
            sum += (int) (java.lang.Math.pow(2, disk));
            Hanoi(disk - 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of disks");
        int disk = (scanner.nextInt() - 1);
        int sum = 0;
        Hanoi(disk, sum);
    }
}
