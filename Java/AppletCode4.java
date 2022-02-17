import java.awt.*;

import javafx.scene.control.CheckBox;

import java.applet.*;

public class AppletCode4 extends Applet {

    CheckBox cob1 = new Checkbox("reading", false);
    CheckBox cob2 = new Checkbox("music", true);
    CheckboxGroup cg = new CheckboxGroup();
    CheckBox cob3 = new Checkbox("reading", false, cg);
    CheckBox cob4 = new Checkbox("music", true, cg);

    public void init() {
        setLayout(new FlowLayout());
        add(cob1);
        add(cob2);
        add(cob3);
        add(cob4);
    }

}
/*
 * <applet code= AppletCode4.Class width =500 height=500>
 * </applet>
 */