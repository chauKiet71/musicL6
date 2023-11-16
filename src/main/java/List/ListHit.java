package List;

import model.Model_Profile;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_Hit;

public class ListHit<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public ListHit() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_Hit data;
                if (o instanceof Model_Hit) {
                    data = (Model_Hit) o;
                } else {
                    data = new Model_Hit(new ImageIcon(getClass().getResource("/icon/Music/catdoinoisau.jpg")), "Name", "Description", "11/9/2023");
                }
                ItemHit item = new ItemHit(data);
                return item;
            }
        };
    }

    public void addItem(Model_Hit data) {
        model.addElement(data);
    }
}
