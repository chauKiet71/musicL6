package KhamPha_PlayList;

import model.Model_PlayList;

public class ItemPlayList extends javax.swing.JPanel {

    public Model_PlayList getData() {
        return data;
    }

    private final Model_PlayList data;

    public ItemPlayList(Model_PlayList data) {
        this.data = data;
        initComponents();
        initComponents();
        setOpaque(false);
        lbName.setText(data.getName());
        lbTacGia.setText(data.getTacGia());
        if (data.getIcon() != null) {
            roundedImage.setImage(data.getIcon());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundedImage = new swing.RoundedImage();
        lbName = new javax.swing.JLabel();
        panel1 = new swing.Panel();
        panel2 = new swing.Panel();
        lbTacGia = new javax.swing.JLabel();

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(roundedImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 210, 210));

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Chill");
        jPanel1.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 244, 210, 32));

        panel1.setBackground(new java.awt.Color(51, 59, 66));
        panel1.setForeground(new java.awt.Color(51, 59, 66));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, -1));

        panel2.setBackground(new java.awt.Color(40, 49, 60));
        panel2.setForeground(new java.awt.Color(40, 49, 60));
        panel2.setFocusable(false);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 130, 110));

        lbTacGia.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbTacGia.setForeground(new java.awt.Color(204, 204, 204));
        lbTacGia.setText("Name");
        jPanel1.add(lbTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTacGia;
    private swing.Panel panel1;
    private swing.Panel panel2;
    private swing.RoundedImage roundedImage;
    // End of variables declaration//GEN-END:variables
}
