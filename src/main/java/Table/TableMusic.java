package Table;

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

public class TableMusic extends JTable {

    private int hoveredRow = -1;

    public TableMusic() {
        setBackground(new Color(29, 38, 49));
        setShowHorizontalLines(false); // Tắt đường ngang
        setShowVerticalLines(false); // Tắt đường dọc
        setRowHeight(66);
        getTableHeader().setReorderingAllowed(false);

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                JTableHeader header = new JTableHeader(o + "");
                if (i1 == 3) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                    header.setFont(new Font("Arial", Font.BOLD, 14));
                }
                return header;
            }
        };
        getTableHeader().setDefaultRenderer(renderer);

        // Áp dụng renderer cho tất cả các ô trong JTable
        getTableHeader().setDefaultRenderer(renderer);

        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (value instanceof Model_ProfileTable) {
                    Model_ProfileTable data = (Model_ProfileTable) value;
                    ProfileMusic cell = new ProfileMusic(data);
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
