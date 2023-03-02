/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

import javax.swing.*;

/**
 *
 * @author ditiya
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame j = new JFrame("Data Kunjungan Perpustakaan Politeknik Negeri Padang");
        
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(50, 100, 100, 30);
        j.add(nama);
        
        JTextField txtNama = new JTextField();
        txtNama.setBounds(150, 100, 200, 30);
        j.add(txtNama);
        
        JLabel jenisKelamin = new JLabel();
        jenisKelamin.setText("Jenis Kelamin");
        jenisKelamin.setBounds(50, 150, 100, 30);
        j.add(jenisKelamin);
        
        JRadioButton l = new JRadioButton();
        l.setText("Laki-laki");
        l.setBounds(150, 150, 100, 30);
        j.add(l);
        
        JRadioButton p = new JRadioButton();
        p.setText("Perempuan");
        p.setBounds(250, 150, 100, 30);
        j.add(p);
        
        JLabel instansi = new JLabel();
        instansi.setText("Nama Instansi");
        instansi.setBounds(50, 200, 100, 30);
        j.add(instansi);
        
        JTextField txtInstansi = new JTextField();
        txtInstansi.setBounds(150, 200, 200, 30);
        j.add(txtInstansi);
        
        JLabel quote = new JLabel();
        quote.setText("Quote hari ini...");
        quote.setBounds(50, 250, 100, 30);
        j.add(quote);
        
        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(150, 250, 200, 100);
        j.add(testTxt);
        
        JCheckBox chaptca = new JCheckBox();
        chaptca.setText("Saya bukan robot...");
        chaptca.setBounds(150, 350, 200, 50);
        j.add(chaptca);
        
        JButton submit = new JButton();
        submit.setText("Konfirmasi");
        submit.setBounds(150, 400, 100, 30);
        j.add(submit);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
