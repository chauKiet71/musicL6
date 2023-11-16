package KhamPha_BaiHat;

import model.Model_BaiHat;

public class ItemBaiHat extends javax.swing.JPanel {

    public Model_BaiHat getData() {
        return data;
    }

    private final Model_BaiHat data;

    public ItemBaiHat(Model_BaiHat data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbName.setText(data.getTitle());
        lbSing.setText(data.getDescription());
        if (data.getImage() != null) {
            pic.setImage(data.getImage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.RoundedImage();
        lbName = new javax.swing.JLabel();
        lbSing = new javax.swing.JLabel();

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Name");

        lbSing.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbSing.setForeground(new java.awt.Color(204, 204, 204));
        lbSing.setText("nghệ sĩ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbSing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(lbName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSing)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbSing;
    private swing.RoundedImage pic;
    // End of variables declaration//GEN-END:variables
}
