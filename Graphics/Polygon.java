package Graphics;

import javax.swing.*;
import java.awt.*;

public class Polygon extends JFrame {
          
          public Polygon() {
                    setSize(500, 500);
                    setVisible(true);
                    setLayout(null);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }

          @Override
          public void paint(Graphics graphics) {
                    graphics.drawPolygon(new int[] {100, 200, 300, 400}, new int[] {100, 200, 300, 400}, 4);
          }
}
