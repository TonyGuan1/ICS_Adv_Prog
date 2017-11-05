package ICS_Adv_Prog_master.AdvancedProgSkills.Question_7;

import java.util.Scanner;

public class Question_7 {

    public static void Total_Sum(int increment, int currentVal, int sum, int endValue) {
        if (currentVal > endValue) {
            System.out.println(sum);
        } else {
            sum += currentVal;
            Total_Sum(increment, currentVal + increment, sum, endValue);
        }
    }

    public static void main(String[] args) {
        int currentVal = 0, sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter increment value ");
        int increment = reader.nextInt();
        System.out.println("Enter end value ");
        int endValue = reader.nextInt();

        Total_Sum(increment, currentVal, sum, endValue);
    }
}
