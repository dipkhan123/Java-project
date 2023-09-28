package Classes;
import Interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Profile extends JFrame implements iProfile{
	private Container c;
	private JPanel jp1;
	private JLabel txt1;
	private Font f1;
	private JButton btn1,btn2;
	private ImageIcon img1;
	private Cursor csr;
	private JTextArea ta1;
	private Color c1;
	public Profile()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,650);
		setLocationRelativeTo(null);
		setTitle("Profile Page");
		setResizable(false);
		c=this.getContentPane();
		c.setLayout(null);
		c1=new Color(108,122,137);
		c.setBackground(c1);
		csr=new Cursor(Cursor.HAND_CURSOR);
		f1=new Font("Sherif",Font.BOLD,22);
		txt1=new JLabel("user profile");
		txt1.setBounds(220,18,150,30);
		txt1.setForeground(Color.WHITE);
		txt1.setFont(f1);
		c.add(txt1);
		jp1=new JPanel();
		jp1.setBounds(0,15,800,35);
		jp1.setBackground(Color.BLUE);
		c.add(jp1);
		btn2=new JButton();
		btn2.setIcon(new ImageIcon("Image/home.png"));
		btn2.setBounds(15,55,60,60);
		btn2.setBackground(c1);
		btn2.setCursor(csr);
		btn2.setBorderPainted(false);
		btn2.setFocusable(false);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				gotoHomepage();
			}
		});
		c.add(btn2);
		ta1=new JTextArea();
		ta1.setBounds(120,160,400,450);
		ta1.setBackground(c1);
		ta1.setForeground(Color.WHITE);
		ta1.setFont(new Font("Sherif",Font.BOLD,24));
		c.add(ta1);
		btn1=new JButton("show info");
		btn1.setBounds(230,60,105,25);
		btn1.setBackground(Color.BLUE);
		btn1.setForeground(Color.WHITE);
		btn1.setBorderPainted(false);
		btn1.setFocusable(false);
		btn1.setFont(new Font("Sherif",Font.BOLD,14));
		btn1.setCursor(csr);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				showInfo();
			}
		});
		c.add(btn1);
	}
		//@override
		public void gotoHomepage()
		{
			dispose();
			HomePage1 obj=new HomePage1();
			obj.setVisible(true);
		}
		public void showInfo()
		{
				try{
					FileReader reader=new FileReader("Data/info.txt");
					BufferedReader bf=new BufferedReader(reader);
					ta1.read(bf,null);
					reader.close();
					ta1.requestFocus();
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error occured while reading file","Error",JOptionPane.ERROR_MESSAGE);
				}
		}
}
	