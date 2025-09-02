import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an operator (+,-,*,/) : ");
        var op = sc.next();
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int res=0;    
        switch (op) {
            case "+":res=num1+num2;
            System.out.println("Sum of two numbers is " + res);
            break;
            case "-":res=num1-num2;
            System.out.println("Difference of two numbers is " + res);
            break;
            case "*":res=num1*num2;
            System.out.println("Product of two numbers is " + res);
            break;
            case "/":res=num1/num2;
            System.out.println("Quotient of two numbers is " + res); 
            break; 
            default:
            System.out.println("Error!invalid operator");
                break;
        }


    

    }
}
