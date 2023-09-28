package Classes;
import Interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class RegistrationPage extends JFrame implements iReg{
	private Container c;
	private JPanel jp;
	private JLabel ptxt,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
	private JTextField input1,input2,input3,input4,input5,input6,input7,input8;
	private JPasswordField pass1,pass2;
	private Font f1,f2;
	private JTextArea ta;
	private JButton btn1,btn2,btn3;
	private JComboBox box1,box2;
	private JRadioButton rbtn1,rbtn2;
	private ButtonGroup grp;
	private JCheckBox cbox1,cbox2;
	private Cursor cursor;
	private Color c1,c2;
	public RegistrationPage()
	{
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,800);
		setLocationRelativeTo(null);
		setTitle("www.khanBuilders.com/registration");
		setResizable(false);
		initcomponents();
	}
	//@override
	public void initcomponents()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.LIGHT_GRAY);
		c1=new Color(34,167,240);
		c2=new Color(242,38,19);
		f1=new Font("Sherif",Font.BOLD,20);
		f2=new Font("Aerial",Font.PLAIN,20);
		cursor=new Cursor(Cursor.HAND_CURSOR);
		String religion[]={"Islam","hinduism","buddhism","christianity","other"};
		String prof[]={"Engineer","Doctor","Lawyer","Other"};
		//jpanel
		jp=new JPanel();
		jp.setBounds(0,15,600,35);
		jp.setBackground(Color.BLUE);
		ptxt=new JLabel();
		ptxt.setText("REGISTRATION");
		ptxt.setBounds(100,25,60,30);
		ptxt.setFont(new Font("Bell MT",Font.BOLD,20));
		ptxt.setForeground(Color.WHITE);
		jp.add(ptxt);
		c.add(jp);
		//Jlabel
		txt1=new JLabel();
		txt1.setText("Name");
		txt1.setBounds(50,80,100,30);
		txt1.setForeground(Color.BLUE);
		txt1.setFont(f1);
		c.add(txt1);
		txt2=new JLabel();
		txt2.setText("Religion");
		txt2.setBounds(50,130,100,30);
		txt2.setForeground(Color.BLUE);
		txt2.setFont(f1);
		c.add(txt2);
		txt3=new JLabel();
		txt3.setText("Gender");
		txt3.setBounds(50,180,100,30);
		txt3.setForeground(Color.BLUE);
		txt3.setFont(f1);
		c.add(txt3);
		txt4=new JLabel();
		txt4.setText("Profession");
		txt4.setBounds(50,230,150,30);
		txt4.setForeground(Color.BLUE);
		txt4.setFont(f1);
		c.add(txt4);
		txt5=new JLabel();
		txt5.setText("Birthdate");
		txt5.setBounds(50,280,150,30);
		txt5.setForeground(Color.BLUE);
		txt5.setFont(f1);
		c.add(txt5);
		txt6=new JLabel();
		txt6.setText("Phone NO");
		txt6.setBounds(50,330,150,30);
		txt6.setForeground(Color.BLUE);
		txt6.setFont(f1);
		c.add(txt6);
		txt7=new JLabel();
		txt7.setText("Gmail");
		txt7.setBounds(50,380,150,30);
		txt7.setForeground(Color.BLUE);
		txt7.setFont(f1);
		c.add(txt7);
		txt8=new JLabel();
		txt8.setText("Set Password");
		txt8.setBounds(50,430,150,30);
		txt8.setForeground(Color.BLUE);
		txt8.setFont(f1);
		c.add(txt8);
		txt9=new JLabel();
		txt9.setText("Retype Password");
		txt9.setBounds(50,500,180,30);
		txt9.setForeground(Color.BLUE);
		txt9.setFont(f1);
		c.add(txt9);
		txt10=new JLabel();
		txt10.setText("Address");
		txt10.setBounds(50,570,100,30);
		txt10.setForeground(Color.BLUE);
		txt10.setFont(f1);
		c.add(txt10);
		//inputfield
		input1=new JTextField();
		input1.setBounds(230,80,300,30);
		input1.setBackground(Color.WHITE);
		input1.setForeground(Color.BLACK);
		input1.setHorizontalAlignment(JTextField.CENTER);
		input1.setFont(f2);
		c.add(input1);
		input7=new JTextField();
		input7.setBounds(230,130,300,30);
		input7.setBackground(Color.WHITE);
		input7.setForeground(Color.BLACK);
		input7.setHorizontalAlignment(JTextField.CENTER);
		input7.setFont(f2);
		c.add(input7);
		rbtn1=new JRadioButton("Male");
		rbtn1.setBounds(230,180,90,30);
		rbtn1.setFont(new Font("Aerial",Font.BOLD,16));
		rbtn1.setBackground(Color.LIGHT_GRAY);
		rbtn1.setForeground(Color.BLUE);
		rbtn1.setCursor(cursor);
		c.add(rbtn1);
		rbtn2=new JRadioButton("Female");
		rbtn2.setBounds(320,180,90,30);
		rbtn2.setFont(new Font("Aerial",Font.BOLD,16));
		rbtn2.setBackground(Color.LIGHT_GRAY);
		rbtn2.setForeground(Color.BLUE);
		rbtn2.setCursor(cursor);
		c.add(rbtn2);
		grp=new ButtonGroup();
		grp.add(rbtn1);
		grp.add(rbtn2);
		box2=new JComboBox(prof);
		box2.setBounds(230,230,100,30);
		box2.setBackground(Color.WHITE);
		box2.setForeground(Color.BLACK);
		box2.setFont(new Font("Aerial",Font.PLAIN,16));
		c.add(box2);
		input2=new JTextField();
		input2.setBounds(230,280,300,30);
		input2.setBackground(Color.WHITE);
		input2.setForeground(Color.BLACK);
		input2.setHorizontalAlignment(JTextField.CENTER);
		input2.setFont(f2);
		c.add(input2);
		input3=new JTextField();
		input3.setBounds(230,330,300,30);
		input3.setBackground(Color.WHITE);
		input3.setForeground(Color.BLACK);
		input3.setHorizontalAlignment(JTextField.CENTER);
		input3.setFont(f2);
		c.add(input3);
		input4=new JTextField();
		input4.setBounds(230,380,300,30);
		input4.setBackground(Color.WHITE);
		input4.setForeground(Color.BLACK);
		input4.setHorizontalAlignment(JTextField.CENTER);
		input4.setFont(f2);
		c.add(input4);
		pass1=new JPasswordField();
		pass1.setBounds(230,430,300,30);
		pass1.setBackground(Color.WHITE);
		pass1.setForeground(Color.BLACK);
		pass1.setHorizontalAlignment(JTextField.CENTER);
		pass1.setFont(f2);
		pass1.setEchoChar('*');
		c.add(pass1);
		cbox1=new JCheckBox();
		cbox1.setText("show password");
		cbox1.setBounds(240,465,150,20);
		cbox1.setBackground(Color.LIGHT_GRAY);
		cbox1.setForeground(Color.BLUE);
		cbox1.setFont(new Font("Aerial",Font.BOLD,14));
		cbox1.setCursor(cursor);
		cbox1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent cb1)
			{
				if(cbox1.isSelected())
				{
					pass1.setEchoChar((char)0);
				}
				else
				{
					pass1.setEchoChar('*');
				}
			}
		});
		c.add(cbox1);
		pass2=new JPasswordField();
		pass2.setBounds(230,500,300,30);
		pass2.setBackground(Color.WHITE);
		pass2.setForeground(Color.BLACK);
		pass2.setHorizontalAlignment(JTextField.CENTER);
		pass2.setFont(f2);
		pass2.setEchoChar('*');
		c.add(pass2);
		cbox2=new JCheckBox();
		cbox2.setText("show password");
		cbox2.setBounds(240,535,150,20);
		cbox2.setBackground(Color.LIGHT_GRAY);
		cbox2.setForeground(Color.BLUE);
		cbox2.setFont(new Font("Aerial",Font.BOLD,14));
		cbox2.setCursor(cursor);
		cbox2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent cb2)
			{
				if(cbox2.isSelected())
				{
					pass2.setEchoChar((char)0);
				}
				else
				{
					pass2.setEchoChar('*');
				}
			}
		});
		c.add(cbox2);
		ta=new JTextArea();
		ta.setBounds(230,570,300,90);
		ta.setBackground(Color.WHITE);
		ta.setForeground(Color.BLACK);
		ta.setFont(f2);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		c.add(ta);
		btn1=new JButton("Clear");
		btn1.setBounds(230,700,80,35);
		btn1.setBackground(c2);
		btn1.setForeground(Color.WHITE);
		btn1.setCursor(cursor);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent C)
			{
				input1.setText("");
				input2.setText("");
				input3.setText("");
				input4.setText("");
				pass1.setText("");
				pass2.setText("");
				ta.setText("");
			}
		});
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		c.add(btn1);
		btn2=new JButton("Submit");
		btn2.setBounds(380,700,80,35);
		btn2.setBackground(c1);
		btn2.setForeground(Color.WHITE);
		btn2.setCursor(cursor);
		btn2.setFocusable(false);
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent S)
			{
				String str1=input1.getText();
		        String str2=input2.getText();
		        String str3=input3.getText();
		        String str4=input4.getText();
		        String str5=pass1.getText();
				String str6=pass2.getText();
				String str7=input7.getText();
				String str8=box2.getSelectedItem().toString();
				
		        if(str1.equals("")||str2.equals("")||str3.equals("")||str4.equals("")||str5.equals("")||str6.equals("")||str7.equals(""))
				{
					JOptionPane.showMessageDialog(null,"fill up all the fields","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(str3.length()!=11)
				{
					JOptionPane.showMessageDialog(null,"unknown phone operator","Error",JOptionPane.ERROR_MESSAGE);
				}					
				else
				{
						if(str5.equals(str6))
						{
							boolean check=false;
							for( int i=0;i<str4.length();i++)
		{
			if(str4.charAt(i)=='@')
			{
				for(int j=(i+1);j<str4.length();j++)
				{
					if(str4.charAt(j)=='.')
					{
						check=true;
					}
				}
					
			}
		}
		if(check==true)
	    {
					      try{
						  FileWriter writer=new FileWriter("Data/data.txt",true);
				          writer.write(str4+" "+str5);
						  writer.close();
						  }
						  catch(IOException e)
						  {
							  JOptionPane.showMessageDialog(null,"error occured while writing to file","Error",JOptionPane.ERROR_MESSAGE);
						  }
				          try{
						  FileWriter writer=new FileWriter("Data/info.txt",true);
				          writer.write("Name : "+str1+"\n\n"+"Religion : "+str7+"\n\n"+"Birthdate : "+str2+"\n\n"+"Profession : "+str8+"\n\n"+"Phone NO : "+str3+"\n\n"+"Gmail : "+str4+"\n\n"+"Password : "+str5+"\n\n");
						  writer.close();
						  }
						  catch(IOException e)
						  {
							  JOptionPane.showMessageDialog(null,"error occured while writing to file","Error",JOptionPane.ERROR_MESSAGE);
						  }
						  JOptionPane.showMessageDialog(null,"sign-up successful","Success",JOptionPane.INFORMATION_MESSAGE);
					      dispose();
					      LoginPage log=new LoginPage();
					      log.setVisible(true);
					    }
						else
						{
							JOptionPane.showMessageDialog(null,"invalid Gmail","Error",JOptionPane.ERROR_MESSAGE);
						}
						}
						else
						{
							JOptionPane.showMessageDialog(null,"password doesn't match","Error",JOptionPane.ERROR_MESSAGE);
						}	
				}
			}
		});
		c.add(btn2);
		btn3=new JButton("Prev.");
		btn3.setBounds(80,700,80,35);
		btn3.setBackground(c2);
		btn3.setForeground(Color.WHITE);
		btn3.setCursor(cursor);
		btn3.setFocusable(false);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent P)
			{
				dispose();
				LoginPage log=new LoginPage();
		        log.setVisible(true);
			}
		});
		c.add(btn3);
	}
	public void clearFields() 
	{
                input1.setText("");
                input2.setText("");
                input3.setText("");
                input4.setText("");
                pass1.setText("");
                pass2.setText("");
                input7.setText("");
                box1.setSelectedIndex(0);
                box2.setSelectedIndex(0);
                grp.clearSelection();
                cbox1.setSelected(false);
                cbox2.setSelected(false);
    }
}

		
	