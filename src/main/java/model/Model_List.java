package model;

import javax.swing.Icon;

public class Model_List {

    private Icon icon;
    private String name;

    public Model_List() {
    }

    public Model_List(Icon icon, String name) {
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
