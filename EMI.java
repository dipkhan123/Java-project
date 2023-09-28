package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EMI extends JFrame{
	private Container c;
	private JLabel head;
	private JLabel txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9;
	private JPanel jp1;
	private Color c1,c2;
	private Font f1,f2,f3;
	private JComboBox box1;
	private Cursor csr;
	private JButton btn1,btn2;
	private ImageIcon img;
	public EMI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,450);
		setLocationRelativeTo(null);
		setTitle("EMI page");
		setResizable(false);
		initcomponents();
	}
	void initcomponents()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c1=new Color(52,73,94);
		c2=new Color(211,84,0);
		f1=new Font("Sherif",Font.BOLD,22);
		f2=new Font("Sherif",Font.BOLD,16);
		f3=new Font("Sherif",Font.PLAIN,16);
		csr=new Cursor(Cursor.HAND_CURSOR);
		String months[]={"6","12","24"};
		c.setBackground(c1);
		head=new JLabel("EMI  Calculator");
		head.setBounds(220,10,250,30);
		head.setFont(f1);
		head.setForeground(Color.WHITE);
		c.add(head);
		btn2=new JButton();
		btn2.setIcon(new ImageIcon("Image/prev.png"));
		btn2.setBounds(10,10,32,32);
		btn2.setBackground(c2);
		btn2.setFocusable(false);
		btn2.setBorderPainted(false);
		btn2.setCursor(csr);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
				BuyProperty1 obj=new BuyProperty1();
				obj.setVisible(true);
			}
		});
		c.add(btn2);
		jp1=new JPanel();
		jp1.setBounds(0,0,600,50);
		jp1.setBackground(c2);
		c.add(jp1);
		txt1=new JLabel("Priciple amount");
		txt1.setBounds(20,70,200,30);
		txt1.setFont(f2);
		txt1.setForeground(Color.WHITE);
		c.add(txt1);
		txt2=new JLabel("Interest Rate(%)");
		txt2.setBounds(20,110,200,30);
		txt2.setFont(f2);
		txt2.setForeground(Color.WHITE);
		c.add(txt2);
		txt3=new JLabel("Tenure(months)");
		txt3.setBounds(20,150,200,30);
		txt3.setFont(f2);
		txt3.setForeground(Color.WHITE);
		c.add(txt3);
		txt4=new JLabel("EMI  =");
		txt4.setBounds(20,190,200,30);
		txt4.setFont(f2);
		txt4.setForeground(Color.WHITE);
		c.add(txt4);
		txt5=new JLabel("9000000");
		txt5.setBounds(250,70,200,30);
		txt5.setForeground(Color.WHITE);
		txt5.setFont(f3);
		c.add(txt5);
		txt6=new JLabel("5");
		txt6.setBounds(250,110,200,30);
		txt6.setForeground(Color.WHITE);
		txt6.setFont(f3);
		c.add(txt6);
		box1=new JComboBox(months);
		box1.setBounds(250,150,60,30);
		box1.setBackground(c1);
		box1.setForeground(Color.WHITE);
		box1.setFont(f3);
		box1.setCursor(csr);
		box1.setFocusable(false);
		c.add(box1);
		txt7=new JLabel();
		txt7.setBounds(250,190,200,30);
		txt7.setFont(f3);
		txt7.setForeground(Color.WHITE);
		c.add(txt7);
		txt8=new JLabel("Total payment : ");
		txt8.setBounds(20,230,200,30);
		txt8.setForeground(Color.WHITE);
		txt8.setFont(f2);
		c.add(txt8);
		txt9=new JLabel("");
		txt9.setBounds(250,230,350,30);
		txt9.setForeground(Color.WHITE);
		txt9.setFont(f2);
		c.add(txt9);
		btn1=new JButton("calculate");
		btn1.setBounds(450,55,90,30);
		btn1.setBackground(new Color(34,167,240));
		btn1.setForeground(Color.WHITE);
		btn1.setCursor(csr);
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				double P=Double.parseDouble(txt5.getText());
				double value2=Double.parseDouble(txt6.getText());
				double R=value2/100;
				double N=Double.parseDouble(box1.getSelectedItem().toString());
				double value=(P*R*Math.pow((1+R),N))/(Math.pow((1+R),N)-1);
				int emi=(int)value;
				int total=(int)(emi*N);
				txt7.setText(String.valueOf(emi));
				txt9.setText(String.valueOf(total));
			}
		});
		c.add(btn1);
	}
}
		