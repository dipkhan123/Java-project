package Classes;
import Interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class LoginPage extends JFrame implements iLogin{
	private Container c;
	private JLabel imglabel,txt1,txt2,txt3,txt4,head,sub;
	private ImageIcon img;
	private Font f1,f2,f3,f4,f5;
	private JTextField input1;
	private JPasswordField pass;
	private JButton btn1,btn2,btn3,btn4;
	private JCheckBox box1;
	private Cursor cursor;
	private Color c1,c2;
	public LoginPage()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850,500);
		setLocationRelativeTo(null);
		setTitle("www.khanBuilders.com/login");
		setResizable(false);
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.LIGHT_GRAY);
		c1=new Color(34,167,240);
		c2=new Color(242,38,19);
		imglabel=new JLabel();
		imglabel.setIcon(new ImageIcon("Image/realestatelogo.png"));
		imglabel.setBounds(0,0,400,500);
		c.add(imglabel);
		cursor=new Cursor(Cursor.HAND_CURSOR);
		f1=new Font("Cambira",Font.BOLD,22);
		f2=new Font("Sherif",Font.PLAIN,18);
		f3=new Font("Castellar",Font.BOLD,28);
		f4=new Font("Bell MT",Font.PLAIN,22);
		f5=new Font("Calibri",Font.BOLD,16);
		head=new JLabel();
		head.setText("LOGIN");
		head.setBounds(530,35,350,50);
		head.setFont(f3);
		head.setForeground(Color.BLUE);
		c.add(head);
		sub=new JLabel();
		sub.setText("where dreams come home");
		sub.setBounds(500,40,350,50);
		sub.setFont(f4);
		sub.setForeground(Color.BLUE);
		//c.add(sub);
		txt1=new JLabel();
		txt1.setText("Gmail");
		txt1.setBounds(450,100,250,60);
		txt1.setForeground(Color.BLUE);
	    txt1.setToolTipText("must be a valid mail address");
		txt1.setFont(f1);
		c.add(txt1);
		input1=new JTextField();
		input1.setBounds(450,150,250,35);
		input1.setBackground(Color.WHITE);
		input1.setForeground(Color.BLACK);
		input1.setFont(f2);
		input1.setHorizontalAlignment(JTextField.CENTER);
		c.add(input1);
		txt2=new JLabel();
		txt2.setText("Password");
		txt2.setBounds(450,180,250,60);
		txt2.setForeground(Color.BLUE);
		txt2.setToolTipText("minimum 8 characters");
		txt2.setFont(f1);
		c.add(txt2);
		pass=new JPasswordField();
		pass.setHorizontalAlignment(JPasswordField.CENTER);
		pass.setBounds(450,230,250,35);
		pass.setBackground(Color.WHITE);
		pass.setForeground(Color.BLACK);
		pass.setFont(f2);
		pass.setEchoChar('*');
		c.add(pass);
		box1=new JCheckBox();
		box1.setText("show password");
		box1.setBounds(700,230,120,30);
		box1.setFont(new Font("Aerial",Font.BOLD,12));
		box1.setBackground(Color.LIGHT_GRAY);
		box1.setForeground(Color.BLUE);
		box1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent cb)
			{
				if(box1.isSelected())
				{
					pass.setEchoChar((char)0);
				}
				else
				{
					pass.setEchoChar('*');
				}
			}
		});
		c.add(box1);
		btn1=new JButton("Clear");
		btn1.setBackground(c2);
		btn1.setForeground(Color.WHITE);
		btn1.setBounds(430,300,80,40);
		btn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent B)
				{
					clearFields();
				}
			});
		btn1.setCursor(cursor);
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		c.add(btn1);
		btn2=new JButton("Login");
		btn2.setBounds(530,300,80,40);
		btn2.setBackground(c1);
		btn2.setForeground(Color.WHITE);
		btn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent L)
				{
					String gmail=input1.getText();
					String password=pass.getText();
					login(gmail,password);
				}
			});
		btn2.setCursor(cursor);
		btn2.setFocusable(false);
		btn2.setBorderPainted(false);
		c.add(btn2);
		txt4=new JLabel();
		txt4.setText("Don't have an account?");
		txt4.setBounds(500,350,350,35);
		txt4.setBackground(Color.LIGHT_GRAY);
		txt4.setForeground(Color.BLUE);
		txt4.setFont(f5);
		c.add(txt4);
		btn3=new JButton("click here to sign-up");
		btn3.setFont(f5);
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.BLUE);
		btn3.setBounds(445,380,250,35);
		btn3.setFocusable(false);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent R)
			{
				signUp();
			}
		});
		btn3.setCursor(cursor);
		c.add(btn3);
		btn4=new JButton("Exit");
		btn4.setBounds(630,300,80,40);
		btn4.setBackground(c2);
		btn4.setForeground(Color.WHITE);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ex)
			{
				exit();
			}
		});
		btn4.setCursor(cursor);
		btn4.setFocusable(false);
		btn4.setBorderPainted(false);
		c.add(btn4);
	}
    
    @Override
    public void clearFields() {
        input1.setText(""); 
        pass.setText(""); 
    }

    @Override
    public void login(String gmail, String password) {
                    
					boolean match=false;
					try
					{
					FileReader reader=new FileReader("Data/data.txt");
					BufferedReader br=new BufferedReader(reader);
					String str;
					while ((str=br.readLine())!=null)
					{
						if(str.equals(gmail+" "+password))
						{
							match=true;
							break;
						}
					}
					reader.close();
					}
					catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Data file not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    } 
					catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error reading data file.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
					if(match==true)
					{
						
						JOptionPane.showMessageDialog(null,"Welcome to Khan Builders","HomePage",JOptionPane.INFORMATION_MESSAGE);
						dispose();
						HomePage1 H1=new HomePage1();
		                H1.setVisible(true);
		                
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid Information","LoginPage",JOptionPane.ERROR_MESSAGE);
					}
    }

    @Override
    public void signUp() {
        dispose();
        RegistrationPage reg = new RegistrationPage();
        reg.setVisible(true);
    }

    @Override
    public void exit() {
        dispose();
    }
}
		
		