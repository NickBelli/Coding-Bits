import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyTestJava {

	private JFrame frame;
	private JTextField myTextBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyTestJava window = new KeyTestJava();
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
	public KeyTestJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		myTextBox = new JTextField();

		/**
		 * Create a key listener and handle when the Up or Down key is pressed.
		 */
		myTextBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					System.out.println("I pressed Up!");
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					System.out.println("I pressed Down!");
				}
			}
		});
		myTextBox.setHorizontalAlignment(SwingConstants.CENTER);
		myTextBox.setText("Click in here and press the Up Key or the Down Key.");
		myTextBox.setBounds(69, 84, 290, 81);
		frame.getContentPane().add(myTextBox);
		myTextBox.setColumns(10);
	}
}
