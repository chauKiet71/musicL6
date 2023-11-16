package form;

import TimKiem.TimKiem_BaiHat;
import TimKiem.TimKiem_Playlist;
import TimKiem.TimKiem_TatCa;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class FormTimKiemItem extends javax.swing.JPanel {

    private static JLabel selectedLabel = null;

    public FormTimKiemItem() {
        initComponents();
        init();
    }

    public void init() {
        hover(lbTatCa);
        hover(lbBaiHat);
        hover(lbList);
    }

    public void hover(JLabel label) {
        int borderSize = 2;
        Border defaultBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border hoverBorder = BorderFactory.createMatteBorder(0, 0, borderSize, 0, new Color(29, 194, 241));

        label.setBorder(defaultBorder);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBorder(hoverBorder);
                setHandCursor(label);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Chỉ thay đổi border nếu label này không phải là label được chọn
                if (label != selectedLabel) {
                    label.setBorder(defaultBorder);
                    setDefaultCursor(label);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Nếu có một label khác được chọn, loại bỏ border của nó
                if (selectedLabel != null) {
                    selectedLabel.setBorder(defaultBorder);
                }

                // Thiết lập border cho label được chọn
                label.setBorder(hoverBorder);

                // Cập nhật label được chọn
                selectedLabel = label;
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

        textFieldAnimation1 = new swing.TextFieldAnimation();
        content = new javax.swing.JScrollPane();
        timKiem_TatCa1 = new TimKiem.TimKiem_TatCa();
        jPanel1 = new javax.swing.JPanel();
        lbTatCa = new javax.swing.JLabel();
        lbBaiHat = new javax.swing.JLabel();
        lbList = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 38, 49));

        content.setBackground(new java.awt.Color(29, 38, 49));
        content.setBorder(null);
        content.setForeground(new java.awt.Color(0, 0, 0));
        content.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        content.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        content.setViewportView(timKiem_TatCa1);

        jPanel1.setOpaque(false);

        lbTatCa.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbTatCa.setForeground(new java.awt.Color(255, 255, 255));
        lbTatCa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTatCa.setText("Tất cả");
        lbTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTatCaMouseClicked(evt);
            }
        });

        lbBaiHat.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbBaiHat.setForeground(new java.awt.Color(255, 255, 255));
        lbBaiHat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBaiHat.setText("Bài Hát");
        lbBaiHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBaiHatMouseClicked(evt);
            }
        });

        lbList.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbList.setForeground(new java.awt.Color(255, 255, 255));
        lbList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbList.setText("Playlist");
        lbList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbBaiHat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbList, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBaiHat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTatCaMouseClicked
        TimKiem_TatCa wel = new TimKiem_TatCa();
        wel.setSize(926, 3000);
        wel.setLocation(0, 0);

        JScrollPane scrollPane = new JScrollPane(wel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }//GEN-LAST:event_lbTatCaMouseClicked

    private void lbBaiHatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBaiHatMouseClicked
        TimKiem_BaiHat wel = new TimKiem_BaiHat();
        wel.setSize(926, 3000);
        wel.setLocation(0, 0);

        JScrollPane scrollPane = new JScrollPane(wel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }//GEN-LAST:event_lbBaiHatMouseClicked

    private void lbListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListMouseClicked
        TimKiem_Playlist wel = new TimKiem_Playlist();
        wel.setSize(926, 3000);
        wel.setLocation(0, 0);

        JScrollPane scrollPane = new JScrollPane(wel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }//GEN-LAST:event_lbListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBaiHat;
    private javax.swing.JLabel lbList;
    private javax.swing.JLabel lbTatCa;
    private swing.TextFieldAnimation textFieldAnimation1;
    private TimKiem.TimKiem_TatCa timKiem_TatCa1;
    // End of variables declaration//GEN-END:variables
}
