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

import javax.swing.JButton;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MÜZİK PROGRAMI GİRİŞ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(645, 88, 342, 82);
		contentPane.add(lblNewLabel);
		
		JButton btnKullanici = new JButton("KULLANICI GİRİŞ");
		btnKullanici.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnKullanici.setBounds(727, 230, 184, 47);
		contentPane.add(btnKullanici);
		
		JButton btnAdmin = new JButton("ADMİN GİRİŞ");
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdmin.setBounds(727, 319, 184, 47);
		contentPane.add(btnAdmin);
		
		btnKullanici.addActionListener((ActionListener) new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Kullanici k = new Kullanici();
				k.setVisible(true);
				setVisible(false);
			}
			
		});
		
		btnAdmin.addActionListener((ActionListener) new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Ekran k = new Ekran();
				k.setVisible(true);
				setVisible(false);
			}
			
		});
		
		
	}
}
