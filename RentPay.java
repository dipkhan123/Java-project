package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RentPay extends JFrame{
	private Container c;
	private ImageIcon img1,img2,img3;
	private JRadioButton rbtn1,rbtn2,rbtn3;
	private ButtonGroup grp;
	private JLabel txt1,txt2,txt3,txt4,txt5,txt6;
	private JTextField tf1;
	private JPasswordField pass1;
	private JComboBox box1;
	private Font f1;
	private Cursor csr;
	private JButton btn1,btn2;
	public RentPay()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setLocationRelativeTo(null);
		setTitle("Pay Rent Page");
		setResizable(false);
		initcomponents();
	}
	void initcomponents()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(52,73,94));
		csr=new Cursor(Cursor.HAND_CURSOR);
		String months[]={"1","2","6"};
		txt1=new JLabel("Pay through : ");
		txt1.setBounds(15,15,180,30);
		txt1.setFont(new Font("Sherif",Font.BOLD,22));
		txt1.setForeground(new Color(211,84,0));
		c.add(txt1);
		rbtn1=new JRadioButton("bKash");
		rbtn1.setBounds(200,15,100,30);
		rbtn1.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn1.setBackground(new Color(52,73,94));
		rbtn1.setForeground(Color.WHITE);
		rbtn1.setCursor(csr);
		rbtn1.setFocusable(false);
		rbtn1.setBorderPainted(false);
		c.add(rbtn1);
		rbtn2=new JRadioButton("nagad");
		rbtn2.setBounds(300,15,100,30);
		rbtn2.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn2.setBackground(new Color(52,73,94));
		rbtn2.setForeground(Color.WHITE);
		rbtn2.setCursor(csr);
		rbtn2.setFocusable(false);
		rbtn2.setBorderPainted(false);
		c.add(rbtn2);
		rbtn3=new JRadioButton("rocket");
		rbtn3.setBounds(400,15,100,30);
		rbtn3.setFont(new Font("Sherif",Font.BOLD,16));
		rbtn3.setBackground(new Color(52,73,94));
		rbtn3.setForeground(Color.WHITE);
		rbtn3.setCursor(csr);
		rbtn3.setFocusable(false);
		rbtn3.setBorderPainted(false);
		c.add(rbtn3);
		grp=new ButtonGroup();
		grp.add(rbtn1);
		grp.add(rbtn2);
		grp.add(rbtn3);
		txt2=new JLabel("AC no : ");
		txt2.setBounds(30,90,100,30);
		txt2.setFont(new Font("Sherif",Font.BOLD,18));
		txt2.setForeground(Color.WHITE);
		c.add(txt2);
		txt3=new JLabel("PIN no : ");
		txt3.setBounds(30,130,100,30);
		txt3.setFont(new Font("Sherif",Font.BOLD,18));
		txt3.setForeground(Color.WHITE);
		c.add(txt3);
		txt4=new JLabel("Select months:");
		txt4.setBounds(30,170,150,30);
		txt4.setFont(new Font("Sherif",Font.BOLD,18));
		txt4.setForeground(Color.WHITE);
		c.add(txt4);
		txt5=new JLabel("Total amount:");
		txt5.setBounds(30,210,150,30);
		txt5.setFont(new Font("Sherif",Font.BOLD,18));
		txt5.setForeground(Color.WHITE);
		c.add(txt5);
		tf1=new JTextField();
		tf1.setBounds(200,90,200,30);
		tf1.setBackground(Color.WHITE);
		tf1.setForeground(Color.BLACK);
		tf1.setFont(new Font("Sherif",Font.PLAIN,16));
		tf1.setHorizontalAlignment(JTextField.CENTER);
		tf1.setToolTipText("Phone NO");
		c.add(tf1);
		pass1=new JPasswordField();
		pass1.setBounds(200,130,200,30);
		pass1.setBackground(Color.WHITE);
		pass1.setForeground(Color.BLACK);
		pass1.setFont(new Font("Sherif",Font.PLAIN,16));
		pass1.setHorizontalAlignment(JTextField.CENTER);
		pass1.setEchoChar('*');
		c.add(pass1);
		txt6=new JLabel();
		txt6.setBounds(200,210,200,30);
		txt6.setForeground(Color.WHITE);
		txt6.setFont(new Font("Sherif",Font.PLAIN,16));
		c.add(txt6);
		box1=new JComboBox(months);
		box1.setSelectedIndex(-1);
		box1.setBounds(200,170,50,30);
		box1.setBackground(Color.WHITE);
		box1.setForeground(Color.BLACK);
		box1.setFont(new Font("Sherif",Font.PLAIN,14));
		box1.setFocusable(false);
		box1.setCursor(csr);
		box1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				String str=box1.getSelectedItem().toString();
				double value=Double.parseDouble(str);
				if(value==1)
				{
					txt6.setText("50k");
				}
				if(value==2)
				{
					txt6.setText("100K");
				}
				if(value==6)
				{
					txt6.setText("300K");
				}
			}
					
		});
		c.add(box1);
		btn1=new JButton("pay");
		btn1.setBounds(300,300,60,25);
		btn1.setBackground(new Color(34,167,240));
		btn1.setForeground(Color.WHITE);
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		btn1.setCursor(csr);
		btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
        String str1 = tf1.getText();
        String str2 = pass1.getText();

        if (str1.equals("") || str2.equals("") || str1.length() != 11) {
            JOptionPane.showMessageDialog(null, "Invalid information", "Error", JOptionPane.ERROR_MESSAGE);
        } 
		else if (!(rbtn1.isSelected() || rbtn2.isSelected() || rbtn3.isSelected())) {
            JOptionPane.showMessageDialog(null, "Select a payment service", "Error", JOptionPane.ERROR_MESSAGE);
        } 
		else if (box1.getSelectedItem()==null) {
            JOptionPane.showMessageDialog(null, "Select a number of months", "Error", JOptionPane.ERROR_MESSAGE);
        } 
		else {
                JOptionPane.showMessageDialog(null, "Payment Succeeded");
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
				RentProperty1 obj=new RentProperty1();
				obj.setVisible(true);
			}
		});
		c.add(btn2);
	}
}