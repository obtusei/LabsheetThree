package Graphics;

import javax.swing.*;
import java.awt.*;

public class Ellipses extends JFrame {

          public Ellipses() {
                    setSize(500, 500);
                    setVisible(true);
                    setLayout(null);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }

          @Override
          public void paint(Graphics graphics) {
                    graphics.drawArc(100, 100, 50, 60, 0, 360);
                    graphics.drawArc(200, 200, 50, 60, 0, 360);
                    graphics.drawArc(200, 200, 50, 60, 0, 360);
          }
}
