
package component;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_Account;
import model.Model_Profile;


public class ListAccount<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;

    public ListAccount() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_Account data;
                if (o instanceof Model_Account) {
                    data = (Model_Account) o;
                } else {
                    data = new Model_Account("Name",  new ImageIcon(getClass().getResource("/icon/artists_selected.png")));
                }
                ItemAccount item = new ItemAccount(data);
                return item;
            }
        };
    }

    public void addItem(Model_Account data) {
        model.addElement(data);
    }
    
}
