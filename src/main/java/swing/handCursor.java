package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class handCursor {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cursor Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 100));
        panel.setBackground(Color.lightGray);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                // Đặt hình bàn tay cho chuột khi nó hover vào JPanel
                setHandCursor(panel);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                // Đặt hình mặc định cho chuột khi nó rời khỏi JPanel
                setDefaultCursor(panel);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    // Đặt hình bàn tay cho chuột
    private static void setHandCursor(Component component) {
        Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
        component.setCursor(handCursor);
    }

    // Đặt hình mặc định cho chuột
    private static void setDefaultCursor(Component component) {
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        component.setCursor(defaultCursor);
    }
}
