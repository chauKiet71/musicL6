
package KhamPha_BaiHat;


import model.Model_Profile;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_BaiHat;


public class ListBaiHat<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public ListBaiHat() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_BaiHat data;
                if (o instanceof Model_BaiHat) {
                    data = (Model_BaiHat) o;
                } else {
                    data = new Model_BaiHat(new ImageIcon(getClass().getResource("/icon/Music/catdoinoisau.jpg")), "Name", "Description");
                }
                ItemBaiHat item = new ItemBaiHat(data);
                return item;
            }
        };
    }

    public void addItem(Model_BaiHat data) {
        model.addElement(data);
    }
}
