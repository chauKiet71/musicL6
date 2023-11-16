package model;

import javax.swing.Icon;

public class Model_Hit {

    public Model_Hit() {
    }

    public Model_Hit(Icon icon, String name, String sing, String ngay) {
        this.icon = icon;
        this.name = name;
        this.sing = sing;
        this.ngay = ngay;
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

    public String getSing() {
        return sing;
    }

    public void setSing(String sing) {
        this.sing = sing;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    private Icon icon;
    private String name;
    private String sing;
    private String ngay;

}
