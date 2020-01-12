import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.CompoundBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.JTextField;

public class ErrorLog extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorLog frame = new ErrorLog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ErrorLog() {
		setTitle("Error Log");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(39, 45, 1, 1);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new CompoundBorder());
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BIC", "CAMS", "AUTOGIRO", "TILLBIC", "UP", "FASIT"}));
		comboBox.setToolTipText("Select an Application");
		comboBox.setBounds(12, 13, 136, 22);
		contentPane.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(182, 65, 118, 22);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(12, 65, 87, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Job");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(12, 124, 103, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(184, 124, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
