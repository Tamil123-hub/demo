import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    JTextField d = new JTextField();
    double n1, n2;
    char op;

    Calculator() {
        setTitle("Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        d.setEditable(false);
        add(d, BorderLayout.NORTH);

        JPanel p = new JPanel(new GridLayout(5, 4));
        String[] b = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+",
            "sin","cos","tan",""
        };

        for (String s : b) {
            JButton x = new JButton(s);
            x.addActionListener(e -> click(s));
            p.add(x);
        }

        add(p, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void click(String s) {
        if (s.matches("[0-9]"))
            d.setText(d.getText() + s);

        else if (s.equals("C"))
            d.setText("");

        else if (s.equals("sin"))
            d.setText("" + Math.sin(Math.toRadians(Double.parseDouble(d.getText()))));

        else if (s.equals("cos"))
            d.setText("" + Math.cos(Math.toRadians(Double.parseDouble(d.getText()))));

        else if (s.equals("tan"))
            d.setText("" + Math.tan(Math.toRadians(Double.parseDouble(d.getText()))));

        else if (s.equals("=")) {
            n2 = Double.parseDouble(d.getText());

            double r = switch(op) {
                case '+' -> n1 + n2;
                case '-' -> n1 - n2;
                case '*' -> n1 * n2;
                case '/' -> n1 / n2;
                default -> n2;
            };

            d.setText("" + r);
        }
        else {
            n1 = Double.parseDouble(d.getText());
            op = s.charAt(0);
            d.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
              }
