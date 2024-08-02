import java.util.HashMap;
import java.util.Map;

interface Operation {
    double execute(double a, double b);
}

class Addition implements Operation {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}

class Multiplication implements Operation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}

class Division implements Operation {
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

 class Calculator {
    //takes an Operation object and two numbers (a and b) as parameters. It delegates the computation to the execute method of the Operation object.
         public double calculate(Operation operation, double a, double b) {
             return operation.execute(a, b);
         }
}

//YAGNI
public class OCP {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        //assigning operation interface references to classes
        Operation addition = new Addition();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();
        Operation division = new Division();

        System.out.println("Addition: " + calculator.calculate(addition, 10, 5));
        System.out.println("Subtraction: " + calculator.calculate(subtraction, 10, 5));
        System.out.println("Multiplication: " + calculator.calculate(multiplication, 10, 5));
        System.out.println("Division: " + calculator.calculate(division, 10, 5));
    }

}

