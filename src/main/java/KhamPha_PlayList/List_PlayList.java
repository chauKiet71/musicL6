package KhamPha_PlayList;

//import model.Model_Profile;
import component3.ItemTuyenTap;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_PlayList;
//import model.Model_TuyenTap;

public class List_PlayList<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public List_PlayList() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_PlayList data;
                if (o instanceof Model_PlayList) {
                    data = (Model_PlayList) o;
                } else {
                    data = new Model_PlayList(new ImageIcon(getClass().getResource("/icon/artists_selected.png")), "Name", "Description");
                }
                ItemPlayList item = new ItemPlayList(data);
                return item;
            }
        };
    }

    public void addItem(Model_PlayList data) {
        model.addElement(data);
    }
}
