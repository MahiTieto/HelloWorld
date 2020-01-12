import java.awt.FlowLayout;
 
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
 
public class CreateGroupedRadioButtonsWithButtonGroup extends JFrame {
 
    private static final long serialVersionUID = 1L;
 
    public CreateGroupedRadioButtonsWithButtonGroup() {
 
        // set flow layout for the frame
        this.getContentPane().setLayout(new FlowLayout());
 
        JRadioButton Insert = new JRadioButton("Insert");
        JRadioButton Search = new JRadioButton("Search");
 
        Insert.setSelected(true);
 
        ButtonGroup buttonGroup = new ButtonGroup();
 
        //add radio buttons
        buttonGroup.add(Insert);
        buttonGroup.add(Search);
 
        add(Insert);
        add(Search);
 
    }
 
    private static void createAndShowGUI() {
 
  //Create and set up the window.
 
  JFrame frame = new CreateGroupedRadioButtonsWithButtonGroup();
 
  //Display the window.
 
  frame.pack();
 
  frame.setVisible(true);
 
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
 
    public static void main(String[] args) {
 
  //Schedule a job for the event-dispatching thread:
 
  //creating and showing this application's GUI.
 
  javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
public void run() {
 
    createAndShowGUI(); 
 
}
 
  });
    }
 
}