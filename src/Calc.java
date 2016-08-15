import java.util.Scanner;

public class Calc {
    private double a;
    private double b;

    public static void main(String[] args) {

        String digit1 = input(" Enter first");
        String operation = input(" + or - or * or / ");
        String digit2 = input(" Enter second");

        double result = 0;
        try {

            switch (operation) {
                case "+":
                    result = Calculations.add(digit1, digit2);
                    break;
                case "-":
                    result = Calculations.minus(digit1, digit2);

                    break;
                case "/":
                    result = Calculations.add(digit1, digit2);

                    break;
                case "*":
                    result = Calculations.add(digit1, digit2);

                    break;
                default:
                    break;
            }
            System.out.println("result is: "+result);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static String input(String enter) {
        System.out.println(enter);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


}
