package Table;

import TimKiem.Model_TimKiem;
import TimKiem.ProfileTimKiem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TableTimKiem extends JTable {

    private int hoveredRow = -1;

    public TableTimKiem() {
        setBackground(new Color(29, 38, 49));
        setShowHorizontalLines(false); // Tắt đường ngang
        setShowVerticalLines(false); // Tắt đường dọc
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);


        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (value instanceof Model_ProfileTable) {
                    Model_TimKiem data = (Model_TimKiem) value;
                    ProfileTimKiem cell = new ProfileTimKiem(data);
                    if (isSelected) {
                        cell.setBackground(new Color(239, 32, 130));
                    } else {
                        cell.setBackground(new Color(33, 42, 53)); //set màu các ô
                    }
                    return cell;
                } else {
                    setBorder(noFocusBorder);
                    com.setForeground(Color.white);
                    com.setFont(new Font("Arial", 0, 14));
                    if (isSelected) {
                        com.setBackground(new Color(239, 32, 130)); //set màu các ô khi được click vào
                    } else {
                        com.setBackground(new Color(33, 42, 53)); //set màu các ô
                    }
                    return com;
                }
            }
        }
        );

        setBorder(BorderFactory.createEmptyBorder());

//        int borderSize = 3; // Điều chỉnh kích thước lưới theo nhu cầu của bạn
//        setIntercellSpacing(new Dimension(borderSize, borderSize));
        setGridColor(new Color(29, 38, 49));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                int row = rowAtPoint(e.getPoint());
                if (row >= 0) {
                    hoveredRow = row;
                    setForeground(Color.red);
                    repaint();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hoveredRow = -1;
                repaint();
            }
        });
    }

    public void addRow(Object[] row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(row);
    }
}
