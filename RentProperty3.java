package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RentProperty3 extends JFrame{
	private Container c;
	private JLabel txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14;
	private JLabel label1,label2,label3;
	private JPanel jp1;
	private JButton btn1,btn2,btn3;
	private Color c1,c2;
	private Font f1,f2,f3;
	private ImageIcon img1,img2,img3,img4,img5;
	private Cursor csr;
	public RentProperty3()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(830,600);
		setLocationRelativeTo(null);
		setTitle("Property3/rent");
		setResizable(false);
		c=this.getContentPane();
		c.setLayout(null);
		c1=new Color(52,73,94);
		c2=new Color(211,84,0);
		csr=new Cursor(Cursor.HAND_CURSOR);
		f1=new Font("Sherif",Font.BOLD,28);
		f2=new Font("Sherif",Font.BOLD,18);
		f3=new Font("Sherif",Font.PLAIN,16);
		c.setBackground(c1);
		txt1=new JLabel("Overview");
		txt1.setBounds(350,05,150,30);
		txt1.setFont(f1);
		txt1.setForeground(Color.WHITE);
		c.add(txt1);
		btn1=new JButton();
		btn1.setIcon(new ImageIcon("Image/prev.png"));
		btn1.setBounds(10,0,48,48);
		btn1.setBackground(c2);
		btn1.setCursor(csr);
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
			   dispose();
			   Rent obj=new Rent();
			   obj.setVisible(true);
			}
		});
		c.add(btn1);
		jp1=new JPanel();
		jp1.setBounds(0,0,850,50);
		jp1.setBackground(c2);
		c.add(jp1);
		txt2=new JLabel("Address");
		txt2.setBounds(20,70,150,30);
		txt2.setForeground(Color.WHITE);
		txt2.setFont(f2);
		c.add(txt2);
		txt3=new JLabel("Size");
		txt3.setBounds(20,110,150,30);
		txt3.setForeground(Color.WHITE);
		txt3.setFont(f2);
		c.add(txt3);
		txt4=new JLabel("Land Size");
		txt4.setBounds(20,150,150,30);
		txt4.setForeground(Color.WHITE);  
		txt4.setFont(f2);
		c.add(txt4);
		txt5=new JLabel("Apartments");
		txt5.setBounds(20,190,150,30);
		txt5.setForeground(Color.WHITE);
		txt5.setFont(f2);
		c.add(txt5);
		txt6=new JLabel("Consultant");
		txt6.setBounds(20,230,150,30);
		txt6.setForeground(Color.WHITE);
		txt6.setFont(f2);
		c.add(txt6);
		txt7=new JLabel("plot 19/21,road 13, Badda");
		txt7.setBounds(190,70,220,30);
		txt7.setFont(f3);
		txt7.setForeground(Color.WHITE);
		c.add(txt7);
		txt8=new JLabel("1200 sqft");
		txt8.setBounds(190,110,180,30);
		txt8.setFont(f3);
		txt8.setForeground(Color.WHITE);
		c.add(txt8);
		txt9=new JLabel("5 katha");
		txt9.setBounds(190,150,180,30);
		txt9.setFont(f3);
		txt9.setForeground(Color.WHITE);
		c.add(txt9);
		txt10=new JLabel("3");
		txt10.setBounds(190,190,190,30);
		txt10.setFont(f3);
		txt10.setForeground(Color.WHITE);
		c.add(txt10);
		txt11=new JLabel("Volumezero LTD");
		txt11.setBounds(190,230,180,30);
		txt11.setFont(f3);
		txt11.setForeground(Color.WHITE);
		c.add(txt11);
		txt13=new JLabel("Rent (per month)");
		txt13.setBounds(20,260,250,30);
		txt13.setForeground(Color.WHITE);
		txt13.setFont(f2);
		c.add(txt13);
		txt14=new JLabel("20K");
		txt14.setBounds(190,260,180,30);
		txt14.setForeground(Color.WHITE);
		txt14.setFont(f3);
		c.add(txt14);
		txt12=new JLabel("GALLERY");
		txt12.setBounds(350,290,180,30);
		txt12.setFont(f2);
		txt12.setForeground(Color.WHITE);
		c.add(txt12);
		label1=new JLabel();
		label1.setIcon(new ImageIcon("Image/buy3.jpg"));
		label1.setBounds(50,330,270,220);
		c.add(label1);
		label2=new JLabel();
		label2.setIcon(new ImageIcon("Image/buy5.jpg"));
		label2.setBounds(275,317,270,240);
		c.add(label2);
		label3=new JLabel();
		label3.setIcon(new ImageIcon("Image/buy4.jpg"));
		label3.setBounds(500,325,270,225);
		c.add(label3);
		btn2=new JButton();
		btn2.setIcon(new ImageIcon("Image/chat.png"));
		btn2.setBackground(c1);
		btn2.setBounds(735,60,48,48);
		btn2.setFocusable(false);
		btn2.setBorderPainted(false);
		btn2.setToolTipText("chat");
		btn2.setCursor(csr);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showMessageDialog(null,"Sorry, None is availabe for communicating");
			}
		});
		c.add(btn2);
		btn3=new JButton("pay rent");
		btn3.setBounds(710,120,90,30);
		btn3.setBackground(new Color(34,167,240));
		btn3.setForeground(Color.WHITE);
		btn3.setFocusable(false);
		btn3.setBorderPainted(false);
		btn3.setCursor(csr);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
				RentPay2 obj=new RentPay2();
				obj.setVisible(true);
			}
		});
		c.add(btn3);
	}
}
		