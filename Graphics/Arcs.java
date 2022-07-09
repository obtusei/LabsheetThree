package Graphics;

import javax.swing.*;
import java.awt.*;

public class Arcs extends JFrame {

          public Arcs() {
                    setSize(500, 500);
                    setVisible(true);
                    setLayout(null);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }

          @Override
          public void paint(Graphics graphics) {
                    graphics.drawArc(100, 100, 50, 60, 0, 60);
                    graphics.drawArc(200, 200, 50, 60, 0, 45);
                    graphics.drawArc(200, 200, 50, 60, 0, 90);
          }
}
