import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.CompoundBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;

public class ErrorLog extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new CompoundBorder());
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BIC", "CAMS", "AUTOGIRO", "TILLBIC", "UP", "FASIT"}));
		comboBox.setToolTipText("Select an Application");
		comboBox.setBounds(186, 13, 136, 22);
		contentPane.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(186, 65, 116, 22);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel = new JLabel("Date");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(12, 65, 87, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Job");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(12, 117, 103, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(186, 117, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Program");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_2.setBounds(12, 169, 118, 32);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 169, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Select App");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_3.setBounds(12, 13, 129, 30);
		contentPane.add(lblNewLabel_3);
	
		ButtonGroup buttonGroup = new ButtonGroup();
		
		JRadioButton Insert = new JRadioButton("Insert");
		Insert.setBounds(686, 12, 127, 25);
		contentPane.add(Insert);
        JRadioButton Search = new JRadioButton("Search");
        Search.setBounds(686, 65, 127, 25);
        contentPane.add(Search);
        
		buttonGroup.add(Insert);
        buttonGroup.add(Search);
 
        getContentPane().add(Insert);
        getContentPane().add(Search);
 
        Insert.setSelected(true);
        
        JLabel lblNewLabel_4 = new JLabel("Error Code");
        lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_4.setBounds(12, 221, 129, 32);
        contentPane.add(lblNewLabel_4);
        
        textField_2 = new JTextField();
        textField_2.setBounds(186, 221, 116, 22);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        JLabel lblNewLabel_5 = new JLabel("INIT");
        lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_5.setBounds(12, 273, 118, 32);
        contentPane.add(lblNewLabel_5);
        
        textField_3 = new JTextField();
        textField_3.setBounds(186, 273, 116, 22);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblNewLabel_6 = new JLabel("ARS");
        lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_6.setBounds(12, 325, 87, 32);
        contentPane.add(lblNewLabel_6);
        
        textField_4 = new JTextField();
        textField_4.setBounds(186, 325, 116, 22);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        JLabel lblNewLabel_7 = new JLabel("Solution");
        lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_7.setBounds(12, 377, 103, 32);
        contentPane.add(lblNewLabel_7);
        
        textField_5 = new JTextField();
        textField_5.setBounds(186, 377, 627, 163);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        
        JLabel lblNewLabel_8 = new JLabel("Problem Desc.");
        lblNewLabel_8.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_8.setBounds(354, 169, 166, 32);
        contentPane.add(lblNewLabel_8);
        
        textField_6 = new JTextField();
        textField_6.setBounds(354, 221, 459, 131);
        contentPane.add(textField_6);
        textField_6.setColumns(10);
        
        
		

	}
		
}
