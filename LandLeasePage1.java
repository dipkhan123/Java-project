package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class LandLeasePage1 extends JFrame {
    private Container c;
    private JLabel titleLabel, addressLabel, sizeLabel, durationLabel, rentLabel,pic;
    private JPanel headerPanel;
    private JButton backButton, paymentButton, next;
    private Color backgroundColor, headerColor;
    private Font titleFont, labelFont;
    private Cursor handCursor;

    public LandLeasePage1() 
	{
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Land Lease Information");
        setResizable(false);
		initcomponents();
	}
    void initcomponents()
	{
		c = getContentPane();
        c.setLayout(null);

        backgroundColor = new Color(52, 73, 94);
        headerColor = new Color(211, 84, 0);
        handCursor = new Cursor(Cursor.HAND_CURSOR);
        titleFont = new Font("Sherif", Font.BOLD, 28);
        labelFont = new Font("Sherif", Font.BOLD, 18);

        c.setBackground(backgroundColor);

        titleLabel = new JLabel("Land Lease Information");
        titleLabel.setBounds(250, 10, 400, 30);
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.WHITE);
        c.add(titleLabel);

        backButton = new JButton();
        backButton.setIcon(new ImageIcon("Image/prev.png"));
        backButton.setBounds(10, 0, 48, 48);
        backButton.setBackground(headerColor);
        backButton.setCursor(handCursor);
        backButton.setFocusable(false);
        backButton.setBorderPainted(false);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
				LandLeasePage obj=new LandLeasePage();
				obj.setVisible(true);
            }
        });
        c.add(backButton);
		
        headerPanel = new JPanel();
        headerPanel.setBounds(0, 0, 850, 50);
        headerPanel.setBackground(headerColor);
        c.add(headerPanel);
		
        addressLabel = new JLabel("Address: Plot 7, Road 2, Purbachal New Town");
        addressLabel.setBounds(20, 80, 450, 30);
        addressLabel.setFont(labelFont);
        addressLabel.setForeground(Color.WHITE);
        c.add(addressLabel);

        sizeLabel = new JLabel("Size: 7500 sqft");
        sizeLabel.setBounds(20, 120, 400, 30);
        sizeLabel.setFont(labelFont);
        sizeLabel.setForeground(Color.WHITE);
        c.add(sizeLabel);

        durationLabel = new JLabel("Lease Duration: 10 years");
        durationLabel.setBounds(20, 160, 400, 30);
        durationLabel.setFont(labelFont);
        durationLabel.setForeground(Color.WHITE);
        c.add(durationLabel);

        rentLabel = new JLabel("Rent Amount: 25,000 per month");
        rentLabel.setBounds(20, 200, 400, 30);
        rentLabel.setFont(labelFont);
        rentLabel.setForeground(Color.WHITE);
        c.add(rentLabel);
		
		pic=new JLabel();
		pic.setIcon(new ImageIcon("Image/land2.jpg"));
		pic.setBounds(100,250,600,330);
		c.add(pic);

        paymentButton = new JButton("Make Payment");
        paymentButton.setBounds(650,150,120, 30);
        paymentButton.setBackground(new Color(34, 167, 240));
        paymentButton.setForeground(Color.WHITE);
        paymentButton.setFocusable(false);
        paymentButton.setBorderPainted(false);
        paymentButton.setCursor(handCursor);
        paymentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				dispose();
                leasePay1 obj=new leasePay1();
				obj.setVisible(true);
            }
        });
        c.add(paymentButton);	
		
		next = new JButton("Next Page");
        next.setBounds(650,100,120, 30);
        next.setBackground(new Color(34, 167, 240));
        next.setForeground(Color.WHITE);
        next.setFocusable(false);
        next.setBorderPainted(false);
        next.setCursor(handCursor);
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				dispose();
                LandLeasePage2 obj=new LandLeasePage2();
				obj.setVisible(true);
            }
        });
        c.add(next);	
    }
}
