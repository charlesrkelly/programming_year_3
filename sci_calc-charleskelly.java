import java.lang.Math;
import java.util.Scanner;
class sci_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
        [ 1] - Addition
        [ 2] - Subtraction
        [ 3] - Multiplaction
        [ 4] - Division
        [ 5] - Square root
        [ 6] - Square
        [ 7] - Sin
        [ 8] - Cos
        [ 9] - Tan
        [10] - Natural Log
        [11] - Exponential e^x
        [12] - Exit""");
        while(true) {
            System.out.print("Enter the number of the operation you would like: ");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.print("Enter first number: ");
                double numOne = sc.nextDouble();
                System.out.print("Enter second number: ");
                double numTwo = sc.nextDouble();
                addIt(numOne,numTwo);
            }
            if (input == 2){
                System.out.print("Enter first number: ");
                double numOne = sc.nextDouble();
                System.out.print("Enter second number: ");
                double numTwo = sc.nextDouble();
                subIt(numOne,numTwo);
            }
            if (input == 3){
                System.out.print("Enter first number: ");
                double numOne = sc.nextDouble();
                System.out.print("Enter second number: ");
                double numTwo = sc.nextDouble();
                mulIt(numOne,numTwo);
            }
            if (input == 4){
                System.out.print("Enter first number: ");
                double numOne = sc.nextDouble();
                System.out.print("Enter second number: ");
                double numTwo = sc.nextDouble();
                divIt(numOne,numTwo);
            }
            if (input == 5){
                System.out.print("Enter the number you want to square root: ");
                double numOne = sc.nextDouble();
                rootIt(numOne);
            }
            if (input == 6){
                System.out.print("Enter the number you want to square: ");
                double numOne = sc.nextDouble();
                squareIt(numOne);
            }
            if (input == 7){
                System.out.print("Enter the sine you want (in radians): ");
                double numOne = sc.nextDouble();
                sinIt(numOne);
            }
            if (input == 8){
                System.out.print("Enter the cosine you want (in radians): ");
                double numOne = sc.nextDouble();
                cosIt(numOne);
            }
            if (input == 9){
                System.out.print("Enter the tangent you want (in radians): ");
                double numOne = sc.nextDouble();
                tanIt(numOne);
            }
            //natural log and exponential
            if (input == 10){
                System.out.print("Enter the natural log (ln) you want: ");
                double numOne = sc.nextDouble();
                naturalLogIt(numOne);
            }
            if (input == 11){
                System.out.print("Enter the x you want (in e^x): ");
                double numOne = sc.nextDouble();
                expIt(numOne);
            }
            if (input == 12) {
                break;
            }
        }
    }

    private static void addIt(double numberOne, double numberTwo) {
        System.out.println("Sum: " + (numberOne + numberTwo));
    }
    private static void subIt(double numberOne, double numberTwo) {
        System.out.println("Difference: " + (numberOne - numberTwo));
    }
    private static void mulIt(double numberOne, double numberTwo) {
        System.out.println("Product: " + (numberOne * numberTwo));
    }
    private static void divIt(double numberOne, double numberTwo) {
        if(numberTwo==0.0)
            System.out.println("Error: Undefined");
        else
            System.out.println("Quotient: " + (numberOne / numberTwo));
    }
    private static void rootIt(double numberOne) {
        if(numberOne<0.0)
            System.out.println("Error: Non-real calculation");
        else
            System.out.println("Square Root: " + Math.sqrt(numberOne));
    }
    private static void squareIt(double numberOne) {
        System.out.println("Number Squared: " + Math.pow(numberOne,2));
    }
    private static void sinIt(double numberOne) {
        System.out.println("Sine: " + Math.sin(numberOne));
    }
    private static void cosIt(double numberOne) {
        System.out.println("Cosine: " + Math.cos(numberOne));
    }
    private static void tanIt(double numberOne) {
        System.out.println("Tangent: " + Math.tan(numberOne));
    }
    private static void naturalLogIt(double numberOne) {
        if(numberOne<0.0)
            System.out.println("Error: Non-Real calculation");
        else if(numberOne==0.0)
            System.out.println("Error: Invalid Domain");
        else
            System.out.println("Natural log is: " + Math.log(numberOne));
    }
    private static void expIt(double numberOne) {
        System.out.println("Exponential result is: " + Math.exp(numberOne));
    }

}
