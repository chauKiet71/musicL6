package model;

import javax.swing.Icon;

public class Model_TuyenTap {

    private Icon icon;
    private String name;
    private String tacGia;

    public Model_TuyenTap() {
    }

    public Model_TuyenTap(Icon icon, String name, String tacGia) {
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
