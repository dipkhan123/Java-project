package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AboutUs extends JFrame{
	private Container c;
	private JLabel txt1,txt2,txt3,txt4,txt5,txt6;
	private JLabel imglabel1,imglabel2,imglabel3,imglabel4,imglabel5,imglabel6,imglabel7;
	private ImageIcon img1,img2,img3,img4,img5,img6,img7;
	private JPanel jp1,jp2;
	private JButton btn1;
	private Cursor cursor;
	public AboutUs()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,600);
		setLocationRelativeTo(null);
		setTitle("AboutUs Page");
		setResizable(false);
		initcomponents();
	}
	void initcomponents()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		cursor=new Cursor(HAND_CURSOR);
		txt1=new JLabel("Home to All of Your Property Needs");
		txt1.setBounds(250,25,500,30);
		txt1.setFont(new Font("Sherif",Font.BOLD,24));
		txt1.setForeground(Color.BLUE);
		c.add(txt1);
		txt2=new JLabel("BUY | RENT | LEGAL SERVICES");
		txt2.setBounds(315,55,500,30);
		txt2.setFont(new Font("Sherif",Font.BOLD,18));
		txt2.setForeground(Color.BLACK);
		c.add(txt2);
		btn1=new JButton();
		btn1.setIcon(new ImageIcon("Image/home.png"));
		btn1.setBounds(10,10,60,60);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setCursor(cursor);
		btn1.setToolTipText("HomePage");
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
				HomePage1 obj=new HomePage1();
				obj.setVisible(true);
			}
		});
		c.add(btn1);
		jp1=new JPanel();
		jp1.setBounds(0,0,900,90);
		jp1.setBackground(Color.LIGHT_GRAY);
		c.add(jp1);
		txt3=new JLabel("At a Glance");
		txt3.setBounds(25,100,150,30);
		txt3.setFont(new Font("Sherif",Font.BOLD,22));
		txt3.setForeground(Color.BLACK);
		c.add(txt3);
		imglabel1=new JLabel();
		imglabel1.setIcon(new ImageIcon("Image/about2.png"));
		imglabel1.setBounds(25,130,443,232);
		c.add(imglabel1);
		imglabel2=new JLabel();
		imglabel2.setIcon(new ImageIcon("Image/about.png"));
		imglabel2.setBounds(480,90,410,290);
		c.add(imglabel2);
		txt4=new JLabel("OUR VISION");
		txt4.setBounds(300,380,150,30);
		txt4.setFont(new Font("Sherif",Font.BOLD,22));
		txt4.setForeground(Color.BLACK);
		c.add(txt4);
		txt5=new JLabel("To be the household name for property services in Bangladesh.");
		txt5.setBounds(110,410,600,30);
		txt5.setFont(new Font("Sherif",Font.PLAIN,20));
		txt5.setForeground(Color.BLACK);
		c.add(txt5);
		txt6=new JLabel("Associate Partners : ");
		txt6.setBounds(50,465,250,30);
		txt6.setFont(new Font("Sherif",Font.BOLD,18));
		txt6.setForeground(Color.BLACK);
		c.add(txt6);
		imglabel4=new JLabel();
		imglabel4.setIcon(new ImageIcon("Image/Partner1.png"));
		imglabel4.setBounds(280,457,48,48);
		imglabel4.setBackground(Color.BLACK);
		c.add(imglabel4);
		imglabel5=new JLabel();
		imglabel5.setIcon(new ImageIcon("Image/partner2.png"));
		imglabel5.setBounds(230,457,48,48);
		imglabel5.setBackground(Color.BLACK);
		c.add(imglabel5);
		imglabel6=new JLabel();
		imglabel6.setIcon(new ImageIcon("Image/partner3.png"));
		imglabel6.setBounds(335,457,48,48);
		imglabel6.setBackground(Color.BLACK);
		c.add(imglabel6);
		imglabel7=new JLabel();
		imglabel7.setIcon(new ImageIcon("Image/partner4.png"));
		imglabel7.setBounds(400,457,48,48);
		imglabel7.setBackground(Color.BLACK);
		c.add(imglabel7);
		jp2=new JPanel();
		jp2.setBounds(0,380,900,200);
		jp2.setBackground(Color.LIGHT_GRAY);
		c.add(jp2);
		
		
	}
}