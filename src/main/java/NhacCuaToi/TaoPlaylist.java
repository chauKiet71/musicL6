package NhacCuaToi;

import javax.swing.ImageIcon;
import model.Model_TuyenTap;

public class TaoPlaylist extends javax.swing.JPanel {

    public TaoPlaylist() {
        initComponents();
        init();
    }

    public void init() {
        list_TuyenTap1.addItem(new Model_TuyenTap(new ImageIcon(getClass().getResource("/icon/Chill/tuyentap37.jpg")), "Tiktok Remix Việt", "goodmusic253"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list_TuyenTap1 = new component3.List_TuyenTap<>();
        buttonOutLine1 = new swing.ButtonOutLine();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbBaiHat = new javax.swing.JLabel();
        lbList = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 38, 49));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(list_TuyenTap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 85, 210, 299));

        buttonOutLine1.setBackground(new java.awt.Color(29, 194, 255));
        buttonOutLine1.setBorder(null);
        buttonOutLine1.setForeground(new java.awt.Color(29, 194, 255));
        buttonOutLine1.setText("+");
        buttonOutLine1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(buttonOutLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 40, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 194, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tạo Playlist Mới");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel1.setBackground(new java.awt.Color(29, 38, 49));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 94, 210, 290));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setText("Playlist");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 16, -1, 51));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOpaque(true);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 20, 1, 39));

        jPanel1.setOpaque(false);

        lbBaiHat.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbBaiHat.setForeground(new java.awt.Color(255, 255, 255));
        lbBaiHat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBaiHat.setText("Tất Cả");
        lbBaiHat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBaiHatMouseClicked(evt);
            }
        });

        lbList.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbList.setForeground(new java.awt.Color(255, 255, 255));
        lbList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbList.setText("Của Tôi");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBaiHat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 16, -1, 51));
    }// </editor-fold>//GEN-END:initComponents

    private void lbBaiHatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBaiHatMouseClicked

    }//GEN-LAST:event_lbBaiHatMouseClicked

    private void lbListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListMouseClicked

    }//GEN-LAST:event_lbListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonOutLine buttonOutLine1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBaiHat;
    private javax.swing.JLabel lbList;
    private component3.List_TuyenTap<String> list_TuyenTap1;
    // End of variables declaration//GEN-END:variables
}
