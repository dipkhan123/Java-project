package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HomePage1 extends JFrame{
	private Container c;
	private JPanel jp1,jp2;
	private JLabel imglabel,imglabel1,imglabel2,imglabel3,txt1,txt2,txt3,txt4,txt5,txt6,txt7;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
	private JTextArea ta1,ta2,ta3;
	private ImageIcon img1,img2,img3,img4,img5,img6;
	private JComboBox box1;
	private Font f1,f2;
	private Cursor cur;
	public HomePage1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,650);
		setLocationRelativeTo(null);
		setTitle("www.khanBuilders.com/HomePage1");
		setResizable(false);
		c=this.getContentPane();
		c.setLayout(null);
		f1=new Font("Sherif",Font.BOLD,18);
		f2=new Font("Sherif",Font.PLAIN,16);
		cur=new Cursor(Cursor.HAND_CURSOR);
		String property[]={"Buy","Rent"};
		btn1=new JButton();
		btn1.setIcon(new ImageIcon("Image/profile.png"));
		btn1.setBounds(10,05,60,75);
		btn1.setBackground(Color.BLUE);
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		btn1.setToolTipText("profile");
		btn1.setCursor(cur);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
				Profile obj=new Profile();
				obj.setVisible(true);
			}
		});
		c.add(btn1);
		box1=new JComboBox(property);
		box1.setRenderer(new Combobox("Property"));
		box1.setSelectedIndex(-1);
		box1.setBounds(100,50,100,30);
		box1.setBackground(Color.BLUE);
		box1.setForeground(Color.WHITE);
		box1.setFocusable(false);
		box1.setCursor(cur);
		box1.setFont(f1);
		box1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				String str=box1.getSelectedItem().toString();
				if(str.equals("Buy"))
				{
					dispose();
					Buy obj=new Buy();
					obj.setVisible(true);
				}
				else
				{
					dispose();
					Rent obj=new Rent();
					obj.setVisible(true);
				}
			}
		});
		c.add(box1);
		btn8=new JButton("LandLease");
		btn8.setBounds(200,50,150,30);
		btn8.setBackground(Color.BLUE);
		btn8.setForeground(Color.WHITE);
		btn8.setFont(f1);
		btn8.setFocusable(false);
		btn8.setBorderPainted(false);
		btn8.setCursor(cur);
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
				LandLeasePage obj=new LandLeasePage();
				obj.setVisible(true);
			}
		});
		c.add(btn8);
		btn2=new JButton("Ongoing");
		btn2.setBounds(350,50,120,30);
		btn2.setBackground(Color.BLUE);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(f1);
		btn2.setFocusable(false);
		btn2.setBorderPainted(false);
		btn2.setCursor(cur);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent on)
			{
				dispose();
				Ongoing obj=new Ongoing();
				obj.setVisible(true);
			}
		});
		c.add(btn2);
		btn3=new JButton("Landmarks");
		btn3.setBounds(470,50,140,30);
		btn3.setBackground(Color.BLUE);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(f1);
		btn3.setFocusable(false);
		btn3.setBorderPainted(false);
		btn3.setCursor(cur);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent cm)
			{
				dispose();
				Completed obj=new Completed();
				obj.setVisible(true);
			}
		});
		c.add(btn3);
		btn4=new JButton("About us");
		btn4.setBounds(600,50,150,30);
		btn4.setBackground(Color.BLUE);
		btn4.setForeground(Color.WHITE);
		btn4.setFont(f1);
		btn4.setFocusable(false);
		btn4.setBorderPainted(false);
		btn4.setCursor(cur);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
				AboutUs obj=new AboutUs();
				obj.setVisible(true);
			}
		});
		c.add(btn4);
		btn5=new JButton();
		btn5.setIcon(new ImageIcon("Image/logout2.png"));
		btn5.setBounds(720,20,30,30);
		btn5.setBorderPainted(false);
		btn5.setCursor(cur);
		btn5.setToolTipText("Log Out");
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				dispose();
				LoginPage log=new LoginPage();
				log.setVisible(true);
			}
		});
		c.add(btn5);
		jp1=new JPanel();
		jp1.setBackground(Color.BLUE);
		jp1.setBounds(0,0,800,80);
		c.add(jp1);
		imglabel=new JLabel();
		imglabel.setIcon(new ImageIcon("Image/home3.jpg"));
		imglabel.setBounds(0,80,800,410);
		c.add(imglabel);
		txt1=new JLabel();
		txt1.setText("Contact us");
		txt1.setBounds(15,500,120,30);
		//txt1.setBackground(Color.BLACK);
		txt1.setForeground(Color.WHITE);
		txt1.setFont(f2);
		c.add(txt1);
		txt2=new JLabel();
		txt2.setText("01917563795");
		txt2.setBounds(15,530,120,30);
		txt2.setForeground(Color.WHITE);
		txt2.setFont(f2);
		c.add(txt2);
		txt3=new JLabel();
		txt3.setText("KBuilders@gmail.com");
		txt3.setBounds(15,550,200,30);
		txt3.setForeground(Color.WHITE);
		txt3.setFont(f2);
		c.add(txt3);
		txt4=new JLabel();
		txt4.setText("Follow us");
		txt4.setBounds(300,500,120,30);
		txt4.setForeground(Color.WHITE);
		txt4.setFont(f2);
		c.add(txt4);
		txt5=new JLabel();
		txt5.setText("ADDRESS :");
		txt5.setBounds(550,500,120,30);
		txt5.setForeground(Color.WHITE);
		txt5.setFont(f2);
		c.add(txt5);
		txt6=new JLabel();
		txt6.setText("Gulshan");
		txt6.setBounds(550,530,220,30);
		txt6.setForeground(Color.WHITE);
		txt6.setFont(f2);
		c.add(txt6);
		txt7=new JLabel();
		txt7.setText("Dhaka,Bangladesh");
		txt7.setBounds(550,555,220,30);
		txt7.setForeground(Color.WHITE);
		txt7.setFont(f2);
		c.add(txt7);
		imglabel1=new JLabel();
		imglabel1.setIcon(new ImageIcon("Image/fb.png"));
		imglabel1.setBounds(290,530,48,48);
		c.add(imglabel1);
		imglabel2=new JLabel();
		imglabel2.setIcon(new ImageIcon("Image/twitter.png"));
		imglabel2.setBounds(340,530,48,48);
		c.add(imglabel2);
		imglabel3=new JLabel();
		imglabel3.setIcon(new ImageIcon("Image/link.png"));
		imglabel3.setBounds(390,530,48,48);
		c.add(imglabel3);
		jp2=new JPanel();
		jp2.setBounds(0,490,800,200);
		jp2.setBackground(Color.BLACK);
		jp2.setForeground(Color.WHITE);
		c.add(jp2);
	}
	class Combobox extends JLabel implements ListCellRenderer
    {
        private String title1;

        public Combobox(String title)
        {
            title1 = title;
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean hasFocus)
        {
            if (index == -1 && value == null) setText(title1);
            else setText(value.toString());
            return this;
        }
	}
}