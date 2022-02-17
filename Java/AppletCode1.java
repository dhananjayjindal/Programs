
import java.awt.*;

import java.applet.*;

public class AppletCode1 extends Applet {
    String St;

    public void init() {
        St = getParameter("X");
        St = "hello" + St;
    }

    public void paint(Graphics g) {
        g.drawString(St, 100, 100);

    }
}
/*
 * <applet code= app.Class width =400 height=400>
 * <param name= X value = "jai sri ram">
 * </applet>
 */