package deneme2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;

public class Kullanici extends JFrame {

	private JPanel contentPane;
	private JTextField txt_ad;
	private JTextField txt_sifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kullanici frame = new Kullanici();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kullanici() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KULLANICI GİRİŞİ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(350, 92, 246, 31);
		contentPane.add(lblNewLabel);
		
		txt_ad = new JTextField();
		txt_ad.setBounds(455, 175, 124, 31);
		contentPane.add(txt_ad);
		txt_ad.setColumns(10);
		
		txt_sifre = new JTextField();
		txt_sifre.setColumns(10);
		txt_sifre.setBounds(455, 256, 124, 31);
		contentPane.add(txt_sifre);
		
		JLabel lblNewLabel_1 = new JLabel("Kullanıcı Adı :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(340, 182, 90, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Şifre :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(382, 263, 48, 12);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btn_giris = new JButton("GİRİŞ");
		btn_giris.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_giris.setBounds(455, 336, 124, 31);
		contentPane.add(btn_giris);
		
		JLabel lbl_hata = new JLabel("");
		lbl_hata.setForeground(Color.RED);
		lbl_hata.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_hata.setBounds(340, 391, 262, 20);
		contentPane.add(lbl_hata);
		
		btn_giris.addActionListener((ActionListener) new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String ad = txt_ad.getText();
				String sifre = txt_sifre.getText();
				int deger = 0;//
				boolean sorgu = false;
				
				try {
					
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");//
					Statement myStat = myConn.createStatement();
					ResultSet myRs = myStat.executeQuery("SELECT kullanıcıId From kullanıcı Where email = '"+ad +"' and şifre = '"+sifre+"' ");//
					
					
					while(myRs.next()) {
						if(myRs.wasNull() == false) {//
							deger = myRs.getInt("kullanıcıId");//
							A_Ekran ek = new A_Ekran(deger);
							setVisible(false);
							ek.setVisible(true);
							sorgu = true;
							System.out.println(deger);
						}
					}
					
					if(sorgu == false) {
						lbl_hata.setText("Kullanıcı adı ya da şifreyi hatalı girdiniz.");
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				
			}
			
		});
		
	}
}
