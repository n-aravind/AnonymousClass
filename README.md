# AnonymousClass
```
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
        ActionListener al = new MyActionListener();
        button.addActionListener(al);

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

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args)
    {
        JButtonListenerExample example = new JButtonListenerExample();
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                example.displayJFrame();
            }
        });
    }
}
```
##Assignment 
- Change the code to remove the MyActionListener inner class and make it an anonymous class parameter to button.addActionListener method.