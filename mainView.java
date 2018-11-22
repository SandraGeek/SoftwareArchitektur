import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import java.awt.Color;

public class mainView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblDatum;
	private JLabel lblTarget;
	private JLabel lblAktuellWert;
	private JLabel lblVarianz;
	private JButton btnVarianzdiagrammAnzeigen;
	private JList list;
	private JLabel lblStationenAuswertung;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainView window = new mainView();
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
	public mainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 554, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Target setzen");
		btnNewButton.setBounds(12, 362, 151, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Varianz berechnen");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(373, 303, 151, 25);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(388, 29, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(388, 75, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.addKeyListener(new KeyAdapter() {
	
		});
		textField_2.setColumns(10);
		textField_2.setBounds(388, 123, 116, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent wert) {
				char vChar = wert.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    wert.consume();
                }
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(388, 172, 116, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(388, 228, 116, 22);
		frame.getContentPane().add(textField_4);
		
		JLabel lblStationId = new JLabel("Station ID");
		lblStationId.setBounds(259, 32, 56, 16);
		frame.getContentPane().add(lblStationId);
		
		lblDatum = new JLabel("Datum");
		lblDatum.setBounds(259, 78, 56, 16);
		frame.getContentPane().add(lblDatum);
		
		lblTarget = new JLabel("Target");
		lblTarget.setBounds(259, 126, 56, 16);
		frame.getContentPane().add(lblTarget);
		
		lblAktuellWert = new JLabel("Aktuell Wert");
		lblAktuellWert.setBounds(259, 175, 85, 16);
		frame.getContentPane().add(lblAktuellWert);
		
		lblVarianz = new JLabel("Varianz");
		lblVarianz.setBounds(259, 231, 56, 16);
		frame.getContentPane().add(lblVarianz);
		
		btnVarianzdiagrammAnzeigen = new JButton("Varianzdiagramm anzeigen");
		btnVarianzdiagrammAnzeigen.setBounds(335, 341, 189, 37);
		frame.getContentPane().add(btnVarianzdiagrammAnzeigen);
		
		list = new JList();
		list.setBounds(30, 31, 146, 278);
		frame.getContentPane().add(list);
		
		lblStationenAuswertung = new JLabel("Stationen Auswertung");
		lblStationenAuswertung.setBounds(165, 13, 195, 16);
		frame.getContentPane().add(lblStationenAuswertung);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(142, 37, 21, 270);
		frame.getContentPane().add(scrollBar);
		
		}
}
