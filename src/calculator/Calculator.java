package calculator;

import java.util.ArrayList;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {
        ArrayList<String> stage = new ArrayList<>();

        String tmp = expression[0];
        for (int i = 1; i < expression.length; i = i + 2) {
            String op = expression[i];
            String next = expression[i + 1];
            double a = Double.parseDouble(tmp);
            double b = Double.parseDouble(next);
            switch (op) {
                case "+":
                case "-":
                    stage.add(tmp);
                    stage.add(op);
                    tmp = next;
                    break;
                case "*":
                    tmp = String.valueOf(a * b);
                    break;
                case "/":
                    tmp = String.valueOf(a / b);
                    break;
                default:
                    return "Error";
            }
        }

        stage.add(tmp);

        double result = Double.parseDouble(stage.get(0));
        for (int i = 1; i < stage.size(); i += 2) {
            String op = stage.get(i);
            double next = Double.parseDouble(stage.get(i + 1));
            switch (op) {
                case "+":
                    result = result + next;
                    break;
                case "-":
                    result = result - next;
                    break;
                default:
                    return "Error";
            }
        }

        return String.valueOf(result);
    }

}
