
package component2;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_Topic;
//import model.Model_GoiY;

public class ListTopic<E extends Object> extends JList<E> {
     private final DefaultListModel model;

    public ListTopic() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_Topic data;
                if (o instanceof Model_Topic) {
                    data = (Model_Topic) o;
                } else {
                    data = new Model_Topic(new ImageIcon(getClass().getResource("/icon/Topic/1.png")));
                }
                ItemTopic item = new ItemTopic(data);
                return item;
            }
        };
    }

    public void addItem(Model_Topic data) {
        model.addElement(data);
    }
}
