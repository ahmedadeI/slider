import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class secondary_frame {
    public secondary_frame() {
        JFrame frame = new JFrame("Secondary Frame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("This is the secondary frame", SwingConstants.CENTER);
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(label);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridy = 1;
        JButton button = new JButton("enter a new text" );
        frame.add(button, gbc);
        JDialog dialog = new JDialog(frame, "test2", true);
        dialog.setLayout(null);
        dialog.setSize(600, 400);
        button.addActionListener(e -> { String input = JOptionPane.showInputDialog(dialog, "Enter a value:", "Input", JOptionPane.PLAIN_MESSAGE);
            if (input != null) {
                label.setText(input);}});

        gbc.gridy = 2;
        JLabel MousePosition = new JLabel("Mouse Position:");
        frame.add(MousePosition, gbc);
        gbc.gridy = 3;
        JLabel MouseStatus = new JLabel("Mouse Status:");
        frame.add(MouseStatus, gbc);
        frame.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                MousePosition.setText("Mouse Position: (" + e.getX() + ", " + e.getY() + ")");
                MouseStatus.setText("Mouse Status: Clicked");}
            public void mousePressed(MouseEvent e) {
                MouseStatus.setText("Mouse Status: Pressed");}
            public void mouseReleased(MouseEvent e) {
                MouseStatus.setText("Mouse Status: Released");}
            public void mouseEntered(MouseEvent e) {
                MouseStatus.setText("Mouse Status: Entered");}
            public void mouseExited(MouseEvent e) {
                MouseStatus.setText("Mouse Status: Exited");}
        });

        frame.setVisible(true);
    }
}
