
import java.applet.Applet;

Page 34 of 62

SCSVMV University | Department of Computer Science and Engineering | Java Programming Laboratory

import java.awt.*;
public class HelloApplet extends Applet {
public void init() {
setBackground(Color.WHITE);
}
public void paint(Graphics g) {
g.setColor(Color.BLUE);
g.drawString("Welcome to SCSVMV", 30, 25);
g.setColor(Color.RED);
g.fillOval(30, 45, 60, 60);
g.setColor(Color.GREEN);
g.fillRect(110, 45, 80, 60);
}
}
