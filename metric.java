import javax.swing.*;
import java.awt.*;

public class metric extends JFrame {

    public metric() {

        setTitle("Metric Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextField input = new JTextField(10);
        JLabel result = new JLabel("Result: ");
        JButton button = new JButton("Convert");

        JComboBox<String> type = new JComboBox<>(new String[]{
                "Hours to Minutes",
                "Minutes to Hours",
                "Celsius to Fahrenheit",
                "Fahrenheit to Celsius",
                "Kilograms to Grams",
                "Grams to Kilograms"
        });

        JPanel panel = new JPanel();

        panel.add(new JLabel("Enter value: "));
        panel.add(input);
        panel.add(type);
        panel.add(button);
        panel.add(result);

        add(panel);

        button.addActionListener(e -> {
            try {
                double value = Double.parseDouble(input.getText());
                double answer = 0;

                switch ((String) type.getSelectedItem()) {
                    case "Hours to Minutes":
                        answer = value * 60;
                        break;

                    case "Minutes to Hours":
                        answer = value / 60;
                        break;

                    case "Celsius to Fahrenheit":
                        answer = (value * 9 / 5) + 32;
                        break;

                    case "Fahrenheit to Celsius":
                        answer = (value - 32) * 5 / 9;
                        break;

                    case "Kilograms to Grams":
                        answer = value * 1000;
                        break;

                    case "Grams to Kilograms":
                        answer = value / 1000;
                        break;
                }

                result.setText("Result: " + answer);

            } catch (NumberFormatException ex) {
                result.setText("Invalid Input.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MetricConverter().setVisible(true);
        });
    }
}
