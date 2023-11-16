package KhamPha_NgheSi;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ListNgheSi<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public ListNgheSi() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_NgheSi data;
                if (o instanceof Model_NgheSi) {
                    data = (Model_NgheSi) o;
                } else {
                    data = new Model_NgheSi(new ImageIcon(getClass().getResource("/icon/artists_selected.png")), "Name");
                }
                ItemNgheSi item = new ItemNgheSi(data);
                return item;
            }
        };
    }

    public void addItem(Model_NgheSi data) {
        model.addElement(data);
    }
}
