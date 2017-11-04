package ICS_Adv_Prog_master.AdvancedProgSkills.newpackage;

class Divider {

    public static void main(String args[]) {
        int a, b, c;
        a = 32;
        b = 0;

        try {
            c = a / b;
            System.out.printf("The result is : " + c);
        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero");
        }
    }
}
