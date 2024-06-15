
package travel.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Logout extends JFrame implements ActionListener{
    JButton b1;
    JLabel l1;
     public Logout() {
         
     }
     public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new Logout().setVisible(true);
    }

}

