
import java.awt.*;

import javafx.scene.control.Button;

import java.applet.*;

public class AppletCode3 extends Applet {

    TextArea tob = new TextArea();
    Button bob = new Button("OK");
    Label lob = new Label("Name");

    public void init() {
        setLayout(new FlowLayout());
        add(tob);
        add(bob);
        add(lob);
    }
    
}
/*
 * <applet code= AppletCode3.Class width =500 height=500>
 * </applet>
 */