import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SnowTest
{

    public static void showInputDialogs()
    {
      //This is a modal container, meaning that it locks me out
        // from using the other windows while this is open.
        String input1 = JOptionPane.showInputDialog(null, "Error Messages are Awesome!!!", "fly birdy", JOptionPane.ERROR_MESSAGE);
        String input2 = JOptionPane.showInputDialog(null, "Warning Messages are Awesome!!!", input1, JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showInputDialog(null, "Guess What!!!", "fly birdy", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showInputDialog(null, "uh....", "sad birdy", JOptionPane.PLAIN_MESSAGE);
    }
    
    public static void showMessageDialogs()
    {
      //This is a modal container, meaning that it locks me out
        // from using the other windows while this is open.
        JOptionPane.showMessageDialog(null, "Error Messages are Awesome!!!", "fly birdy", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Warning Messages are Awesome!!!", "fly birdy", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Guess What!!!", "fly birdy", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "uh....", "sad birdy", JOptionPane.PLAIN_MESSAGE);
    }
    
    public static void showConfirmDialogs()
    {
      //This is a modal container, meaning that it locks me out
        // from using the other windows while this is open.
        int input = JOptionPane.showConfirmDialog(null, "???????");
        switch (input)
        {
            case JOptionPane.NO_OPTION:
                System.out.println("no");
                break;
            case JOptionPane.YES_OPTION:
                System.out.println("yes");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("quitter");
                break;
            default:
                break;
        }
        //JOptionPane.showMessageDialog(null, "Warning Messages are Awesome!!!", "fly birdy", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Guess What!!!", "fly birdy", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "uh....", "sad birdy", JOptionPane.PLAIN_MESSAGE);
    }
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Snowy Day");
        
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //showMessageDialogs();
        //showInputDialogs();
        showConfirmDialogs();

        
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        
        JButton b1 = new JButton("chuck first half");
        JButton b2 = new JButton("click second half");
        
        frame.add(b1);
        frame.add(b2);
        
        frame.pack();
        
        

    }

}
