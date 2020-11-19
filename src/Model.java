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
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        int size = numbers.size();

        while (size != 0) {
            if (size == 1) {
                num1 = answer;
                num2 = numbers.get(0);

            } else {
                num1 = numbers.get(0);
                num2 = numbers.get(1);
            }
            switch (toDo.get(0)) {
                case "+":
                    answer += num1 + num2;
                    break;
                case "-":
                    answer += num1 - num2;
                    break;
                case "*":
                    answer += num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        answer += num1 / num2;
                    }
                    break;
            }
            if (size == 1) {
                numbers.remove(0);
            } else {
                numbers.remove(0);
                numbers.remove(0);
            }
            size = numbers.size();
            toDo.remove(0);
        }
        numbers.clear();
        toDo.clear();

        return answer;
    }
}
