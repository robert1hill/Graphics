import javax.swing.JFrame;

public class MyFrame extends JFrame
{

    private MyPanel panel;
    private final int WIDTH = 300;
    private final int LENGTH = 400;
    
    public MyFrame(String title)
    {
        setTitle(title);
        setSize(WIDTH, LENGTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public void paintLine()
    {
        panel = new LineDemoPanel();
        add(panel);
        setVisible(true);
    }
    
    
    public static void main(String[] args)
    {
        
        MyFrame frame = new MyFrame("Hello");
        frame.paintLine();

    }

}
