import com.goit.javaonline3.gcd.CustomScanner;
import com.goit.javaonline3.gcd.Gcd;

public class Runner {

    public static void main(String[] arg) {

        System.out.println("Please enter two integer numbers:");

        int firstNumber = CustomScanner.getInt();
        int secondNumber = CustomScanner.getInt();

        System.out.println("Greatest common divisor for your two numbers is: " + Gcd.findGcd(firstNumber, secondNumber));

        CustomScanner.close();
    }
}
