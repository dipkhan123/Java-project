package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ongoing extends JFrame{
	private Container c;
	private JPanel jp1,jp2;
	private JLabel imglabel1,imglabel2,imglabel3,imglabel4,txt1,txt2,txt3,txt4,txt5,txt6,txt7,ad1,ad2;
	private Font f1,f2;
	private ImageIcon img,img1,img2,img3,img4;
	private JButton btn,btn1,btn2,btn3;
	private Cursor cursor;
	public Ongoing()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,600);
		setLocationRelativeTo(null);
		setTitle("Ongoing Projectes");
		setResizable(false);
		initcomponents();
	}
	void initcomponents()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		f1=new Font("Sherif",Font.BOLD,28);
		f2=new Font("Sherif",Font.PLAIN,16);
		cursor=new Cursor(Cursor.HAND_CURSOR);
		txt1=new JLabel();
		txt1.setText("Our Ongoing Projects :");
		txt1.setBounds(280,15,500,35);
		txt1.setForeground(Color.WHITE);
		txt1.setFont(f1);
		c.add(txt1);
		btn=new JButton();
		btn.setIcon(new ImageIcon("Image/home1.png"));
		btn.setBounds(10,10,40,40);
		btn.setBackground(Color.BLUE);
		btn.setCursor(cursor);
		btn.setToolTipText("Homepage");
	    btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent hm)
			{
				dispose();
				HomePage1 obj=new HomePage1();
				obj.setVisible(true);
			}
		});
		c.add(btn);
		jp1=new JPanel();
		jp1.setBounds(0,0,900,70);
		jp1.setBackground(Color.BLUE);
		c.add(jp1);
		imglabel1=new JLabel();
		imglabel1.setIcon(new ImageIcon("Image/flat4.jpg"));
		imglabel1.setBackground(Color.WHITE);
		imglabel1.setBounds(10,100,250,230);
		c.add(imglabel1);
		txt2=new JLabel();
		txt2.setText("Maya Bhaban");
		txt2.setBounds(60,340,120,30);
		txt2.setForeground(Color.BLACK);
		txt2.setFont(f2);
		c.add(txt2);
		txt3=new JLabel();
		txt3.setText("Banani,Dhaka");
		txt3.setBounds(60,360,120,30);
		txt3.setForeground(Color.BLACK);
		txt3.setFont(f2);
		c.add(txt3);
		imglabel2=new JLabel();
		imglabel2.setIcon(new ImageIcon("Image/flat5.jpg"));
		imglabel2.setBackground(Color.WHITE);
		imglabel2.setBounds(310,100,250,230);
		c.add(imglabel2);
		txt4=new JLabel();
		txt4.setText("ISLAM Mansion");
		txt4.setBounds(380,340,120,30);
		txt4.setForeground(Color.BLACK);
		txt4.setFont(f2);
		c.add(txt4);
		txt5=new JLabel();
		txt5.setText("Badda,Dhaka");
		txt5.setBounds(380,360,120,30);
		txt5.setForeground(Color.BLACK);
		txt5.setFont(f2);
		c.add(txt5);
		imglabel3=new JLabel();
		imglabel3.setIcon(new ImageIcon("Image/flat6.jpg"));
		imglabel3.setBackground(Color.WHITE);
		imglabel3.setBounds(580,100,300,230);
		c.add(imglabel3);
		txt6=new JLabel();
		txt6.setText("Concord,Dhaka");
		txt6.setBounds(680,340,120,30);
		txt6.setForeground(Color.BLACK);
		txt6.setFont(f2);
		c.add(txt6);
		txt7=new JLabel();
		txt7.setText("Gulshan,Dhaka");
		txt7.setBounds(680,360,120,30);
		txt7.setForeground(Color.BLACK);
		txt7.setFont(f2);
		c.add(txt7);
		btn1=new JButton("Visit");
		btn1.setBounds(70,400,80,30);
		btn1.setBackground(Color.BLUE);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(f2);
		btn1.setCursor(cursor);
		btn1.setBorderPainted(false);
		btn1.setFocusable(false);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showMessageDialog(null,"You can visit the property once it's completed.");
				JOptionPane.showMessageDialog(null,"call 01917563795 for getting updates");
			}
		});
		c.add(btn1);
		btn2=new JButton("Visit");
		btn2.setBounds(400,400,80,30);
		btn2.setBackground(Color.BLUE);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(f2);
		btn2.setCursor(cursor);
		btn2.setBorderPainted(false);
		btn2.setFocusable(false);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showMessageDialog(null,"You can visit the property once it's completed.");
				JOptionPane.showMessageDialog(null,"call 01911195237 for getting updates");
			}
		});
		c.add(btn2);
		btn3=new JButton("Visit");
		btn3.setBounds(690,400,80,30);
		btn3.setBackground(Color.BLUE);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(f2);
		btn3.setCursor(cursor);
		btn3.setBorderPainted(false);
		btn3.setFocusable(false);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showMessageDialog(null,"You can visit the property once it's completed.");
				JOptionPane.showMessageDialog(null,"call 01840249056 for getting updates");
			}
		});
		c.add(btn3);
		ad1=new JLabel("free space for ad");
		ad1.setBounds(375,470,300,30);
		ad1.setForeground(Color.WHITE);
		ad1.setFont(new Font("Sherif",Font.BOLD,18));
		c.add(ad1);
		ad2=new JLabel("call : 01840249056");
		ad2.setBounds(375,495,500,30);
		ad2.setForeground(Color.WHITE);
		ad2.setFont(new Font("Sherif",Font.BOLD,18));
		c.add(ad2);
		imglabel4=new JLabel();
		imglabel4.setIcon(new ImageIcon("Image/ad.png"));
		imglabel4.setBounds(250,455,96,96);
		c.add(imglabel4);
		jp2=new JPanel();
		jp2.setBounds(0,450,900,150);
		jp2.setBackground(Color.BLACK);
		c.add(jp2);
	}
}