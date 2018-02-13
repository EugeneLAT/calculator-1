package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {
        String a = expression[0];
        String b = expression[2];
        String op = expression[1];

        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);

        double result;
        switch (op) {
            case "+":
                result = da + db;
                break;
            case "-":
                result = da - db;
                break;
            default:
                return "Error";
        }


        return String.valueOf(result);
    }

}
