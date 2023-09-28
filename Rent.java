package Classes;
import Interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rent extends JFrame implements iRent{
	private Container c;
	private JPanel jp1;
	private JLabel txt1,txt2,txt3,txt4,txt5,txt6,txt7;
	private Color c1,c2,c3;
	private JButton btn1,btn2,btn3,btn4;
	private ImageIcon img1,img2,img3,img4;
	private JLabel imglabel1,imglabel2,imglabel3;
	private Cursor csr;
	private Font f1,f2;
	public Rent()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,600);
		setLocationRelativeTo(null);
		setTitle("Rent Page");
		setResizable(false);
		//starting main operation
		c=this.getContentPane();
		c.setLayout(null);
		c1=new Color(52,73,94);
		c2=new Color(211,84,0);
		c3=new Color(34,167,240);
		f1=new Font("Calibri",Font.BOLD,22);
		f2=new Font("Sherif",Font.BOLD,16);
		csr=new Cursor(Cursor.HAND_CURSOR);
		c.setBackground(c1);
		txt1=new JLabel("Available for Rent");
		txt1.setBounds(310,15,400,30);
		txt1.setForeground(Color.WHITE);
		txt1.setFont(new Font("Sherif",Font.BOLD,28));
		c.add(txt1);
		btn1=new JButton();
		btn1.setIcon(new ImageIcon("Image/home.png"));
		btn1.setBounds(15,0,55,55);
		btn1.setBackground(c2);
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		btn1.setCursor(csr);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				back();
			}
		});
		c.add(btn1);
		jp1=new JPanel();
		jp1.setBounds(0,0,900,55);
		jp1.setBackground(c2);
		c.add(jp1);
		imglabel1=new JLabel();
		imglabel2=new JLabel();
		imglabel3=new JLabel();
		try{
		imglabel1.setIcon(new ImageIcon("Image/flat4.jpg"));
		imglabel2.setIcon(new ImageIcon("Image/flat5.jpg"));
		imglabel3.setIcon(new ImageIcon("Image/flat6.jpg"));
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error while loading images. Please check image files","Error",JOptionPane.ERROR_MESSAGE);
		}
		imglabel1.setBounds(20,80,250,230);
		c.add(imglabel1);
		imglabel2.setBounds(320,80,250,230);
		c.add(imglabel2);
		imglabel3.setBounds(600,80,250,230);
		c.add(imglabel3);
		txt2=new JLabel("ZAMAN Landmark");
		txt2.setBounds(50,320,200,30);
		txt2.setForeground(Color.WHITE);
		txt2.setFont(f1);
		c.add(txt2);
		txt3=new JLabel("Gulshan,Dhaka");
		txt3.setBounds(50,350,200,30);
		txt3.setForeground(Color.WHITE);
		txt3.setFont(f1);
		c.add(txt3);
		txt4=new JLabel("HAWOA Bhaban");
		txt4.setBounds(355,320,200,30);
		txt4.setForeground(Color.WHITE);
		txt4.setFont(f1);
		c.add(txt4);
		txt5=new JLabel("Banani,Dhaka");
		txt5.setBounds(355,350,200,30);
		txt5.setForeground(Color.WHITE);
		txt5.setFont(f1);
		c.add(txt5);
		txt6=new JLabel("CONCORD");
		txt6.setBounds(650,320,200,30);
		txt6.setForeground(Color.WHITE);
		txt6.setFont(f1);
		c.add(txt6);
		txt7=new JLabel("Badda,Dhaka");
		txt7.setBounds(650,350,200,30);
		txt7.setForeground(Color.WHITE);
		txt7.setFont(f1);
		c.add(txt7);
		btn2=new JButton("visit");
		btn2.setBounds(85,410,70,30);
		btn2.setBackground(c3);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(f2);
		btn2.setFocusable(false);
		btn2.setBorderPainted(false);
		btn2.setCursor(csr);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				visit1();
			}
		});
		c.add(btn2);
		btn3=new JButton("visit");
		btn3.setBounds(385,410,70,30);
		btn3.setBackground(c3);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(f2);
		btn3.setFocusable(false);
		btn3.setBorderPainted(false);
		btn3.setCursor(csr);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				visit2();
			}
		});
		c.add(btn3);
		btn4=new JButton("visit");
		btn4.setBounds(685,410,70,30);
		btn4.setBackground(c3);
		btn4.setForeground(Color.WHITE);
		btn4.setFont(f2);
		btn4.setFocusable(false);
		btn4.setBorderPainted(false);
		btn4.setCursor(csr);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				visit3();
			}
		});
		c.add(btn4);
	}
	//overridden method
	public void back()
	{
		dispose();
		HomePage1 obj=new HomePage1();
		obj.setVisible(true);
	}
	public void visit1()
	{
		dispose();
		RentProperty1 obj=new RentProperty1();
		obj.setVisible(true);
	}
	public void visit2()
	{
		dispose();
		RentProperty2 obj=new RentProperty2();
		obj.setVisible(true);
	}
	public void visit3()
	{
		dispose();
		RentProperty3 obj=new RentProperty3();
		obj.setVisible(true);
	}
}