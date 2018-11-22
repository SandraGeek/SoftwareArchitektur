import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;

public class AdminView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView window = new AdminView();
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
	public AdminView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("Bestätigen");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOk.setBounds(478, 339, 97, 25);
		frame.getContentPane().add(btnOk);
		
		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.setBounds(12, 339, 97, 25);
		frame.getContentPane().add(btnZurck);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char vChar = evt.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    evt.consume();
                }
			}
		});
		textField.setBounds(368, 122, 139, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTargetAnsetzen = new JLabel("Target ansetzen");
		lblTargetAnsetzen.setBounds(382, 84, 125, 25);
		frame.getContentPane().add(lblTargetAnsetzen);
		
		JList list = new JList();
		list.setBounds(29, 49, 139, 258);
		frame.getContentPane().add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(145, 49, 21, 258);
		frame.getContentPane().add(scrollBar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(328, 26, 163, 36);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAusgewhlteStation = new JLabel("Ausgew\u00E4hlte Station");
		lblAusgewhlteStation.setBounds(188, 50, 156, 16);
		frame.getContentPane().add(lblAusgewhlteStation);
	}
}
