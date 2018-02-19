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
        String op1 = expression[1];
        String op2 = "+";
        String c = "0";

        if (expression.length == 5) {
            op2 = expression[3];
            c = expression[4];
        }

        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);
        double dc = Double.parseDouble(c);

        double tmp1;
        double tmp2;
        String tmpOp;
        double sign = 1;

        switch (op1) {
            case "-":
                sign = -1;
            case "+":
                switch (op2) {
                    case "*":
                        tmp1 = da;
                        tmp2 = db * dc;
                        tmpOp = op1;
                        break;
                    case "/":
                        tmp1 = da;
                        tmp2 = db / dc;
                        tmpOp = op1;
                        break;
                    default:
                        tmp1 = da + sign * db;
                        tmp2 = dc;
                        tmpOp = op2;
                }
                break;
            case "*":
                tmp1 = da * db;
                tmp2 = dc;
                tmpOp = op2;
                break;
            case "/":
                tmp1 = da / db;
                tmp2 = dc;
                tmpOp = op2;
                break;
            default:
                return "Error";
        }

        double result;
        switch (tmpOp) {
            case "-":
                result = tmp1 - tmp2;
                break;
            case "+":
                result = tmp1 + tmp2;
                break;
            case "*":
                result = tmp1 * tmp2;
                break;
            case "/":
                result = tmp1 / tmp2;
                break;
            default:
                return "Error";
        }

        return String.valueOf(result);
    }

}
