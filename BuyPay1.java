package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BuyPay1 extends JFrame{
	private Container c;
	private ImageIcon img1,img2,img3;
	private JRadioButton rbtn1,rbtn2,rbtn3;
	private ButtonGroup grp;
	private JLabel txt1,txt2,txt3,txt4,txt5,txt6;
	private JTextField tf1;
	private JPasswordField pass1;
	private JComboBox box1;
	private Font f1;
	private JPanel jp1;
	private Cursor csr;
	private JButton btn1,btn2;
	public BuyPay1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setLocationRelativeTo(null);
		setTitle("Purchase Page 2");
		setResizable(false);
		initcomponents();
	}
	void initcomponents()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(52,73,94));
		csr=new Cursor(Cursor.HAND_CURSOR);
		String banks[]={"AIBL","FSIBL","IBBL"};
		txt1=new JLabel("Payment procedure : ");
		txt1.setBounds(220,10,250,30);
		txt1.setFont(new Font("Sherif",Font.BOLD,22));
		txt1.setForeground(Color.WHITE);
		c.add(txt1);
		jp1=new JPanel();
		jp1.setBounds(0,0,600,50);
		jp1.setBackground(new Color(211,84,0));
		c.add(jp1);
		txt2=new JLabel("AC Holder : ");
		txt2.setBounds(30,130,200,30);
		txt2.setFont(new Font("Sherif",Font.BOLD,18));
		txt2.setForeground(Color.WHITE);
		c.add(txt2);
		txt3=new JLabel("AC no : ");
		txt3.setBounds(30,170,100,30);
		txt3.setFont(new Font("Sherif",Font.BOLD,18));
		txt3.setForeground(Color.WHITE);
		c.add(txt3);
		txt4=new JLabel("Choose Bank:");
		txt4.setBounds(30,90,150,30);
		txt4.setFont(new Font("Sherif",Font.BOLD,18));
		txt4.setForeground(Color.WHITE);
		c.add(txt4);
		txt5=new JLabel("Total amount:");
		txt5.setBounds(30,210,150,30);
		txt5.setFont(new Font("Sherif",Font.BOLD,18));
		txt5.setForeground(Color.WHITE);
		c.add(txt5);
		tf1=new JTextField();
		tf1.setBounds(200,130,200,30);
		tf1.setBackground(Color.WHITE);
		tf1.setForeground(Color.BLACK);
		tf1.setFont(new Font("Sherif",Font.PLAIN,16));
		tf1.setHorizontalAlignment(JTextField.CENTER);
		c.add(tf1);
		pass1=new JPasswordField();
		pass1.setBounds(200,170,200,30);
		pass1.setBackground(Color.WHITE);
		pass1.setForeground(Color.BLACK);
		pass1.setFont(new Font("Sherif",Font.PLAIN,16));
		pass1.setHorizontalAlignment(JTextField.CENTER);
		pass1.setEchoChar('*');
		c.add(pass1);
		txt6=new JLabel("5000000 BDT");
		txt6.setBounds(200,210,200,30);
		txt6.setForeground(Color.WHITE);
		txt6.setFont(new Font("Sherif",Font.PLAIN,16));
		c.add(txt6);
		box1=new JComboBox(banks);
		box1.setSelectedIndex(-1);
		box1.setBounds(200,90,80,30);
		box1.setBackground(Color.WHITE);
		box1.setForeground(Color.BLACK);
		box1.setFont(new Font("Sherif",Font.PLAIN,14));
		box1.setFocusable(false);
		box1.setCursor(csr);
		c.add(box1);
		btn1=new JButton("pay");
		btn1.setBounds(300,300,60,25);
		btn1.setBackground(new Color(34,167,240));
		btn1.setForeground(Color.WHITE);
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		btn1.setCursor(csr);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				String str1=tf1.getText();
				String str2=pass1.getText();
				if(str1.equals("")||str2.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Invalid information","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(box1.getSelectedItem() == null)
				{
					JOptionPane.showMessageDialog(null,"Choose a Bank","Error",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Payment Succeed");
				dispose();
				HomePage1 obj=new HomePage1();
				obj.setVisible(true);
				}
				
			}
		});
		c.add(btn1);
		btn2=new JButton("back");
		btn2.setBounds(230,300,60,25);
		btn2.setBackground(new Color(34,167,240));
		btn2.setForeground(Color.WHITE);
		btn2.setFocusable(false);
		btn2.setBorderPainted(false);
		btn2.setCursor(csr);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
				BuyProperty2 obj=new BuyProperty2();
				obj.setVisible(true);
			}
		});
		c.add(btn2);
	}
}