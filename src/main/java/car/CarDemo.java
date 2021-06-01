package car;

import javax.swing.*;

public class CarDemo {
    private JPanel panelmain;
    private JTextField textField1;
    private JButton button1;
    private JPanel northPenel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().panelmain);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


}
