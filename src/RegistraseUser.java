
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ditiya
 */
public class RegistraseUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame();
        
        JLabel lbNama = new JLabel();
        lbNama.setText("Nama");
        lbNama.setBounds(50, 100, 100, 30);
        j.add(lbNama);
        
        JTextField txtNama = new JTextField();
        txtNama.setBounds(150, 100, 200, 30);
        j.add(txtNama);
        
        JLabel lbUsername = new JLabel();
        lbUsername.setText("Username");
        lbUsername.setBounds(50, 150, 100, 30);
        j.add(lbUsername);
        
        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(150, 150, 200, 30);
        j.add(txtUsername);
        
        JLabel lbPassword = new JLabel();
        lbPassword.setText("Password");
        lbPassword.setBounds(50, 200, 100, 30);
        j.add(lbPassword);
        
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 200, 200, 30);
        j.add(txtPassword);
        
        JLabel lbEmail = new JLabel();
        lbEmail.setText("Email");
        lbEmail.setBounds(50, 250, 100, 30);
        j.add(lbEmail);
        
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(150, 250, 200, 30);
        j.add(txtEmail);
        
        JLabel lbHP = new JLabel();
        lbHP.setText("No HP");
        lbHP.setBounds(50, 300, 100, 30);
        j.add(lbHP);
        
        JTextField txtHP = new JTextField();
        txtHP.setBounds(150, 300, 200, 30);
        j.add(txtHP);
        
        JButton btRegistrasi = new JButton();
        btRegistrasi.setText("Registrasi");
        btRegistrasi.setBounds(150, 350, 100, 30);
        j.add(btRegistrasi);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
