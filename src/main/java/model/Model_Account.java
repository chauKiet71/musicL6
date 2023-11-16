package model;

import javax.swing.Icon;

public class Model_Account {

    private String name;
    private Icon image;

    public Model_Account() {
    }

    public Model_Account(String name, Icon image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

}
