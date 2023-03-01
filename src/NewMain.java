
import javax.swing.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ditiya
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("JFrame Pertamaku");

        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 100, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 150, 100, 30);
        j.add(password);
        
        JTextField lbUsername = new JTextField();
        lbUsername.setBounds(150, 100, 200, 30);
        j.add(lbUsername);
        
        JPasswordField lbPassword = new JPasswordField();
        lbPassword.setBounds(150, 150, 200, 30);
        j.add(lbPassword);
        
        JButton btLogin = new JButton();
        btLogin.setText("Login");
        btLogin.setBounds(150, 200, 100, 30);
        j.add(btLogin);
        
        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(100, 260, 200, 200);
        j.add(testTxt);

        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);

    }

}
