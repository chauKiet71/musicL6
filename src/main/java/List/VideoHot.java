package List;

import component2.ListChill;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import model.Model_Chill;
import model.Model_Profile;

public class VideoHot extends javax.swing.JPanel {

    public VideoHot() {
        initComponents();
        init();
    }

    public void init() {
        listVideoHot1.addItem(new Model_Profile("Cô Đơn Đã Quá Bình Thường (Ft. OnlyC Pro.)", "Miu Lê", new ImageIcon(getClass().getResource("/icon/Chill/hot5.jpg"))));
        listVideoHot2.addItem(new Model_Profile("Standing Next To You", "Jung Kook (BTS)", new ImageIcon(getClass().getResource("/icon/Chill/hot6.jpg"))));
        listVideoHot21.addItem(new Model_Profile("Anh Sai Rồi", "Tăng Phúc, Nguyễn Hồng Thuận", new ImageIcon(getClass().getResource("/icon/Chill/videohot3.jpg"))));
        listVideoHot22.addItem(new Model_Profile("Either Way", "IVE", new ImageIcon(getClass().getResource("/icon/Chill/videohot4.jpg"))));
        listVideoHot23.addItem(new Model_Profile("Biết Khi Nào Chia Ly", "Doãn Hiếu", new ImageIcon(getClass().getResource("/icon/Chill/videohot5.jpg"))));
        setHoverCursor(listVideoHot1);
        setHoverCursor(listVideoHot2);
        setHoverCursor2(listVideoHot21);
        setHoverCursor2(listVideoHot22);
        setHoverCursor2(listVideoHot23);
    }

    private static void setHoverCursor(ListVideoHot<?> listChill) {
        listChill.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setHandCursor(listChill);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setDefaultCursor(listChill);
            }
        });
    }
    
    private static void setHoverCursor2(ListVideoHot2<?> listChill) {
        listChill.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setHandCursor(listChill);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setDefaultCursor(listChill);
            }
        });
    }

    private static void setHandCursor(Component component) {
        Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
        component.setCursor(handCursor);
    }

    // Đặt hình mặc định cho chuột
    private static void setDefaultCursor(Component component) {
        Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
        component.setCursor(defaultCursor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        listVideoHot1 = new List.ListVideoHot<>();
        listVideoHot2 = new List.ListVideoHot<>();
        listVideoHot21 = new List.ListVideoHot2<>();
        listVideoHot22 = new List.ListVideoHot2<>();
        listVideoHot23 = new List.ListVideoHot2<>();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(885, 1201));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chủ Đề Hot");

        jPanel1.setOpaque(false);

        listVideoHot1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listVideoHot1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listVideoHot1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listVideoHot1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listVideoHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(listVideoHot1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listVideoHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listVideoHot22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(listVideoHot23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listVideoHot21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listVideoHot21, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listVideoHot22, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listVideoHot23, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 467, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listVideoHot1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVideoHot1MouseEntered
        setHandCursor(listVideoHot1);
    }//GEN-LAST:event_listVideoHot1MouseEntered

    private void listVideoHot1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVideoHot1MouseExited
        setDefaultCursor(listVideoHot1);
    }//GEN-LAST:event_listVideoHot1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private List.ListVideoHot<String> listVideoHot1;
    private List.ListVideoHot<String> listVideoHot2;
    private List.ListVideoHot2<String> listVideoHot21;
    private List.ListVideoHot2<String> listVideoHot22;
    private List.ListVideoHot2<String> listVideoHot23;
    // End of variables declaration//GEN-END:variables
}
