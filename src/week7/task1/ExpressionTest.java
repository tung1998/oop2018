package week7.task1;

public class ExpressionTest {

    public static void main(String[] args) {
        Numeral num0 = new Numeral();
        Numeral num1 = new Numeral(1);
        Numeral num2 = new Numeral(2);
        Numeral num3 = new Numeral(3);
        Numeral num10 = new Numeral(10);

        Square square = new Square(num10);
        Multiplication multiplication = new Multiplication(num2, num3);
        Subtraction subtraction = new Subtraction(square, num1);
        Addition addition = new Addition(subtraction, multiplication);
        Square result = new Square(addition);




        System.out.println(result.toString()+"="+result.evaluate());
        System.out.println();
        try {
            Division er = new Division(num10, num0);
            int a = er.evaluate();
        }
        catch(ArithmeticException err){
            System.out.println("error: " + err.getMessage());
        }

    }

}