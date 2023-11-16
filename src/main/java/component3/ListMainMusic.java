package component3;

import component2.ItemGoiY;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_MainMusic;

public class ListMainMusic<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public ListMainMusic() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_MainMusic data;
                if (o instanceof Model_MainMusic) {
                    data = (Model_MainMusic) o;
                } else {
                    data = new Model_MainMusic("Name", "Description", new ImageIcon(getClass().getResource("/icon/artists_selected.png")));
                }
                ItemMainMusic item = new ItemMainMusic(data);
                return item;
            }
        };
    }

    public void addItem(Model_MainMusic data) {
        model.addElement(data);
    }
}
