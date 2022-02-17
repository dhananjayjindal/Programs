
import java.awt.*;

import javafx.scene.control.TextField;

import java.applet.*;

public class AppletCode2 extends Applet {

    TextField tob= new TextField();
    Label lob = new Label("Name");

    public void init() {
        
        setLayout(new FlowLayout());
        add(tob);
        add(lob);
    }

    private void add(TextField tob2) {
    }
}
/*
 * <applet code= AppletCode2.Class width =500 height=500>
 * </applet>
 */