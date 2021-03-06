/**
 * Application.java
 * (c) 2020 BlueWolf2027
 */
package freeedit;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Application extends JFrame implements ActionListener {

    public static final long serialVersionUID = 8442152989L;

    JFrame f;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Application window = new Application()
                    window.f.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Application() {
        f = new JFrame("FreeEdit");
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/icons/freeedit-icon.png")));
        f.setBounds(100, 100, 450, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar jmb = new JMenuBar();
        f.setJMenuBar(jmb);
        
        JMenu jmFile = new JMenu("File");
        jmb.add(jmFile);
    }

    /**
     * Create the "actionPerformed()" method.
     */
    public void actionPerformed(ActionEvent e) {
    }

}
