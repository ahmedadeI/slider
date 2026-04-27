import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TEST");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        frame.add(slider, gbc);
        gbc.gridy = 1;

        JButton button2 = new JButton("open new frame");
        JButton button = new JButton("Value: " + slider.getValue());
        frame.add(button, gbc);
        gbc.gridy= 2;
        frame.add(button2, gbc);
        JDialog dialog = new JDialog(frame, "test2", true);
        dialog.setLayout(null);
        dialog.setSize(600, 400);
        button.addActionListener(e -> JOptionPane.showMessageDialog(dialog, " value: " + slider.getValue(),"value",JOptionPane.INFORMATION_MESSAGE ));
        slider.addChangeListener(e -> button.setText("Value: " + slider.getValue()));
        button2.addActionListener(e -> {secondary_frame secondaryFrame = new secondary_frame();});
        frame.setVisible(true);

        dahdkjasdhkjasdhjkas
    }
}
