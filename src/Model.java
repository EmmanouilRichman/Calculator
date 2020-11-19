import java.util.ArrayList;
import java.util.HashSet;

public class Model {
    HashSet<String> operators = new HashSet<>();
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<String> toDo = new ArrayList<>();

    public Model() {
        operators.add("*");
        operators.add("/");
        operators.add("+");
        operators.add("-");
    }

    public int handleInput(ArrayList<String> equation) {
        for (int i = 0; i < equation.size(); i++) {
            if (operators.contains(equation.get(i))) {
                toDo.add(equation.get(i));
            } else {
                numbers.add(Integer.parseInt(equation.get(i)));
            }
        }
        return doArithmetic();
    }

    public int doArithmetic() {
        int num1 = numbers.get(0);
        int num2 = numbers.get(1);
        int answer = 0;

        switch (toDo.get(0)) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    answer = num1 / num2;
                }
                break;
        }
        numbers.clear();
        toDo.clear();

        return answer;
    }
}
