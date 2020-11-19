import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Controller {
    private final CalcView view;
    private final Model model;
    ArrayList<String> equation = new ArrayList<>();
    String num = "";

    public Controller(CalcView view, Model model) {
        this.view = view;
        this.model = model;
        view.handleComponents(listener);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton pushed = (JButton) actionEvent.getSource();
            String item = pushed.getText();
            if(item.equals("Clear")){
                num = "";
                view.builder.delete(0, view.builder.length());
                equation.clear();
                view.enterTextField.setText("");
            }
            else if (item.equals("=")) {
                equation.add(num);
                view.enterTextField.setText(Integer.toString(handleEquation(equation)));
                view.builder.delete(0, view.builder.length());
                num = "";
                equation.clear();
            } else {
                if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
                    equation.add(num);
                    equation.add(item);
                    view.builder.append(" ");
                    view.builder.append(item);
                    view.builder.append(" ");
                    view.enterTextField.setText(view.builder.toString());
                    num = "";
                } else {
                    num += item;
                    view.builder.append(item);
                    view.enterTextField.setText(view.builder.toString());
                }
            }
        }
    };


    KeyListener keyListener = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent keyEvent) {

        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {

        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }
    };

    public int handleEquation(ArrayList equation) {
        return model.handleInput(equation);
    }


}
