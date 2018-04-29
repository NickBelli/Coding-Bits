import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseTestJava {

	private JFrame frame;

	/**
	 * Class level variables for X and Y location storage
	 * @param myXLocation
	 * @param myYLocation
	 */
	int myXLocation;
	int myYLocation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseTestJava window = new MouseTestJava();
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
	public MouseTestJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton myOneButton = new JButton("One Button to Rule Them All. Click Me!");
		
		/**
		 * Add a listener and action for Mouse Moved events
		 * stored in class level variables
		 */
		myOneButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent me) {
				myXLocation = me.getX();
				myYLocation = me.getY();
				System.out.println("The mouse was moved to X:Y " + myXLocation + " : " + myYLocation);
			}
		});
		
		/**
		 * Add a listener and action for Mouse Clicked events
		 * stored in class level variables
		 */
		myOneButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent mc) {
				myXLocation = mc.getX();
				myYLocation = mc.getY();
				System.out.println("Mouse click at X: " + myXLocation + " Y: " + myYLocation);
			}

			/**
			 * Add a listener and action for Mouse Pressed events
			 * stored in class level variables
			 */
			@Override
			public void mousePressed(MouseEvent mp) {
				myXLocation = mp.getX();
				myYLocation = mp.getY();
				System.out.println("Mouse pressed at X: " + myXLocation + " Y: " + myYLocation);
			}
			
			/**
			 * Add a listener and action for Mouse Released events
			 * stored in class level variables
			 */
			@Override
			public void mouseReleased(MouseEvent mr) {
				myXLocation = mr.getX();
				myYLocation = mr.getY();
				System.out.println("Mouse released at X: " + myXLocation + " Y: " + myYLocation);
			}
		});
		myOneButton.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(myOneButton);
	}
}
