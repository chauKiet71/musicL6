package Table;

import javax.swing.Icon;

public class Model_ProfileTable {

    private Icon icon;
    private String name;

    public Model_ProfileTable() {
    }

    public Model_ProfileTable(Icon icon, String name) {
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
