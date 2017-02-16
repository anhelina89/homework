package extra;

import java.util.function.BinaryOperator;

/**
 * Created by Angelina on 05.02.2017.
 */
public class Calculator {

        public static final String REGEX = "([-+]?[0-9]*\\.?[0-9]+[\\/\\+\\-\\*])+([-+]?[0-9]*\\.?[0-9]+)";
        public static final String DELIMETER_REGEX = "[\\/\\+\\-\\*]";

        public static void main(final String[] args) throws Exception {
            System.out.println(calculate("5.2-8"));

            // tests
            assert calculate("5+8") == 13;
            assert calculate("19-8") == 11;
            assert calculate("2.3*5") == 11.5;
            assert calculate("9/2") == 4.5;
        }

        public static double calculate(String expression) {
            if (expression == null || expression.isEmpty() || !expression.matches(REGEX)) {
                throw new IllegalArgumentException("Null, empty or wrong expression " + expression);
            }
            String[] parts = expression.split(DELIMETER_REGEX);
            if (parts.length != 2) {
                throw new IllegalArgumentException("Parts amount must be two. Actual " + parts.length);
            }
            String code = expression.substring(parts[0].length(), parts[0].length() + 1);
            Operation operation = Operation.getOperation(code);
            Double left = Double.valueOf(parts[0]);
            Double right = Double.valueOf(parts[1]);
            return operation.getFunction().apply(left, right);
        }

    }

    enum Operation {
        ADD("+", (a, b) -> a + b),
        SUBTRACT("-", (a, b) -> a - b),
        MULTIPLY("*", (a, b) -> a * b),
        DIVIDE("/",	(a, b) -> a / b);

        private String code;
        private BinaryOperator<Double> function;

        private Operation(String code, BinaryOperator<Double> function) {
            this.code = code;
            this.function = function;
        }

        public String getCode() {
            return code;
        }

        public BinaryOperator<Double> getFunction() {
            return function;
        }

        public static Operation getOperation(String code) {
            for (Operation o : values()) {
                if (o.getCode().equals(code)) {
                    return o;
                }
            }
            return null;
        }
    }


