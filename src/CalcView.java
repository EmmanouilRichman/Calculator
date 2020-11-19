import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

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
    private JButton Button16;
    StringBuilder builder;


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


    public void handleComponents(ActionListener listener) {
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

        Button1.addKeyListener();
        Button2.addKeyListener();
        Button3.addKeyListener();
        Button4.addKeyListener();
        Button5.addKeyListener();
        Button6.addKeyListener();
        Button7.addKeyListener();
        Button8.addKeyListener();
        Button9.addKeyListener();
        Button10.addKeyListener();
        Button11.addKeyListener();
        Button12.addKeyListener();
        Button13.addKeyListener();
        Button14.addKeyListener();
        Button15.addKeyListener();
        Button16.addKeyListener();

    }

}
