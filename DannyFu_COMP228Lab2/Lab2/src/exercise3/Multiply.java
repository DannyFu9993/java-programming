package exercise3;

public class Multiply {


    //Takes 1 parameter and multiplies by itself.
    public static String multiply(double firstInput){
        double result = firstInput * firstInput;

        return firstInput + " when multipled by itself is: " + result;

    }
    //Takes 2 parameters and multiplies first input with second input.
    public static String multiply(double firstInput, double secondInput){
        double result = firstInput * secondInput;
        return firstInput + " when multipled by " + secondInput + " is: " + result;

    }
    //Takes 2 parameters and multiplies first input with second input and third input.
    public static String multiply(double firstInput, double secondInput, double thirdInput){
        double result = firstInput * secondInput * thirdInput;
        return firstInput + " when multipled by " + secondInput + " and " + thirdInput + " is: " + result;

    }
}

