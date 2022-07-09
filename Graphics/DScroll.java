package Graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DScroll extends JFrame {

          public DScroll() {
                    setTitle("This is a scroll");
                    setSize(500, 500);

                    setVisible(true);
                    setLayout(null);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    JScrollBar scrollbar = new JScrollBar();
                    scrollbar.setBounds(100, 100, 350, 100);
                    add(scrollbar);
          }
}
