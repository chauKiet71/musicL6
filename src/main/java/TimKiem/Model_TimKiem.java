package TimKiem;

import Table.Model_ProfileTable;

public class Model_TimKiem {

    private String text;
    private Integer many;

    public Model_TimKiem() {
    }

    public Model_TimKiem(String text, Integer many) {
        this.text = text;
        this.many = many;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getMany() {
        return many;
    }

    public void setMany(Integer many) {
        this.many = many;
    }



}
