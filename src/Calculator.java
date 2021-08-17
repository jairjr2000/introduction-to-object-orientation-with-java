import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Number number1 = new Number();
        Number number2 = new Number();
        Number result = new Number();

        System.out.printf("%nEnter value 1: ");
        number1.setValue(scanner.nextFloat());
        System.out.printf("%nEnter value 2: ");
        number2.setValue(scanner.nextFloat());
        result.setValue(number1.getValue() + number2.getValue());
        System.out.print("The sum of " + number1.getValue() + " and " + number2.getValue() + " equals: " + result.getValue());


    }

}
