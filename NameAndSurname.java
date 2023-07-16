package za.ac.tut.basic;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class NameAndSurname extends JFrame{
    
    public NameAndSurname(){
        setTitle("Ofentse Makhutja");
        setSize(200, 250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
