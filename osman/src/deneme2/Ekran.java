package deneme2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.Color;

public class Ekran extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTable table;
	private JTextField txt_id;
	private JTextField txt_ad;
	private JTextField txt_tarih;
	private JTextField txt_tur;
	
	DefaultTableModel model1 = new DefaultTableModel();
	Object[] kolonlar1 = {"albumId","album_adı","tarih","tür"};
	Object[] satirlar1 = new Object[4];
	DefaultTableModel model2 = new DefaultTableModel();
	Object[] kolonlar2 = {"ID","Sanatçı_adı","Ülkesi"};
	Object[] satirlar2 = new Object[3];
	DefaultTableModel model3 = new DefaultTableModel();
	Object[] kolonlar3 = {"SarkıID","Şarkı_Adı","tür","tarih","süre","dinlenme_sayısı","ülke","albüm"};
	Object[] satirlar3 = new Object[8];
	DefaultTableModel model4 = new DefaultTableModel();
	Object[] kolonlar4 = {"sanatcı","sarkı"};
	Object[] satirlar4 = new Object[2];
	DefaultTableModel model5 = new DefaultTableModel();
	Object[] kolonlar5 = {"kullanıcıId","kullanıcı_adı","email","şifre","abonelik_türü","ülke","ödendi"};
	Object[] satirlar5 = new Object[7];
	DefaultTableModel model6 = new DefaultTableModel();
	Object[] kolonlar6 = {"kullanıcıId","kullanıcıId1"};
	Object[] satirlar6 = new Object[2];
	
	private JTable table_1;
	private JTextField txt1_id;
	private JTextField txt1_ad;
	private JTextField txt1_ulke;
	private JTable table_2;
	private JTextField txt2_id;
	private JTextField txt2_ad;
	private JTextField txt2_tur;
	private JTextField txt2_tarih;
	private JTextField txt2_sure;
	private JTextField txt2_dinlenme;
	private JTextField txt2_ulke;
	private JTable table_3;
	private JTextField txt3_sanatci;
	private JTextField txt3_sarki;
	private JTable table_4;
	private JTextField txt4_id;
	private JTextField txt4_ad;
	private JTextField txt4_email;
	private JTextField txt4_sifre;
	private JTextField txt4_tur;
	private JTextField txt4_ulke;
	private JTextField txt4_odendi;
	
	static String tmp;
	static String tmp2;
	static String tmp3;
	static String tmp4;
	private JTable table_5;
	private JTextField txt5_id;
	private JTextField txt5_id1;
	private JTextField txt2_album;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ekran frame = new Ekran();
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
	
	public void tabloCiz() {
		DefaultTableModel model_tmp = new DefaultTableModel();
		Object[] sutunlar_tmp = {"albumId","album_adı","tarih","tür"};
		Object[] satirlar_tmp = new Object[4];
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From album");
			
			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("albumId");
					satirlar_tmp[1] = myRs.getString("album_adı");
					satirlar_tmp[2] = myRs.getString("tarih");
					satirlar_tmp[3] = myRs.getString("tür");
					
					model_tmp.setColumnIdentifiers(sutunlar_tmp);
					model_tmp.addRow(satirlar_tmp);
					table.setModel(model_tmp);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void tabloCiz2() {
		DefaultTableModel model_tmp = new DefaultTableModel();
		Object[] sutunlar_tmp = {"ID","Sanatçı_adı","Ülkesi"};
		Object[] satirlar_tmp = new Object[3];
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From sanatçı");
			
			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("ID");
					satirlar_tmp[1] = myRs.getString("Sanatçı_adı");
					satirlar_tmp[2] = myRs.getString("Ülkesi");
					
					model_tmp.setColumnIdentifiers(sutunlar_tmp);
					model_tmp.addRow(satirlar_tmp);
					table_1.setModel(model_tmp);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//"SarkıID","Şarkı_Adı","tür","tarih","süre","dinlenme_sayısı","albüm"
	public void tabloCiz3() {
		DefaultTableModel model_tmp = new DefaultTableModel();
		Object[] sutunlar_tmp = {"SarkıID","Şarkı_Adı","tür","tarih","süre","dinlenme_sayısı","ülke","albüm"};
		Object[] satirlar_tmp = new Object[8];
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From şarki");
			
			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("tarih");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[6] = myRs.getString("ülke");
					satirlar_tmp[7] = myRs.getString("albüm");
					
					model_tmp.setColumnIdentifiers(sutunlar_tmp);
					model_tmp.addRow(satirlar_tmp);
					table_2.setModel(model_tmp);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void tabloCiz4() {
		DefaultTableModel model_tmp = new DefaultTableModel();
		Object[] sutunlar_tmp = {"sanatcı","sarkı"};
		Object[] satirlar_tmp = new Object[2];
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From şarkı_sanatçı");
			
			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("sanatcı");
					satirlar_tmp[1] = myRs.getString("sarkı");
					
					model_tmp.setColumnIdentifiers(sutunlar_tmp);
					model_tmp.addRow(satirlar_tmp);
					table_3.setModel(model_tmp);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void tabloCiz5() {
		DefaultTableModel model_tmp = new DefaultTableModel();
		Object[] sutunlar_tmp = {"kullanıcıId","kullanıcı_adı","email","şifre","abonelik_türü","ülke","ödendi"};
		Object[] satirlar_tmp = new Object[7];
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From kullanıcı");
			
			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("kullanıcıId");
					satirlar_tmp[1] = myRs.getString("kullanıcı_adı");
					satirlar_tmp[2] = myRs.getString("email");
					satirlar_tmp[3] = myRs.getString("şifre");
					satirlar_tmp[4] = myRs.getString("abonelik_türü");
					satirlar_tmp[5] = myRs.getString("ülke");
					satirlar_tmp[6] = myRs.getString("ödendi");
					
					model_tmp.setColumnIdentifiers(sutunlar_tmp);
					model_tmp.addRow(satirlar_tmp);
					table_4.setModel(model_tmp);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void tabloCiz6() {
		DefaultTableModel model_tmp = new DefaultTableModel();
		Object[] sutunlar_tmp = {"kullanıcıId","kullanıcıId1"};
		Object[] satirlar_tmp = new Object[2];
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From kul_kul");
			
			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("kullanıcıId");
					satirlar_tmp[1] = myRs.getString("kullanıcıId1");
					
					model_tmp.setColumnIdentifiers(sutunlar_tmp);
					model_tmp.addRow(satirlar_tmp);
					table_5.setModel(model_tmp);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Ekran() {
		
		model1.setColumnIdentifiers(kolonlar1);
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From album");
			
			try {
				
				while(myRs.next()) {
					satirlar1[0] = myRs.getString("albumId");
					satirlar1[1] = myRs.getString("album_adı");
					satirlar1[2] = myRs.getString("tarih");
					satirlar1[3] = myRs.getString("tür");
					
					model1.addRow(satirlar1);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model2.setColumnIdentifiers(kolonlar2);
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From sanatçı");
			
			try {
				
				while(myRs.next()) {
					satirlar2[0] = myRs.getString("ID");
					satirlar2[1] = myRs.getString("Sanatçı_adı");
					satirlar2[2] = myRs.getString("Ülkesi");
					
					model2.addRow(satirlar2);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		model3.setColumnIdentifiers(kolonlar3);
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From şarki");
			
			try {
				
				while(myRs.next()) {
					satirlar3[0] = myRs.getString("SarkıID");
					satirlar3[1] = myRs.getString("Şarkı_Adı");
					satirlar3[2] = myRs.getString("tür");
					satirlar3[3] = myRs.getString("tarih");
					satirlar3[4] = myRs.getString("süre");
					satirlar3[5] = myRs.getString("dinlenme_sayısı");
					satirlar3[6] = myRs.getString("ülke");
					satirlar3[7] = myRs.getString("albüm");
					
					model3.addRow(satirlar3);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model4.setColumnIdentifiers(kolonlar4);
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From şarkı_sanatçı");
			
			try {
				
				while(myRs.next()) {
					satirlar4[0] = myRs.getString("sanatcı");
					satirlar4[1] = myRs.getString("sarkı");
					
					model4.addRow(satirlar4);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model5.setColumnIdentifiers(kolonlar5);
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From kullanıcı");
			
			try {
				//"kullanıcıId","kullanıcı_adı","email","şifre","abonelik_türü","ülke"
				while(myRs.next()) {
					satirlar5[0] = myRs.getString("kullanıcıId");
					satirlar5[1] = myRs.getString("kullanıcı_adı");
					satirlar5[2] = myRs.getString("email");
					satirlar5[3] = myRs.getString("şifre");
					satirlar5[4] = myRs.getString("abonelik_türü");
					satirlar5[5] = myRs.getString("ülke");
					satirlar5[6] = myRs.getString("ödendi");
					
					model5.addRow(satirlar5);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model6.setColumnIdentifiers(kolonlar6);
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From kul_kul");
			
			try {
				
				while(myRs.next()) {
					satirlar6[0] = myRs.getString("kullanıcıId");
					satirlar6[1] = myRs.getString("kullanıcıId1");
					
					model6.addRow(satirlar6);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1920, 1080);
		contentPane.add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("ALBÜMLER", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 10, 750, 810);
		table.setModel(model1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 750, 810);
		panel.add(scrollPane);
		scrollPane.setViewportView(table);
		
		txt_id = new JTextField();
		txt_id.setBounds(1015, 116, 130, 35);
		panel.add(txt_id);
		txt_id.setColumns(10);
		
		txt_ad = new JTextField();
		txt_ad.setColumns(10);
		txt_ad.setBounds(1015, 194, 130, 35);
		panel.add(txt_ad);
		
		txt_tarih = new JTextField();
		txt_tarih.setColumns(10);
		txt_tarih.setBounds(1015, 268, 130, 35);
		panel.add(txt_tarih);
		
		txt_tur = new JTextField();
		txt_tur.setColumns(10);
		txt_tur.setBounds(1015, 352, 130, 35);
		panel.add(txt_tur);
		
		JLabel lbl_id = new JLabel("AlbumId :");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_id.setBounds(926, 125, 79, 13);
		panel.add(lbl_id);
		
		JLabel lbl_ad = new JLabel("Album adı :");
		lbl_ad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_ad.setBounds(913, 204, 92, 13);
		panel.add(lbl_ad);
		
		JLabel lbl_tarih = new JLabel("Tarih :");
		lbl_tarih.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_tarih.setBounds(950, 278, 55, 13);
		panel.add(lbl_tarih);
		
		JLabel lbl_tur = new JLabel("Tür :");
		lbl_tur.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_tur.setBounds(959, 363, 46, 13);
		panel.add(lbl_tur);
		
		JButton btn_ekle = new JButton("EKLE");
		btn_ekle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btn_ekle.setBounds(1015, 433, 130, 35);
		panel.add(btn_ekle);
		
		JButton btn_guncelle = new JButton("GÜNCELLE");
		btn_guncelle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btn_guncelle.setBounds(1015, 494, 130, 35);
		panel.add(btn_guncelle);
		
		JButton btn_sil = new JButton("SİL");
		btn_sil.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btn_sil.setBounds(1015, 555, 130, 35);
		panel.add(btn_sil);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_id.setText((String) model1.getValueAt(table.getSelectedRow() , 0));
				txt_ad.setText((String) model1.getValueAt(table.getSelectedRow() , 1));
				txt_tarih.setText((String) model1.getValueAt(table.getSelectedRow() , 2));
				txt_tur.setText((String) model1.getValueAt(table.getSelectedRow() , 3));
			}
		});
		
		
		btn_guncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String ad = txt_ad.getText();
				String tarih = txt_tarih.getText();
				String tur = txt_tur.getText();
				String kod = "UPDATE album SET albumId = " + id + ", album_adı = '" + ad + "', tarih = '" +tarih+"' ,tür = '" + tur +"' Where albumId = " + id;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz();
			}
		});
		
		
		btn_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String ad = txt_ad.getText();
				String tarih = txt_tarih.getText();
				String tur = txt_tur.getText();
				String kod = "INSERT INTO album (albumId,album_adı,tarih,tür) Values ("+ id + ",'" + ad + "'" + ",'" + tarih + "'," + "'" + tur + "')";
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
							
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz();
			}
		});
		
		btn_sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String kod = "DELETE From album Where albumId =" + id;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz();
			}
		});
		
		panel_1 = new JPanel();
		tabbedPane.addTab("SANATÇILAR", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 750, 810);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setBounds(861, 287, 84, 143);
		table_1.setModel(model2);
		scrollPane_1.setViewportView(table_1);
		
		txt1_id = new JTextField();
		txt1_id.setBounds(1015, 116, 130, 35);
		panel_1.add(txt1_id);
		txt1_id.setColumns(10);
		
		txt1_ad = new JTextField();
		txt1_ad.setBounds(1015, 194, 130, 35);
		panel_1.add(txt1_ad);
		txt1_ad.setColumns(10);
		
		txt1_ulke = new JTextField();
		txt1_ulke.setBounds(1015, 268, 130, 35);
		panel_1.add(txt1_ulke);
		txt1_ulke.setColumns(10);
		
		JLabel lbl1_id = new JLabel("ID :");
		lbl1_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1_id.setBounds(969, 125, 36, 13);
		panel_1.add(lbl1_id);
		
		JLabel lbl1_ad = new JLabel("Sanatçı adı :");
		lbl1_ad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1_ad.setBounds(915, 204, 90, 13);
		panel_1.add(lbl1_ad);
		
		JLabel lbl1_ulke = new JLabel("Ülkesi :");
		lbl1_ulke.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1_ulke.setBounds(947, 272, 60, 22);
		panel_1.add(lbl1_ulke);
		
		JButton btn1_ekle = new JButton("EKLE");
		btn1_ekle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn1_ekle.setBounds(1015, 341, 130, 35);
		panel_1.add(btn1_ekle);
		
		JButton btn1_guncelle = new JButton("GÜNCELLE");
		btn1_guncelle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn1_guncelle.setBounds(1015, 403, 130, 35);
		panel_1.add(btn1_guncelle);
		
		JButton btn1_sil = new JButton("SİL");
		btn1_sil.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn1_sil.setBounds(1015, 463, 130, 35);
		panel_1.add(btn1_sil);
		
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt1_id.setText((String) model2.getValueAt(table_1.getSelectedRow() , 0));
				txt1_ad.setText((String) model2.getValueAt(table_1.getSelectedRow() , 1));
				txt1_ulke.setText((String) model2.getValueAt(table_1.getSelectedRow() , 2));
			}
		});
		
		btn1_guncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt1_id.getText();
				String ad = txt1_ad.getText();
				String ulke = txt1_ulke.getText();
				String kod = "UPDATE sanatçı SET ID = " + id + ", Sanatçı_adı = '" + ad + "', Ülkesi = '" +ulke+"' Where ID = " + id;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz2();
			}
		});
		
		btn1_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt1_id.getText();
				String ad = txt1_ad.getText();
				String ulke = txt1_ulke.getText();
				String kod = "INSERT INTO sanatçı (ID,Sanatçı_adı,Ülkesi) Values ("+ id + ",'" + ad + "'" + ",'" + ulke + "')";
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
							
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz2();
			}
		});
		
		btn1_sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt1_id.getText();
				String kod = "DELETE From sanatçı Where ID = " + id;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz2();
			}
		});
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("ŞARKI-SANATÇI", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(145, 85, 400, 600);
		panel_3.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setBounds(664, 179, 107, 116);
		table_3.setModel(model4);
		scrollPane_3.setViewportView(table_3);
		
		txt3_sanatci = new JTextField();
		txt3_sanatci.setBounds(857, 195, 130, 35);
		panel_3.add(txt3_sanatci);
		txt3_sanatci.setColumns(10);
		
		txt3_sarki = new JTextField();
		txt3_sarki.setColumns(10);
		txt3_sarki.setBounds(857, 273, 130, 35);
		panel_3.add(txt3_sarki);
		
		JLabel lblNewLabel = new JLabel("Sanatçı id:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(772, 204, 75, 13);
		panel_3.add(lblNewLabel);
		
		JLabel lblarkId = new JLabel("Şarkı id:");
		lblarkId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblarkId.setBounds(789, 284, 58, 13);
		panel_3.add(lblarkId);
		
		JButton btn3_ekle = new JButton("EKLE");
		btn3_ekle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn3_ekle.setBounds(857, 354, 130, 35);
		panel_3.add(btn3_ekle);
		
		JButton btn3_guncelle = new JButton("GÜNCELLE");
		btn3_guncelle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn3_guncelle.setBounds(857, 413, 130, 35);
		panel_3.add(btn3_guncelle);
		
		JButton btn3_sil = new JButton("SİL");
		btn3_sil.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn3_sil.setBounds(857, 468, 130, 35);
		panel_3.add(btn3_sil);
		
		
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tmp = (String) model4.getValueAt(table_3.getSelectedRow() , 0);
				tmp2 = (String) model4.getValueAt(table_3.getSelectedRow() , 1);
				
				
				txt3_sanatci.setText(tmp);
				txt3_sarki.setText(tmp2);
				
			}
		});
		
		btn3_guncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt3_sanatci.getText();
				String ad = txt3_sarki.getText();
				
				String kod = "UPDATE şarkı_sanatçı SET sanatcı = " + id + ", sarkı = " + ad + " Where sanatcı = " + tmp +" and sarkı = " + tmp2;
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz4();
			}
				
		});
		
		btn3_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sanatci = txt3_sanatci.getText();
				String sarki = txt3_sarki.getText();
				String kod = "INSERT INTO şarkı_sanatçı (sanatcı,sarkı) Values ("+ sanatci +","+ sarki +")";
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
							
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz4();
			}
			
		});
		
		btn3_sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt3_sanatci.getText();
				String id2 = txt3_sarki.getText();
				String kod = "DELETE From şarkı_sanatçı Where sanatcı = " + id + " and sarkı = "+id2;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz4();
			}
		});
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("KULLANICILAR", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(340, 91, 544, 619);
		panel_4.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setBounds(1114, 226, 90, 163);
		table_4.setModel(model5);
		scrollPane_4.setViewportView(table_4);
		
		txt4_id = new JTextField();
		txt4_id.setBounds(1156, 130, 160, 40);
		panel_4.add(txt4_id);
		txt4_id.setColumns(10);
		
		txt4_ad = new JTextField();
		txt4_ad.setColumns(10);
		txt4_ad.setBounds(1156, 197, 160, 40);
		panel_4.add(txt4_ad);
		
		txt4_email = new JTextField();
		txt4_email.setColumns(10);
		txt4_email.setBounds(1156, 258, 160, 40);
		panel_4.add(txt4_email);
		
		txt4_sifre = new JTextField();
		txt4_sifre.setColumns(10);
		txt4_sifre.setBounds(1156, 325, 160, 40);
		panel_4.add(txt4_sifre);
		
		txt4_tur = new JTextField();
		txt4_tur.setColumns(10);
		txt4_tur.setBounds(1156, 389, 160, 40);
		panel_4.add(txt4_tur);
		
		txt4_ulke = new JTextField();
		txt4_ulke.setColumns(10);
		txt4_ulke.setBounds(1156, 449, 160, 40);
		panel_4.add(txt4_ulke);
		
		JLabel lbl4_id = new JLabel("Kullanıcı ID :");
		lbl4_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl4_id.setBounds(1055, 141, 91, 13);
		panel_4.add(lbl4_id);
		
		JLabel lblNewLabel_2_1 = new JLabel("Kullanıcı Adı :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(1043, 210, 103, 13);
		panel_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email :");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(1096, 271, 50, 13);
		panel_4.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Şifre :");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(1096, 338, 50, 13);
		panel_4.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Abonelik Türü :");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_4.setBounds(1030, 402, 116, 13);
		panel_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Ülke :");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_5.setBounds(1104, 449, 42, 26);
		panel_4.add(lblNewLabel_2_5);
		
		txt4_odendi = new JTextField();
		txt4_odendi.setColumns(10);
		txt4_odendi.setBounds(1156, 512, 160, 40);
		panel_4.add(txt4_odendi);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Ödendi :");
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_5_1.setBounds(1085, 520, 61, 18);
		panel_4.add(lblNewLabel_2_5_1);
		
		JButton btn4_ekle = new JButton("EKLE");
		btn4_ekle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn4_ekle.setBounds(1343, 259, 122, 36);
		panel_4.add(btn4_ekle);
		
		JButton btn4_guncelle = new JButton("GÜNCELLE");
		btn4_guncelle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn4_guncelle.setBounds(1343, 325, 122, 36);
		panel_4.add(btn4_guncelle);
		
		JButton btn4_sil = new JButton("SİL");
		btn4_sil.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn4_sil.setBounds(1343, 389, 122, 36);
		panel_4.add(btn4_sil);
		
		table_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt4_id.setText((String) model5.getValueAt(table_4.getSelectedRow() , 0));
				txt4_ad.setText((String) model5.getValueAt(table_4.getSelectedRow() , 1));
				txt4_email.setText((String) model5.getValueAt(table_4.getSelectedRow() , 2));
				txt4_sifre.setText((String) model5.getValueAt(table_4.getSelectedRow() , 3));
				txt4_tur.setText((String) model5.getValueAt(table_4.getSelectedRow() , 4));
				txt4_ulke.setText((String) model5.getValueAt(table_4.getSelectedRow() , 5));
				txt4_odendi.setText((String) model5.getValueAt(table_4.getSelectedRow() , 6));
			}
		});
		
		btn4_guncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt4_id.getText();
				String ad = txt4_ad.getText();
				String email = txt4_email.getText();
				String sifre = txt4_sifre.getText();
				String tur = txt4_tur.getText();
				String ulke = txt4_ulke.getText();
				String odendi = txt4_odendi.getText();
				
				//kullanıcıId,kullanıcı_adı,email,şifre,abonelik_türü,                                                                 ülke,ödendi
				String kod = "UPDATE kullanıcı SET kullanıcıId = " + id + ", kullanıcı_adı = '" + ad + "', email = '" +email+"', şifre = '"+sifre+"', abonelik_türü = '" + tur+ "', ülke = '" + ulke+ "', ödendi = "+odendi +" Where kullanıcıId = " + id;
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz5();
			}
		});
		
		btn4_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt4_id.getText();
				String ad = txt4_ad.getText();
				String email = txt4_email.getText();
				String sifre = txt4_sifre.getText();
				String tur = txt4_tur.getText();
				String ulke = txt4_ulke.getText();
				String odendi = txt4_odendi.getText();
				
				String kod = "INSERT INTO kullanıcı (kullanıcıId,kullanıcı_adı,email,şifre,abonelik_türü,ülke,ödendi) Values ("+ id +",'"+ ad +"','" + email + "','"+ sifre +"','" + tur +"','" + ulke +"'," + odendi + ")";                    
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
							
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz5();
				
			}
		});
		
		btn4_sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt4_id.getText();
				String kod = "DELETE From kullanıcı Where kullanıcıId = " + id;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz5();
			}
		});
		
		panel_2 = new JPanel();
		tabbedPane.addTab("ŞARKILAR", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 10, 750, 810);
		panel_2.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setBounds(784, 113, 77, 100);
		table_2.setModel(model3);
		scrollPane_2.setViewportView(table_2);
		
		txt2_id = new JTextField();
		txt2_id.setColumns(10);
		txt2_id.setBounds(1020, 114, 130, 35);
		panel_2.add(txt2_id);
		
		txt2_ad = new JTextField();
		txt2_ad.setColumns(10);
		txt2_ad.setBounds(1020, 185, 130, 35);
		panel_2.add(txt2_ad);
		
		txt2_tur = new JTextField();
		txt2_tur.setColumns(10);
		txt2_tur.setBounds(1020, 260, 130, 35);
		panel_2.add(txt2_tur);
		
		txt2_tarih = new JTextField();
		txt2_tarih.setColumns(10);
		txt2_tarih.setBounds(1020, 334, 130, 35);
		panel_2.add(txt2_tarih);
		
		txt2_sure = new JTextField();
		txt2_sure.setColumns(10);
		txt2_sure.setBounds(1020, 414, 130, 35);
		panel_2.add(txt2_sure);
		
		txt2_dinlenme = new JTextField();
		txt2_dinlenme.setColumns(10);
		txt2_dinlenme.setBounds(1020, 495, 130, 35);
		panel_2.add(txt2_dinlenme);
		
		txt2_ulke = new JTextField();
		txt2_ulke.setColumns(10);
		txt2_ulke.setBounds(1020, 570, 130, 35);
		panel_2.add(txt2_ulke);
		
		JButton btn2_ekle = new JButton("EKLE");
		btn2_ekle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn2_ekle.setBounds(1254, 260, 130, 35);
		panel_2.add(btn2_ekle);
		
		JButton btn2_guncelle = new JButton("GÜNCELLE");
		btn2_guncelle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn2_guncelle.setBounds(1254, 341, 130, 35);
		panel_2.add(btn2_guncelle);
		
		JButton btn2_sil = new JButton("SİL");
		btn2_sil.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn2_sil.setBounds(1254, 421, 130, 35);
		panel_2.add(btn2_sil);
		
		JLabel lbl2_id = new JLabel("Şarkı ID :");
		lbl2_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2_id.setBounds(937, 123, 73, 13);
		panel_2.add(lbl2_id);
		
		JLabel lbl2_ad = new JLabel("Şarkı adı :");
		lbl2_ad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2_ad.setBounds(937, 196, 73, 13);
		panel_2.add(lbl2_ad);
		
		JLabel lbl2_tur = new JLabel("Tür :");
		lbl2_tur.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2_tur.setBounds(976, 271, 34, 13);
		panel_2.add(lbl2_tur);
		
		JLabel lbl2_tarih = new JLabel("Tarih :");
		lbl2_tarih.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2_tarih.setBounds(963, 345, 47, 13);
		panel_2.add(lbl2_tarih);
		
		JLabel lbl2_sure = new JLabel("Süre :");
		lbl2_sure.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2_sure.setBounds(968, 425, 42, 13);
		panel_2.add(lbl2_sure);
		
		JLabel lbl2_dinlenme = new JLabel("Dinlenme sayısı :");
		lbl2_dinlenme.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2_dinlenme.setBounds(888, 506, 122, 13);
		panel_2.add(lbl2_dinlenme);
		
		JLabel lbl2_album = new JLabel("Ülke :");
		lbl2_album.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2_album.setBounds(955, 573, 55, 24);
		panel_2.add(lbl2_album);
		
		JLabel lblNewLabel_1 = new JLabel("");////
		lblNewLabel_1.setForeground(Color.RED);/////
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(1021, 697, 185, 13);
		panel_2.add(lblNewLabel_1);
		
		txt2_album = new JTextField();
		txt2_album.setColumns(10);
		txt2_album.setBounds(1020, 640, 130, 35);
		panel_2.add(txt2_album);
		
		JLabel lbl2_album_1 = new JLabel("Albüm :");
		lbl2_album_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2_album_1.setBounds(955, 649, 55, 13);
		panel_2.add(lbl2_album_1);
		
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt2_id.setText((String) model3.getValueAt(table_2.getSelectedRow() , 0));
				txt2_ad.setText((String) model3.getValueAt(table_2.getSelectedRow() , 1));
				txt2_tur.setText((String) model3.getValueAt(table_2.getSelectedRow() , 2));
				txt2_tarih.setText((String) model3.getValueAt(table_2.getSelectedRow() , 3));
				txt2_sure.setText((String) model3.getValueAt(table_2.getSelectedRow() , 4));
				txt2_dinlenme.setText((String) model3.getValueAt(table_2.getSelectedRow() , 5));
				txt2_ulke.setText((String) model3.getValueAt(table_2.getSelectedRow() , 6));
				txt2_album.setText((String) model3.getValueAt(table_2.getSelectedRow() , 7));
			}
		});
		//////////////////////////////////////////Buradan/////////////////////////
		btn2_guncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String album = txt2_album.getText();
				String tur = txt2_tur.getText();
				String albumtur = "";
				
				String kod2 = "SELECT tür FROM album Where albumId = "+album;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					ResultSet myRs = myStat.executeQuery(kod2);
					
					while(myRs.next()) {
						albumtur = myRs.getString("tür");
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				if(albumtur.equals(tur)) {
					String id = txt2_id.getText();
					String ad = txt2_ad.getText();
					String tarih = txt2_tarih.getText();
					String sure = txt2_sure.getText();
					String dinlenme = txt2_dinlenme.getText();
					String ülke = txt2_ulke.getText();
					
					String kod = "UPDATE şarki SET SarkıID = " + id + ", Şarkı_adı = '" + ad + "', tür = '"+tur +"', tarih = '"+ tarih +"', süre = " +  sure +",dinlenme_sayısı = "+ dinlenme +",ülke = '"+ülke +"',albüm = "+ album + " Where SarkıID = " + id;
					System.out.println(kod);
					
					try {
						Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
						Statement myStat = myConn.createStatement();
						myStat.executeUpdate(kod);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
					tabloCiz3();
				}
				else {
					lblNewLabel_1.setText("Albümle şarkı farklı türde.");//////
				}
			}
		});
		////////////////////////////Buraya KADAR ////////////////////////////DEĞİŞTİRİLDİ
		
		//////////////////////////////Ayrıca BURADAN /////////////////////////////
		btn2_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String album = txt2_album.getText();
				String tur = txt2_tur.getText();
				String albumtur = "";
				
				String kod2 = "SELECT tür FROM album Where albumId = "+album;
				
				if(album!=null) {
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					ResultSet myRs = myStat.executeQuery(kod2);
					
					while(myRs.next()) {
						albumtur = myRs.getString("tür");
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				}
				
				if(albumtur.equals(tur) || album == null) {
				String id = txt2_id.getText();
				String ad = txt2_ad.getText();
				String tarih = txt2_tarih.getText();
				String sure = txt2_sure.getText();
				String dinlenme = txt2_dinlenme.getText();
				String ülke = txt2_ulke.getText();
				String kod = "INSERT INTO şarki (SarkıID,Şarkı_Adı,tür,tarih,süre,dinlenme_sayısı,ülke,albüm) Values ("+ id + ",'" + ad + "'" + ",'" + tur + "'" + ",'" + tarih + "'" + ","+ sure + "," + dinlenme + ",'" +ülke+"'," +album + ")";
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
							
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz3();
				}
				
				else{
					lblNewLabel_1.setText("Albümle şarkı farklı türde.");//////
				}
			}
		});
		/////////////////////BURAYA KADAR /////////////////// GÜNCELLENDİ////////////////////////
		
		btn2_sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt2_id.getText();
				String kod = "DELETE From şarki Where SarkıID = " + id;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz3();
			}
		});
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("KUL_KUL", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(420, 170, 466, 454);
		panel_5.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setBounds(189, 350, 86, 142);
		table_5.setModel(model6);
		scrollPane_5.setViewportView(table_5);
		
		txt5_id = new JTextField();
		txt5_id.setBounds(1169, 242, 135, 31);
		panel_5.add(txt5_id);
		txt5_id.setColumns(10);
		
		txt5_id1 = new JTextField();
		txt5_id1.setColumns(10);
		txt5_id1.setBounds(1169, 307, 135, 31);
		panel_5.add(txt5_id1);
		
		JLabel lblNewLabel_2 = new JLabel("Kullanıcı ID :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(1078, 249, 81, 13);
		panel_5.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_6 = new JLabel("Takip edilen ID :");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_6.setBounds(1053, 316, 106, 13);
		panel_5.add(lblNewLabel_2_6);
		
		JButton btn5_ekle = new JButton("EKLE");
		btn5_ekle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn5_ekle.setBounds(1169, 372, 135, 31);
		panel_5.add(btn5_ekle);
		
		JButton btn5_güncelle = new JButton("GÜNCELLE");
		btn5_güncelle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn5_güncelle.setBounds(1169, 428, 135, 31);
		panel_5.add(btn5_güncelle);
		
		JButton btn5_sil = new JButton("SİL");
		btn5_sil.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btn5_sil.setBounds(1169, 480, 135, 31);
		panel_5.add(btn5_sil);
		
		table_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tmp3 = (String) model6.getValueAt(table_5.getSelectedRow() , 0);
				tmp4 = (String) model6.getValueAt(table_5.getSelectedRow() , 1);
				
				
				txt5_id.setText(tmp3);
				txt5_id1.setText(tmp4);
				
			}
		});
		
		btn5_güncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt5_id.getText();
				String id1 = txt5_id1.getText();
				
				String kod = "UPDATE kul_kul SET kullanıcıId = " + id + ", kullanıcıId1 = " + id1 + " Where kullanıcıId = " + tmp3 +" and kullanıcıId1 = " + tmp4;
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz6();
			}
		});
		
		btn5_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt5_id.getText();
				String id1 = txt5_id1.getText();
				String kod = "INSERT INTO kul_kul (kullanıcıId,kullanıcıId1) Values ("+ id +","+ id1 +")";
				System.out.println(kod);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
							
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz6();
			}
		});
		
		btn5_sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt5_id.getText();
				String id2 = txt5_id1.getText();
				String kod = "DELETE From kul_kul Where kullanıcıId = " + id + " and kullanıcıId1 = "+id2;
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(kod);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				tabloCiz6();
			}
		});
		
	}
}
