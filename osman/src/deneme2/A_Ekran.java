package deneme2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//import com.sun.org.apache.xpath.internal.operations.And;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class A_Ekran extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_1;
	DefaultTableModel model = new DefaultTableModel();
	DefaultTableModel model2 = new DefaultTableModel();
	DefaultTableModel model3 = new DefaultTableModel();
	DefaultTableModel model4 = new DefaultTableModel();
	DefaultTableModel model5 = new DefaultTableModel();
	DefaultTableModel model6 = new DefaultTableModel();
	DefaultTableModel model7 = new DefaultTableModel();
	DefaultTableModel model8 = new DefaultTableModel();
	DefaultTableModel model9 = new DefaultTableModel();
	DefaultTableModel model10 = new DefaultTableModel();
	DefaultTableModel model11 = new DefaultTableModel();
	DefaultTableModel model12 = new DefaultTableModel();
	DefaultTableModel model13 = new DefaultTableModel();
	DefaultTableModel model14 = new DefaultTableModel();
	DefaultTableModel model15 = new DefaultTableModel();
	

	Object[] sutunlar = {"SarkıID","Şarkı_Adı","tür","dinlenme_sayısı","süre","tarih","ülke"};
	Object[] satirlar = new Object[7];
	Object[] sutunlar2 = {"kullanıcıId","kullanıcı_adı","abonelik_türü","ödendi"};
	Object[] satirlar2 = new Object[4];
	
	Object[] sutunlar3 = {"id","ülke"};
	Object[] satirlar3 = new Object[2];
	
	Object[] sutunlar4 = {"albumId","album_adı","tarih","tür"};
	Object[] satirlar4 = new Object[4];
	
	
	
	int kisi=1; 
	int sarkı1=1; 
	int sarkı2=1; 
	int sarkı3=1; 
	String yazı;
	
	static int ID;//
	private JTable table_8;
	private JTable table_9;
	private JTable table_10;
	private JTable table_11;
	private JTable table_12;
	private JTable table_13;
	private JTable table_14;
	private JTable table_15;
	private JTable table_16;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A_Ekran frame = new A_Ekran(ID);
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
	
	
	
	
	
	
public void cizdir() {
		
		DefaultTableModel modelx = new DefaultTableModel();
		DefaultTableModel modelx2 = new DefaultTableModel();
		DefaultTableModel modelx3 = new DefaultTableModel();
		
		
		Object[] sutunlar_tmp = {"SarkıID","Şarkı_Adı","tür","dinlenme_sayısı","süre","tarih","ülke"};
		Object[] satirlar_tmp = new Object[7];
		modelx.setColumnIdentifiers(sutunlar);
		modelx2.setColumnIdentifiers(sutunlar);
		modelx3.setColumnIdentifiers(sutunlar);
		
try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From şarki,çalma_listesi as çal where tür='POP' and kullanıcı="+ID+" and SarkıID=şarkı ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					modelx.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From şarki,çalma_listesi as çal where tür='JAZZ' and kullanıcı="+ID+" and SarkıID=şarkı ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					modelx2.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


try {
	
	Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
	Statement myStat = (Statement) myConn.createStatement();
	ResultSet myRs = myStat.executeQuery("Select * From şarki,çalma_listesi as çal where tür='KLASİK' and kullanıcı="+ID+" and SarkıID=şarkı ");

	try {
		
		while(myRs.next()) {
			satirlar_tmp[0] = myRs.getString("SarkıID");
			satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
			satirlar_tmp[2] = myRs.getString("tür");
			satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
			satirlar_tmp[4] = myRs.getString("süre");
			satirlar_tmp[5] = myRs.getString("tarih");
			satirlar_tmp[6] = myRs.getString("ülke");

			modelx3.addRow(satirlar_tmp);

		}
		
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
} catch (Exception e) {
	e.printStackTrace();
}
		
		
		
table.setModel(modelx);
table_2.setModel(modelx2);		
table_3.setModel(modelx3);		
		
	}
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
public void cizdir2(String kisi) {
		

	
	DefaultTableModel modely = new DefaultTableModel();
	DefaultTableModel modely2 = new DefaultTableModel();
	DefaultTableModel modely3 = new DefaultTableModel();
	
	
	Object[] sutunlar_tmp = {"SarkıID","Şarkı_Adı","tür","dinlenme_sayısı","süre","tarih","ülke"};
	Object[] satirlar_tmp = new Object[7];
	
	modely.setColumnIdentifiers(sutunlar);
	modely2.setColumnIdentifiers(sutunlar);
	modely3.setColumnIdentifiers(sutunlar);
	
	
	
	
	try {
		
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		
		//myStat.executeQuery("set @sayı=kisi;");
		ResultSet myRs = myStat.executeQuery("Select  * From şarki,çalma_listesi as çal where tür='POP' and kullanıcı="+kisi+" and SarkıID=şarkı ");
		System.out.println("->"+kisi);
		try {
			
			while(myRs.next()) {
				satirlar_tmp[0] = myRs.getString("SarkıID");
				satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
				satirlar_tmp[2] = myRs.getString("tür");
				satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
				satirlar_tmp[4] = myRs.getString("süre");
				satirlar_tmp[5] = myRs.getString("tarih");
				satirlar_tmp[6] = myRs.getString("ülke");

				modely.addRow(satirlar_tmp);

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
try {
		
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("Select * From şarki,çalma_listesi as çal where tür='JAZZ' and kullanıcı="+kisi+" and SarkıID=şarkı ");

		try {
			
			while(myRs.next()) {
				satirlar_tmp[0] = myRs.getString("SarkıID");
				satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
				satirlar_tmp[2] = myRs.getString("tür");
				satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
				satirlar_tmp[4] = myRs.getString("süre");
				satirlar_tmp[5] = myRs.getString("tarih");
				satirlar_tmp[6] = myRs.getString("ülke");

				modely2.addRow(satirlar_tmp);

			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}


try {

Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
Statement myStat = (Statement) myConn.createStatement();
ResultSet myRs = myStat.executeQuery("Select * From şarki,çalma_listesi as çal where tür='KLASİK' and kullanıcı="+kisi+" and SarkıID=şarkı ");

try {
	
	while(myRs.next()) {
		satirlar_tmp[0] = myRs.getString("SarkıID");
		satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
		satirlar_tmp[2] = myRs.getString("tür");
		satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
		satirlar_tmp[4] = myRs.getString("süre");
		satirlar_tmp[5] = myRs.getString("tarih");
		satirlar_tmp[6] = myRs.getString("ülke");
		
		modely3.addRow(satirlar_tmp);

	}
	
	
	
	
} catch (Exception e) {
	e.printStackTrace();
}

} catch (Exception e) {
e.printStackTrace();
}
		
table_4.setModel(modely);
table_5.setModel(modely2);		
table_6.setModel(modely3);		
		
	}
	

	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
public void cizdir3(String ulke){
	DefaultTableModel modelz = new DefaultTableModel();
	
	Object[] sutunlar_tmp = {"SarkıID","Şarkı_Adı","tür","dinlenme_sayısı","süre","tarih","ülke"};
	Object[] satirlar_tmp = new Object[7];
	
	modelz.setColumnIdentifiers(sutunlar);
	System.out.println(ulke+"+++zsssssssssszzzzzzzz");
try {
		
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("Select * From şarki  where ülke='"+ulke+"' ORDER BY dinlenme_sayısı DESC LIMIT 0, 10 ");

		try {
			
			while(myRs.next()) {
				satirlar_tmp[0] = myRs.getString("SarkıID");
				satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
				satirlar_tmp[2] = myRs.getString("tür");
				satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
				satirlar_tmp[4] = myRs.getString("süre");
				satirlar_tmp[5] = myRs.getString("tarih");
				satirlar_tmp[6] = myRs.getString("ülke");

				modelz.addRow(satirlar_tmp);

			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
table_12.setModel(modelz);		
	
}



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public void cizdir4(String albüm){
	
DefaultTableModel modela = new DefaultTableModel();
	
	Object[] sutunlar_tmp = {"SarkıID","Şarkı_Adı","tür","dinlenme_sayısı","süre","tarih","ülke"};
	Object[] satirlar_tmp = new Object[7];
	
	modela.setColumnIdentifiers(sutunlar);

try {
		
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("Select * From şarki where albüm="+albüm+"  ");

		try {
			
			while(myRs.next()) {
				satirlar_tmp[0] = myRs.getString("SarkıID");
				satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
				satirlar_tmp[2] = myRs.getString("tür");
				satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
				satirlar_tmp[4] = myRs.getString("süre");
				satirlar_tmp[5] = myRs.getString("tarih");
				satirlar_tmp[6] = myRs.getString("ülke");

				modela.addRow(satirlar_tmp);

			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
table_14.setModel(modela);		
	
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public void cizdir5(String takip){

	DefaultTableModel modelb = new DefaultTableModel();
	
	Object[] sutunlar_tmp = {"kullanıcıId","kullanıcı_adı","abonelik_türü","ödendi"};
	Object[] satirlar_tmp = new Object[4];
	

	modelb.setColumnIdentifiers(sutunlar2);

	
	try {
		
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("Select  * From kullanıcı,kul_kul where kul_kul.kullanıcıId="+ID+" and kullanıcıId1=kullanıcı.kullanıcıId ");

		try {
			
			while(myRs.next()) {
				satirlar_tmp[0] = myRs.getString("kullanıcıId");
				satirlar_tmp[1] = myRs.getString("kullanıcı_adı");
				satirlar_tmp[2] = myRs.getString("abonelik_türü");
				satirlar_tmp[3] = myRs.getString("ödendi");
				
				modelb.addRow(satirlar_tmp);

			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	table_15.setModel(modelb);	
	table_16.setModel(modelb);	
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public void güncelle() {
	DefaultTableModel modelk = new DefaultTableModel();
	DefaultTableModel modelk2 = new DefaultTableModel();
	DefaultTableModel modelk3 = new DefaultTableModel();
	
	
	Object[] sutunlar_tmp = {"SarkıID","Şarkı_Adı","tür","dinlenme_sayısı","süre","tarih","ülke"};
	Object[] satirlar_tmp = new Object[7];
	
	
	
	
	modelk.setColumnIdentifiers(sutunlar);
	try {
		
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("Select  * From şarki where tür='POP' ORDER BY dinlenme_sayısı DESC LIMIT 0, 10 ");

		try {
			
			while(myRs.next()) {
				satirlar_tmp[0] = myRs.getString("SarkıID");
				satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
				satirlar_tmp[2] = myRs.getString("tür");
				satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
				satirlar_tmp[4] = myRs.getString("süre");
				satirlar_tmp[5] = myRs.getString("tarih");
				satirlar_tmp[6] = myRs.getString("ülke");

				modelk.addRow(satirlar_tmp);

			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	modelk2.setColumnIdentifiers(sutunlar);
	try {
		
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("Select  * From şarki where tür='JAZZ' ORDER BY dinlenme_sayısı DESC LIMIT 0, 10  ");

		try {
			
			while(myRs.next()) {
				satirlar_tmp[0] = myRs.getString("SarkıID");
				satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
				satirlar_tmp[2] = myRs.getString("tür");
				satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
				satirlar_tmp[4] = myRs.getString("süre");
				satirlar_tmp[5] = myRs.getString("tarih");
				satirlar_tmp[6] = myRs.getString("ülke");

				modelk2.addRow(satirlar_tmp);

			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	modelk3.setColumnIdentifiers(sutunlar);
	try {
		
		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("Select  * From şarki where tür='KLASİK' ORDER BY dinlenme_sayısı DESC LIMIT 0, 10  ");

		try {
			
			while(myRs.next()) {
				satirlar_tmp[0] = myRs.getString("SarkıID");
				satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
				satirlar_tmp[2] = myRs.getString("tür");
				satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
				satirlar_tmp[4] = myRs.getString("süre");
				satirlar_tmp[5] = myRs.getString("tarih");
				satirlar_tmp[6] = myRs.getString("ülke");

				modelk3.addRow(satirlar_tmp);

			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	table_8.setModel(modelk);	
	table_9.setModel(modelk2);
	table_10.setModel(modelk3);
	
	cizdir3("0");
}



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	
public void eklemeyap(String sarkı1) {
	
	String Id=String.valueOf(ID); 

	String Kullanıcı=Id;
	String şarkı=sarkı1;
	
	String kod = "INSERT INTO çalma_listesi (Kullanıcı,şarkı) Values ("+ Kullanıcı + "," + şarkı +")";
	System.out.println(kod);
	
	try {
		
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = myConn.createStatement();
		myStat.executeUpdate(kod);
				
	} catch (Exception e2) {
		e2.printStackTrace();
	}
	
	cizdir();
	
	
}
	

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public String pro() {
	
	try {

		Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = (Statement) myConn.createStatement();
		ResultSet myRs = myStat.executeQuery("Select abonelik_türü From kullanıcı where kullanıcıId="+ID+"  ");

		try {
			
			while(myRs.next()) {
				
				String sonuc = myRs.getString("abonelik_türü");
				return sonuc;
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		} catch (Exception e) {
		e.printStackTrace();
		}
	return "";
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public void eklemeyap2(String kişi) {
	
	String Id=String.valueOf(ID); 

	String Kullanıcı1=Id;
	String Kullanıcı2=kişi;
	
	String kod = "INSERT INTO kul_kul (kullanıcıId,kullanıcıId1) Values ("+ Kullanıcı1 + "," + Kullanıcı2 +")";
	System.out.println(kod);
	
	try {
		
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
		Statement myStat = myConn.createStatement();
		myStat.executeUpdate(kod);
				
	} catch (Exception e2) {
		e2.printStackTrace();
	}
	
	cizdir5(kişi);
	
	

}



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	
	public A_Ekran(int ID) {
		this.ID = ID;//
		
		System.out.println(this.ID);//
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1904, 1041);
		contentPane.add(tabbedPane);
		
		
		Object[] sutunlar_tmp = {"SarkıID","Şarkı_Adı","tür","dinlenme_sayısı","süre","tarih","ülke"};
		Object[] satirlar_tmp = new Object[7];
		Object[] satirlar_tmp2 = new Object[4];
		Object[] satirlar_tmp3 = new Object[2];
		Object[] satirlar_tmp4 = new Object[4];
		model.setColumnIdentifiers(sutunlar);
		model2.setColumnIdentifiers(sutunlar);
		model3.setColumnIdentifiers(sutunlar);
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From şarki,çalma_listesi as çal where tür='POP' and kullanıcı="+ID+" and SarkıID=şarkı ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					model.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From şarki,çalma_listesi as çal where tür='JAZZ' and kullanıcı="+ID+" and SarkıID=şarkı ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					model2.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


try {
	
	Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
	Statement myStat = (Statement) myConn.createStatement();
	ResultSet myRs = myStat.executeQuery("Select * From şarki,çalma_listesi as çal where tür='KLASİK' and kullanıcı="+ID+" and SarkıID=şarkı ");

	try {
		
		while(myRs.next()) {
			satirlar_tmp[0] = myRs.getString("SarkıID");
			satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
			satirlar_tmp[2] = myRs.getString("tür");
			satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
			satirlar_tmp[4] = myRs.getString("süre");
			satirlar_tmp[5] = myRs.getString("tarih");
			satirlar_tmp[6] = myRs.getString("ülke");

			model3.addRow(satirlar_tmp);

		}
		
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
} catch (Exception e) {
	e.printStackTrace();
}
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Ana Menü", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 277, 487, 655);
		panel.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(685, 277, 499, 655);
		panel.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(1305, 277, 499, 655);
		panel.add(scrollPane_2);
		
		A_Ekran a = this;
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row=table.rowAtPoint(e.getPoint());
				String x = table.getValueAt(row,0).toString();

				koc paket =new koc(x,a,ID);
				paket.setVisible(true);
				
				
			}
		});
		table.setBounds(10, 33, 482, 969);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		table_2 = new JTable();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int row=table_2.rowAtPoint(e.getPoint());
				String x = table_2.getValueAt(row,0).toString();

				koc paket =new koc(x,a,ID);
				paket.setVisible(true);
				
				
				
			}
		});
		table_2.setBounds(558, 33, 428, 642);
		table_2.setModel(model2);
		scrollPane_1.setViewportView(table_2);
		
		table_3 = new JTable();
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row=table_3.rowAtPoint(e.getPoint());
				String x = table_3.getValueAt(row,0).toString();

				koc paket =new koc(x,a,ID);
				paket.setVisible(true);
				
				
			}
		});
		table_3.setBounds(1077, 33, 428, 642);
		table_3.setModel(model3);
		scrollPane_2.setViewportView(table_3);
		
		JLabel lblNewLabel = new JLabel("-Pop-");
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lblNewLabel.setBounds(247, 203, 124, 44);
		panel.add(lblNewLabel);
		
		JLabel lbljazz = new JLabel("-Jazz-");
		lbljazz.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lbljazz.setBounds(860, 203, 150, 44);
		panel.add(lbljazz);
		
		JLabel lblklasik = new JLabel("-Klasik-");
		lblklasik.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lblklasik.setBounds(1457, 203, 209, 44);
		panel.add(lblklasik);
		
		JLabel lblAnaMen = new JLabel("ANA MENÜ");
		lblAnaMen.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lblAnaMen.setBounds(800, 34, 260, 44);
		panel.add(lblAnaMen);
		
		
		JLabel isim = new JLabel("New label");
		isim.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		isim.setBounds(201, 38, 266, 33);
		panel.add(isim);
		
		JLabel lblNewLabel_3 = new JLabel("Kullanıcı Adı :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(42, 37, 183, 32);
		panel.add(lblNewLabel_3);
		
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  kullanıcı_adı From kullanıcı where kullanıcıId="+ID+" ");

			try {
				
				while(myRs.next()) {
					yazı = myRs.getString("kullanıcı_adı");
					 isim.setText(yazı);
				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
																	//	*//*/*/*/*/  İLK 3 TABLO BİTTİ/*/*/*/*/*
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
model7.setColumnIdentifiers(sutunlar2);

		
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From kullanıcı");

			try {
				
				while(myRs.next()) {
					satirlar_tmp2[0] = myRs.getString("kullanıcıId");
					satirlar_tmp2[1] = myRs.getString("kullanıcı_adı");
					satirlar_tmp2[2] = myRs.getString("abonelik_türü");
					satirlar_tmp2[3] = myRs.getString("ödendi");
					
					model7.addRow(satirlar_tmp2);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(SystemColor.activeCaption);
		tabbedPane.addTab("Çalma Listesi", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		
		
		model15.setColumnIdentifiers(sutunlar2);

		
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From kullanıcı,kul_kul where kul_kul.kullanıcıId="+ID+" and kullanıcıId1=kullanıcı.kullanıcıId ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("kullanıcıId");
					satirlar_tmp[1] = myRs.getString("kullanıcı_adı");
					satirlar_tmp[2] = myRs.getString("abonelik_türü");
					satirlar_tmp[3] = myRs.getString("ödendi");
					
					model15.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(1584, 29, 280, 381);
		panel_1.add(scrollPane_6);
		
		table_7 = new JTable();
		table_7.setForeground(new Color(139, 0, 139));
		table_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				int row=table_7.rowAtPoint(e.getPoint());

				
				
				String x = table_7.getValueAt(row,0).toString();

				int xx=Integer.parseInt(x);  
				String y = table_7.getValueAt(row,2).toString();
				if(y.equals("N") && pro().equals("P") || xx==ID ) {///////////////////////////&& xx==ID
					System.out.println(xx==ID);
				System.out.println("prooooooooooooooooooooooooooooooooooo");
				}
				
				else {
					System.out.println("olduuuuuuuuuuuuuuuuuuuuuuuuuuu");
					eklemeyap2(x);
					System.out.println(xx==ID);
				}
				
				
			

			
			}
		});
		table_7.setBounds(1568, 95, 245, 481);
		table_7.setModel(model7);
		scrollPane_6.setViewportView(table_7);
		
		
		
		
		

		JScrollPane scrollPane_15 = new JScrollPane();
		scrollPane_15.setBounds(1584, 488, 280, 199);
		panel_1.add(scrollPane_15);
		
		table_15 = new JTable();
		table_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int row=table_15.rowAtPoint(e.getPoint());

				
				
				String x = table_15.getValueAt(row,0).toString();
				String y = table_15.getValueAt(row,2).toString();
				if(y.equals("N") && pro().equals("P") ) {

				}
				
				else {
					cizdir2(x);
				}
				
				
				
			}
		});
		scrollPane_15.setViewportView(table_15);
		table_15.setModel(model15);	
		
		
		
		
		
		JScrollPane scrollPane_16 = new JScrollPane();
		scrollPane_16.setBounds(1584, 734, 280, 227);
		panel_1.add(scrollPane_16);
		
		table_16 = new JTable();
		table_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int row=table_15.rowAtPoint(e.getPoint());
				String x = table_15.getValueAt(row,0).toString();
				
				int ind=Integer.parseInt(x);  
				String sorgu = "DELETE From kul_kul Where kullanıcıId ="+ID+" and kullanıcıId1= "+ ind +" " ;
				System.out.println(sorgu);
				
				try {
					Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
					Statement myStat = myConn.createStatement();
					myStat.executeUpdate(sorgu);
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				cizdir5(x);
			}
		});
		scrollPane_16.setViewportView(table_16);
		table_16.setModel(model15);	
		
		
		
		
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

																			//	*//*/*/*/*/  KULLANICI TABLO BİTTİ/*/*/*/*/*

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		

		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(31, 207, 430, 577);
		panel_1.add(scrollPane_3);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(521, 207, 476, 576);
		panel_1.add(scrollPane_4);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(1057, 208, 487, 576);
		panel_1.add(scrollPane_5);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		table_4 = new JTable();
		table_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_4.setForeground(new Color(139, 0, 139));
		table_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row=table_4.rowAtPoint(e.getPoint());
				
				int col= table_4.columnAtPoint(e.getPoint());
				
				
				String x = table_4.getValueAt(row,0).toString();
				 
				
				eklemeyap(x);
				
			}
		});
		table_4.setBounds(33, 37, 428, 642);
		//table_4.setModel(model4);
		scrollPane_3.setViewportView(table_4);
		
		table_5 = new JTable();
		table_5.setForeground(new Color(139, 0, 139));
		table_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int row=table_5.rowAtPoint(e.getPoint());
				
				int col= table_5.columnAtPoint(e.getPoint());
				
				
				String x = table_5.getValueAt(row,0).toString();
				
				
				eklemeyap(x);
				
				
			}
		});
		table_5.setBounds(520, 37, 428, 642);
		//table_5.setModel(model5);
		scrollPane_4.setViewportView(table_5);
		
		table_6 = new JTable();
		table_6.setForeground(new Color(139, 0, 139));
		table_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row=table_6.rowAtPoint(e.getPoint());
				
				int col= table_6.columnAtPoint(e.getPoint());
				
				
				String x = table_6.getValueAt(row,0).toString();
				 
				
				eklemeyap(x);
				
			}
		});
		table_6.setBounds(1005, 37, 428, 642);
		//table_6.setModel(model6);
		scrollPane_5.setViewportView(table_6);
		
		JButton btnNewButton = new JButton("HEPSİNİ EKLE");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				 int rows = table_4.getRowCount();
				String[] satır1 = new String[rows];
				
				for(int i=0;i<rows;i++) {
					satır1[i] = table_4.getValueAt(i,0).toString();
					eklemeyap(satır1[i]);
				}
				
				
			}
		});
		btnNewButton.setBounds(108, 846, 252, 71);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("HEPSİNİ EKLE");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int rows = table_5.getRowCount();
				String[] satır1 = new String[rows];
					
					
				for(int i=0;i<rows;i++) {
						satır1[i] = table_5.getValueAt(i,0).toString();
						eklemeyap(satır1[i]);
					}
					
				
				
				
			}
		});
		btnNewButton_1.setBounds(616, 846, 252, 71);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HEPSİNİ EKLE");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int rows = table_6.getRowCount();
				String[] satır1 = new String[rows];
					
					
				for(int i=0;i<rows;i++) {
						satır1[i] = table_6.getValueAt(i,0).toString();
						eklemeyap(satır1[i]);
					}
				
				
			}
		});
		btnNewButton_2.setBounds(1182, 846, 252, 71);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("-Pop-");
		lblNewLabel_1.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lblNewLabel_1.setBounds(148, 118, 124, 44);
		panel_1.add(lblNewLabel_1);
		
		JLabel lbljazz_1 = new JLabel("-Jazz-");
		lbljazz_1.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lbljazz_1.setBounds(661, 118, 150, 44);
		panel_1.add(lbljazz_1);
		
		JLabel lblklasik_1 = new JLabel("-Klasik-");
		lblklasik_1.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lblklasik_1.setBounds(1196, 118, 209, 44);
		panel_1.add(lblklasik_1);
		
		JLabel lblklasik_1_1 = new JLabel("Lütfen istediğiniz kullanıcıyı seçiniz...");
		lblklasik_1_1.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 16));
		lblklasik_1_1.setBounds(1571, 433, 306, 54);
		panel_1.add(lblklasik_1_1);
		
		
		
		
		

		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.activeCaption);
		tabbedPane.addTab("Tüm Şarkılar", null, panel_2, null);
		panel_2.setLayout(null);
		
		
		model8.setColumnIdentifiers(sutunlar);
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From şarki");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					model8.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(320, 142, 1282, 788);
		panel_2.add(scrollPane_7);
		
		table_1 = new JTable();
		table_1.setForeground(new Color(204, 0, 0));
		table_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int row=table_1.rowAtPoint(e.getPoint());
				
				int col= table_1.columnAtPoint(e.getPoint());
				
				
				String x = table_1.getValueAt(row,0).toString();
				
				eklemeyap(x);
				
				
			}
		});
		table_1.setBounds(56, 48, 810, 794);
		table_1.setModel(model8);
		scrollPane_7.setViewportView(table_1);
		
		JLabel lblNewLabel_2 = new JLabel("İstediğiniz şarkıları ekleyebilirsiniz...");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(697, 49, 687, 54);
		panel_2.add(lblNewLabel_2);
		
		
		
		
		
		
		
		
		model9.setColumnIdentifiers(sutunlar);
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From şarki where tür='POP' ORDER BY dinlenme_sayısı DESC LIMIT 0, 10 ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					model9.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		model10.setColumnIdentifiers(sutunlar);
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From şarki where tür='JAZZ' ORDER BY dinlenme_sayısı DESC LIMIT 0, 10  ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					model10.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		model11.setColumnIdentifiers(sutunlar);
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From şarki where tür='KLASİK' ORDER BY dinlenme_sayısı DESC LIMIT 0, 10  ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					model11.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(SystemColor.activeCaption);
		tabbedPane.addTab("Top 10", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(24, 347, 441, 594);
		panel_3.add(scrollPane_8);
		
		table_8 = new JTable();
		table_8.setForeground(new Color(128, 0, 0));
		table_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		table_8.setModel(model9);
		scrollPane_8.setViewportView(table_8);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(482, 347, 427, 594);
		panel_3.add(scrollPane_9);
		
		table_9 = new JTable();
		table_9.setForeground(new Color(128, 0, 0));
		table_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		table_9.setModel(model10);
		scrollPane_9.setViewportView(table_9);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(919, 347, 403, 594);
		panel_3.add(scrollPane_10);
		
		table_10 = new JTable();
		table_10.setForeground(new Color(128, 0, 0));
		table_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		table_10.setModel(model11);
		scrollPane_10.setViewportView(table_10);
		
		
		
		
		
		model12.setColumnIdentifiers(sutunlar3);
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select  * From şarki group by ülke ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp3[0] = myRs.getString("SarkıID");
					satirlar_tmp3[1] = myRs.getString("ülke");



					model12.addRow(satirlar_tmp3);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		/////////////////////////////////////////////*********************************************************************////////////////////////////////
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(1351, 693, 452, 248);
		panel_3.add(scrollPane_11);
		
		table_11 = new JTable();
		table_11.setForeground(new Color(128, 0, 0));
		table_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		table_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row=table_11.rowAtPoint(e.getPoint());				
				String x = table_11.getValueAt(row,1).toString();
				System.out.println(x+"+++zzzzzzzzzzzzzzzzzz");
				cizdir3(x);
				
			}
		});
		table_11.setModel(model12);
		scrollPane_11.setViewportView(table_11);
		
		
		
		model13.setColumnIdentifiers(sutunlar);
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From şarki ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp[0] = myRs.getString("SarkıID");
					satirlar_tmp[1] = myRs.getString("Şarkı_Adı");
					satirlar_tmp[2] = myRs.getString("tür");
					satirlar_tmp[3] = myRs.getString("dinlenme_sayısı");
					satirlar_tmp[4] = myRs.getString("süre");
					satirlar_tmp[5] = myRs.getString("tarih");
					satirlar_tmp[6] = myRs.getString("ülke");

					model13.addRow(satirlar_tmp);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(1351, 44, 452, 594);
		panel_3.add(scrollPane_12);
		
		table_12 = new JTable();
		table_12.setForeground(new Color(128, 0, 0));
		table_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		scrollPane_12.setViewportView(table_12);
		//table_12.setModel(model13);
		
		JLabel lbljazz_2 = new JLabel("-Jazz-");
		lbljazz_2.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lbljazz_2.setBounds(602, 259, 150, 44);
		panel_3.add(lbljazz_2);
		
		JLabel lblklasik_2 = new JLabel("-Klasik-");
		lblklasik_2.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lblklasik_2.setBounds(1019, 259, 209, 44);
		panel_3.add(lblklasik_2);
		
		JLabel lblAnaMen_1 = new JLabel("TOP 10 LİSTESİ");
		lblAnaMen_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 49));
		lblAnaMen_1.setBounds(468, 44, 441, 99);
		panel_3.add(lblAnaMen_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("-Pop-");
		lblNewLabel_1_1.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 49));
		lblNewLabel_1_1.setBounds(183, 259, 124, 44);
		panel_3.add(lblNewLabel_1_1);
		
		JButton güncelle = new JButton("GÜNCELLE");
		güncelle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				güncelle();
				
			}
		});
		güncelle.setBounds(24, 224, 89, 23);
		panel_3.add(güncelle);
		
		
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
																												// *******************************************************panel4
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Albümler", null, panel_4, null);
		panel_4.setLayout(null);
		
		
		
		
		
		model14.setColumnIdentifiers(sutunlar4);
		try {
			
			Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proje2","root","923280");
			Statement myStat = (Statement) myConn.createStatement();
			ResultSet myRs = myStat.executeQuery("Select * From album ");

			try {
				
				while(myRs.next()) {
					satirlar_tmp4[0] = myRs.getString("albumId");
					satirlar_tmp4[1] = myRs.getString("album_adı");
					satirlar_tmp4[2] = myRs.getString("tarih");
					satirlar_tmp4[3] = myRs.getString("tür");
					

					model14.addRow(satirlar_tmp4);

				}
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(820, 124, 298, 393);
		panel_4.add(scrollPane_13);
		
		table_13 = new JTable();
		table_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int row=table_13.rowAtPoint(e.getPoint());				
				String x = table_13.getValueAt(row,0).toString();
				cizdir4(x);
				
				
				
			}
		});
		scrollPane_13.setViewportView(table_13);
		table_13.setModel(model14);
		
		
		
		JScrollPane scrollPane_14 = new JScrollPane();
		scrollPane_14.setBounds(160, 89, 547, 631);
		panel_4.add(scrollPane_14);
		
		table_14 = new JTable();
		table_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row=table_14.rowAtPoint(e.getPoint());
				
				String x = table_14.getValueAt(row,0).toString();
				
				eklemeyap(x);

			}
		});
		scrollPane_14.setViewportView(table_14);
		
		
		
		
	}
}
