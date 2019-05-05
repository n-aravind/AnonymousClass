import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonListenerExample
{
    private JFrame frame;

    public void displayJFrame()
    {
        frame = new JFrame("Our JButton listener example");

        JButton button = new JButton("Click Me");

        // add the listener to the jbutton to handle the "pressed" event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a1) {
                System.out.println("" + System.currentTimeMillis());
            }
        });

        // put the button on the frame
        frame.getContentPane().setLayout(new FlowLayout());
        frame.add(button);

        // set up the jframe, then display it
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        final JButtonListenerExample example = new JButtonListenerExample();
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                example.displayJFrame();
            }
        });
    }
}