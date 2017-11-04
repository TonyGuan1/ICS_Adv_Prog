package ICS_Adv_Prog_master.AdvancedProgSkills.Question_7;

import java.util.Scanner;

public class Question7 {

    public static void recurisveFunction(int increment, int end_value) {
        int sum = 0;
        for (int x = 0; x < end_value; x = x + increment) {
            sum = x + sum;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the increment:");
        int increment = reader.nextInt();

        System.out.print("Enter the end value:");
        int end_value = reader.nextInt();

        recurisveFunction(increment, end_value);
    }

}
