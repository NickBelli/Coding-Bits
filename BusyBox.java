import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;

public class BusyBox {

	private JFrame frame;
	private JTabbedPane myPane;
	private JScrollPane myScrollPane;
	private JList<String> myList;
	private DefaultListModel<String> langList;
	private JButton myButton;
	private JTextField myTextField;
	private JComboBox<String> myComboBox;
	private JCheckBox myCheckBox;
	private JRadioButton myRadioButton1;
	private JRadioButton myRadioButton2;
	private JRadioButton myRadioButton3;
	private JTable myTable;
	private JLabel myPicture1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusyBox window = new BusyBox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BusyBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 51, 0));
		frame.setBounds(700, 500, 683, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		/**
		 * Create the JTabbedPane with initial text in the Main Tab.
		 */
		myPane = new JTabbedPane(JTabbedPane.TOP);
		myPane.setForeground(new Color(102, 51, 0));
		myPane.setBackground(new Color(51, 153, 51));
		myPane.setBounds(10, 11, 200, 200);
		frame.getContentPane().add(myPane);
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(51, 153, 51));
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(51, 153, 51));
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(51, 153, 51));
		myPane.add("Main", panel1);
		myPane.add("Options", panel2);
		myPane.add("Help", panel3);
		JTextArea myTextArea = new JTextArea(10, 17);
		myTextArea.setBackground(new Color(51, 153, 51));
		myTextArea.setForeground(new Color(255, 255, 255));
		myTextArea.setWrapStyleWord(true);
		myTextArea.setLineWrap(true);
		myTextArea.append("Thanks for checking out this Busy Box!");
		panel1.add(myTextArea);

		/**
		 * Create the "Rick Astley" Scroll Area.
		 */
		JTextArea myScrollArea = new JTextArea(15, 8);
		myScrollArea.append("Never\n");
		myScrollArea.append("Gonna\n");
		myScrollArea.append("Give\n");
		myScrollArea.append("You\n");
		myScrollArea.append("Up\n");
		myScrollArea.append("Never\n");
		myScrollArea.append("Gonna\n");
		myScrollArea.append("Let\n");
		myScrollArea.append("You\n");
		myScrollArea.append("Down\n");
		
		myScrollPane = new JScrollPane(myScrollArea);
		myScrollPane.setViewportBorder(new BevelBorder(BevelBorder.RAISED, new Color(102, 153, 51),
				new Color(102, 51, 0), new Color(102, 153, 51), new Color(102, 51, 0)));
		myScrollPane.setBounds(230, 30, 200, 85);
		frame.getContentPane().add(myScrollPane);

		/**
		 * Create the "Best Programming Languages" Selection List
		 */
		langList = new DefaultListModel<>();
		langList.addElement("Java");
		langList.addElement("C#");
		langList.addElement("SQL");
		langList.addElement("Python");
		langList.addElement("C");
		langList.addElement("C++");
		
		myList = new JList<>(langList);
		myList.setBorder(
				new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 153, 0), new Color(102, 51, 0)),
						"Best Programming Languages", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		myList.setBounds(445, 11, 200, 200);
		frame.getContentPane().add(myList);

		/**
		 * Create the Click Dare button
		 */
		myButton = new JButton("Click Me If You Dare.");
		myButton.setBounds(230, 120, 200, 25);
		frame.getContentPane().add(myButton);

		/**
		 * Create the Trap Text Field
		 */
		myTextField = new JTextField("Don't click it! It's a trap!");
		myTextField.setBounds(230, 152, 200, 25);
		frame.getContentPane().add(myTextField);

		/**
		 * Create Combo Box and Selections
		 */
		String gamingSystem[] = { "XBOX One", "Playstation 4", "PC", "Switch", "I don't play games" };
		myComboBox = new JComboBox(gamingSystem);
		myComboBox.setBounds(230, 185, 200, 25);
		frame.getContentPane().add(myComboBox);

		/**
		 * Create CheckBox
		 */
		myCheckBox = new JCheckBox("Check if you like Dogs.");
		myCheckBox.setBounds(10, 220, 200, 25);
		myCheckBox.setBackground(new Color(102, 51, 0));
		myCheckBox.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(myCheckBox);

		/**
		 * Create Button Group and add Radio Buttons
		 */
		myRadioButton1 = new JRadioButton("Mountains");
		myRadioButton2 = new JRadioButton("Beach");
		myRadioButton3 = new JRadioButton("City");

		myRadioButton1.setBounds(445, 220, 200, 25);
		myRadioButton1.setBackground(new Color(102, 51, 0));
		myRadioButton1.setForeground(new Color(255, 255, 255));

		myRadioButton2.setBounds(445, 250, 200, 25);
		myRadioButton2.setBackground(new Color(102, 51, 0));
		myRadioButton2.setForeground(new Color(255, 255, 255));

		myRadioButton3.setBounds(445, 280, 200, 25);
		myRadioButton3.setBackground(new Color(102, 51, 0));
		myRadioButton3.setForeground(new Color(255, 255, 255));
		
		ButtonGroup myButtonGroup = new ButtonGroup();
		myButtonGroup.add(myRadioButton1);
		myButtonGroup.add(myRadioButton2);
		frame.getContentPane().add(myRadioButton1);
		frame.getContentPane().add(myRadioButton2);
		frame.getContentPane().add(myRadioButton3);
		
		/**
		 * Create Table and Populate with Information
		 */
		
		String myTableData[][] = { {"1", "Rock Climbing"},
				{"2", "White Water Rafting"},
				{"3", "Ziplining"},
				{"4", "Backpacking"},};
		String columnNames[] = {"ID", "Activity"};
		myTable = new JTable(myTableData, columnNames);
		myTable.setFont(new Font("Arial Black", Font.PLAIN, 12));
		myTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Rock Climbing"},
				{"2", "White Water Rafting"},
				{"3", "Ziplining"},
				{"4", "Backpacking"},
			},
			new String[] {
				"ID", "Activity"
			}
		));
		myTable.getColumnModel().getColumn(0).setPreferredWidth(24);
		myTable.getColumnModel().getColumn(1).setPreferredWidth(111);
		myTable.setBounds(10, 250, 200, 64);
		frame.getContentPane().add(myTable);
		
		/**
		 * Add Image to the bottom using the JLabel Method
		 */
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("CanyonFalls.JPG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myPicture1 = new JLabel(new ImageIcon(myPicture));
		myPicture1.setBounds(10, 275, 200, 200);
		frame.add(myPicture1);
	}

}
