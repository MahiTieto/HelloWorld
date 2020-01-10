import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;

	public class ErrorLog {
		  public static void main(String[] args) {
		  Frame frm=new Frame("ERROR LOG");
		  Label lbl = new Label("ENTER DETAILS ACCORDINGLY");
		  frm.add(lbl);
		  frm.setSize(550,250);
		  frm.setVisible(true);
		  frm.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
		  System.exit(0);
		  }
		  });
		  Panel p = new Panel();
		  Panel p1 = new Panel();
		  JButton b=new JButton("SELECT");  
		    b.setBounds(200,60,75,20);  
		    String languages[]={"CAMS","BIC","AUTOGIRO","UP","TILLBIC"};        
		    final JComboBox cb=new JComboBox(languages);    
		      
		  Label jFirstName = new Label("INIT Number");
		  TextField lFirstName = new TextField(20);
		  Label jLastName =new Label("ARS Number");
		  TextField lLastName=new TextField(20);
		  p.setLayout(new GridLayout(5,1));
		  p.add(cb); 
		  p.add(b);     
		  p.setVisible(true);       
		  p.add(jFirstName);
		  p.add(lFirstName);
		  p.add(jLastName);
		  p.add(lLastName);
		  Button Submit=new Button("Submit");
		  p.add(Submit);
		  p1.add(p);
		  frm.add(p1,BorderLayout.AFTER_LAST_LINE);
		  }
		}
