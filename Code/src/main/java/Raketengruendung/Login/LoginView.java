package Raketengruendung.Login;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ResourceBundle;



public class LoginView extends JPanel {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("LOGIN");

    private JLabel title = new JLabel();
    private JLabel lblUsername = new JLabel();
    private JLabel lblPassword = new JLabel();
    private JTextField textField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JButton loginButton = new JButton();
    private JButton registerButton = new JButton();
    private JLabel label;

    public LoginView() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        //Hintergrund einfügen bei Anmeldeseiten
//       try {
//            BufferedImage myPicture = ImageIO.read(this.getClass().getResource("../img/7.jpg"));
//            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//            picLabel.setBounds(0, 0, 483, 580);
//            this.add(picLabel);
//        } catch (IOException ex) {
//            System.out.println("Das Bild wurde nicht gefunden");
//        }

        title.setText(resourceBundle.getString("login"));
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        title.setBounds(670, 13, 273, 93);
        //title.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(60,139,182)));
        this.add(title);

        textField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        textField.setBounds(601, 200, 250, 30);
        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        textField.setColumns(10);
        textField.setForeground(new Color(100,100,100));
        textField.setOpaque(false);
        this.add(textField);

        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordField.setBounds(601, 300, 250, 30);
        passwordField.setOpaque(false);
        passwordField.setForeground(Color.WHITE);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.add(passwordField);

        lblUsername.setText(resourceBundle.getString("username"));
        lblUsername.setForeground(new Color(60,139,182));
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(600, 150, 193, 52);
        this.add(lblUsername);

        lblPassword.setText(resourceBundle.getString("password"));
        lblPassword.setForeground(new Color(60,139,182));
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(600, 250, 193, 52);
        this.add(lblPassword);

        loginButton.setText(resourceBundle.getString("login"));
        loginButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        loginButton.setBounds(600, 392, 162, 73);
        loginButton.setBorder(new RoundedBorders(30));
        //loginButton.setContentAreaFilled(false);
        loginButton.setBackground(new Color(17,9,48));
        loginButton.setForeground(new Color(60,139,182));
        this.add(loginButton);

        registerButton.setText("No account? Register here");
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        registerButton.setBounds(714, 335, 140, 20);
        registerButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(60,139,182)));
        registerButton.setBackground(new Color(17,9,48));
        registerButton.setForeground(new Color(60,139,182));
        this.add(registerButton);
    }

    class RoundedBorders implements Border {

        private int radius;


        RoundedBorders(int radius) {
            this.radius = radius;
        }


        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        public boolean isBorderOpaque() {
            return true;
        }


        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(JButton registerButton) {
        this.registerButton = registerButton;
    }
}
