package model;

import javax.swing.Icon;

public class Model_PlayList {

    private Icon icon;
    private String name;
    private String tacGia;

    public Model_PlayList() {
    }

    public Model_PlayList(Icon icon, String name, String tacGia) {
        this.icon = icon;
        this.name = name;
        this.tacGia = tacGia;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

}
