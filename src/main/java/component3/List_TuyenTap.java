package component3;

//import model.Model_Profile;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_TuyenTap;

public class List_TuyenTap<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public List_TuyenTap() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_TuyenTap data;
                if (o instanceof Model_TuyenTap) {
                    data = (Model_TuyenTap) o;
                } else {
                    data = new Model_TuyenTap(new ImageIcon(getClass().getResource("/icon/artists_selected.png")), "Name", "Description");
                }
                ItemTuyenTap item = new ItemTuyenTap(data);
                return item;
            }
        };
    }

    public void addItem(Model_TuyenTap data) {
        model.addElement(data);
    }
}
