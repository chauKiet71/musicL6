package KhamPha_NgheSi;

import javax.swing.Icon;

public class Model_NgheSi {

    private Icon icon;
    private String name;

    public Model_NgheSi() {
    }

    public Model_NgheSi(Icon icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
