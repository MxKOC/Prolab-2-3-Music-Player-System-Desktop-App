package deneme2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class koc extends JFrame {

	private JPanel contentPane;
	static String index;
	static int ID;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();
	public static A_Ekran ekran;//
	
	Object[] sutunlar = {"Sanatçı_adı"};
	Object[] satirlar = new Object[1];
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					koc frame = new koc(index,ekran,ID);//
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
	public koc(String index, A_Ekran ekran,int ID) {//
		
		this.index=index;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.ekran = ekran;//
		
		
		setBounds(100, 100, 321, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Object[] sutunlar_tmp = {"Sanatçı_adı"};
		Object[] satirlar_tmp = new Object[1];
		String yazı ;
		
		
		JLabel lblNewLabel = new JLabel("Albüm adı");
		lblNewLabel.setBounds(36, 410, 73, 35);
		contentPane.add(lblNewLabel);
		
		
		JLabel sayı = new JLabel("");
		sayı.setBounds(119, 422, 97, 23);
		contentPane.add(sayı);
		
		
		
		
try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select album_adı From şarki,album where SarkıID="+index+" and albumId=albüm ");
			

			try {
				
				while(myRs.next()) {
					
					
					yazı = myRs.getString("album_adı");
					sayı.setText(yazı);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		











		
		model.setColumnIdentifiers(sutunlar);
		
		
try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select Sanatçı_adı From sanatçı,şarkı_sanatçı where sarkı="+index+"  and sanatcı=ID ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("Sanatçı_adı");

					model.addRow(satirlar_tmp);

				}	
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		table = new JTable();
		table.setBounds(36, 0, 211, 336);
		table.setModel(model);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("DİNLE");
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnNewButton.setBounds(36, 347, 112, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sil");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int ind=Integer.parseInt(index);  
				String sorgu = "DELETE From çalma_listesi Where Kullanıcı ="+ID+" and şarkı= "+ ind +" " ;
				System.out.println(sorgu);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(sorgu);
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				
				ekran.cizdir();
			}
		});
		btnNewButton_1.setBounds(158, 347, 89, 35);
		contentPane.add(btnNewButton_1);
		
		////////////////////////////////////Burdan
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b = 0;
				String kod = "Select dinlenme_sayısı From şarki Where SarkıID = "+index;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					ResultSet myRs = myStat.executeQuery(kod);
					while(myRs.next()) {
					b = myRs.getInt("dinlenme_sayısı");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				String kod2 = "Update şarki Set dinlenme_sayısı = "+ (b+1) + " Where SarkıID = " + index;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod2);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				ekran.cizdir();
				
			}
		});
		//Buraya Kadar///////////////////////////////////////////// 
		

	
		System.out.println("<<"+index);
	
	}
}