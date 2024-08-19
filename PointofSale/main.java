import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Point of Sale System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "Login Successful");
                showDashboard();
            }
        });

        JButton signupButton = new JButton("Sign up");
        signupButton.setBounds(180, 80, 80, 25);
        panel.add(signupButton);

        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "Signup Feature Coming Soon");
            }
        });
    }

    private static void showDashboard() {
        JFrame dashboard = new JFrame("Dashboard");
        dashboard.setSize(600, 400);
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        dashboard.add(panel);
        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to the Dashboard");
        welcomeLabel.setBounds(10, 20, 300, 25);
        panel.add(welcomeLabel);

        JButton productManagementButton = new JButton("Product Management");
        productManagementButton.setBounds(10, 60, 200, 25);
        panel.add(productManagementButton);

        JButton saleManagementButton = new JButton("Sale Management");
        saleManagementButton.setBounds(10, 100, 200, 25);
        panel.add(saleManagementButton);

        JButton customerManagementButton = new JButton("Customer Management");
        customerManagementButton.setBounds(10, 140, 200, 25);
        panel.add(customerManagementButton);

        JButton reportsButton = new JButton("Reports");
        reportsButton.setBounds(10, 180, 200, 25);
        panel.add(reportsButton);

        dashboard.setVisible(true);
    }
}
