package Graphics;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JFrame {

          public Rectangle() {
                    setSize(500, 500);
                    setVisible(true);
                    setLayout(null);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          }

          @Override
          public void paint(Graphics graphics) {
                    graphics.drawRect(100, 100, 200, 200);
                    graphics.drawArc(100, 100, 50, 60, 0, 360);
          }
}