import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class CalcView extends JFrame {
    public JPanel panel1;
    public JTextField enterTextField;
    public JButton Button1;
    public JButton Button2;
    public JButton Button3;
    public JButton Button4;
    public JButton Button6;
    public JButton Button7;
    public JButton Button8;
    public JButton Button9;
    public JButton Button5;
    public JButton Button10;
    public JButton Button11;
    public JButton Button12;
    public JButton Button13;
    public JButton Button14;
    public JButton Button15;
    StringBuilder builder;
    private JButton Button16;


    public CalcView() {
        this.setVisible(true);
        this.setTitle("Calculator");
        this.setSize(350, 350);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(panel1);
        builder = new StringBuilder();
    }


    public void handleComponents(ActionListener listener, KeyListener keyListener) {
        this.addKeyListener(keyListener);

        enterTextField.setEditable(false);
        Button1.addActionListener(listener);
        Button2.addActionListener(listener);
        Button3.addActionListener(listener);
        Button4.addActionListener(listener);
        Button5.addActionListener(listener);
        Button6.addActionListener(listener);
        Button7.addActionListener(listener);
        Button8.addActionListener(listener);
        Button9.addActionListener(listener);
        Button10.addActionListener(listener);
        Button11.addActionListener(listener);
        Button12.addActionListener(listener);
        Button13.addActionListener(listener);
        Button14.addActionListener(listener);
        Button15.addActionListener(listener);
        Button16.addActionListener(listener);

    }

}
