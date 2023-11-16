package NhacCuaToi;

import TimKiem.TimKiem_TatCa;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import swing.ScrollBarr;

public class NgheGanDay extends javax.swing.JPanel {

    private static JLabel selectedLabel = null;

    public NgheGanDay() {
        initComponents();
        init();
    }

    public void init() {
        content.setVerticalScrollBar(new ScrollBarr());
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbBaiHat = new javax.swing.JLabel();
        lbList = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        content = new javax.swing.JScrollPane();
        ngheGanDay_BaiHat1 = new NhacCuaToi.NgheGanDay_BaiHat();

        setBackground(new java.awt.Color(29, 38, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("Nghe gần đây");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOpaque(true);

        jPanel1.setOpaque(false);

        lbBaiHat.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbBaiHat.setForeground(new java.awt.Color(255, 255, 255));
        lbBaiHat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBaiHat.setText("Bài Hát");
        lbBaiHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBaiHatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbBaiHatMouseEntered(evt);
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
                .addComponent(lbBaiHat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbList, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBaiHat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOpaque(true);

        content.setBackground(new java.awt.Color(29, 38, 49));
        content.setBorder(null);
        content.setForeground(new java.awt.Color(51, 51, 255));
        content.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        content.setOpaque(false);
        content.setViewportView(ngheGanDay_BaiHat1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbBaiHatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBaiHatMouseClicked
        NgheGanDay_BaiHat wel = new NgheGanDay_BaiHat();
        wel.setSize(926, 3000);
        wel.setLocation(0, 0);

        JScrollPane scrollPane = new JScrollPane(wel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }//GEN-LAST:event_lbBaiHatMouseClicked

    private void lbListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListMouseClicked
        NgheGanDay_Playlist wel = new NgheGanDay_Playlist();
        wel.setSize(926, 3000);
        wel.setLocation(0, 0);

        JScrollPane scrollPane = new JScrollPane(wel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }//GEN-LAST:event_lbListMouseClicked

    private void lbBaiHatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBaiHatMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbBaiHatMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbBaiHat;
    private javax.swing.JLabel lbList;
    private NhacCuaToi.NgheGanDay_BaiHat ngheGanDay_BaiHat1;
    // End of variables declaration//GEN-END:variables
}
