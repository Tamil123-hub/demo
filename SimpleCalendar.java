import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class SimpleCalendar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calendar");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(0, 7));

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : days) {
            panel.add(new JLabel(day, SwingConstants.CENTER));
        }

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);

        int firstDay = cal.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < firstDay; i++) {
            panel.add(new JLabel(""));
        }

        int maxDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i <= maxDays; i++) {
            panel.add(new JLabel(String.valueOf(i), SwingConstants.CENTER));
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
