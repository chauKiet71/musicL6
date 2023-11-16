
package List;

import model.Model_Profile;

public class ItemVideoHot2 extends javax.swing.JPanel {

public Model_Profile getData() {
        return data;
    }

    private final Model_Profile data;

    public ItemVideoHot2(Model_Profile data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbName.setText(data.getName());
        lbSi.setText(data.getDescription());
        if (data.getImage() != null) {
            icon.setImage(data.getImage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new swing.RoundedImage();
        lbName = new javax.swing.JLabel();
        lbSi = new javax.swing.JLabel();

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Name");

        lbSi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbSi.setForeground(new java.awt.Color(204, 204, 204));
        lbSi.setText("Nghệ sĩ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSi, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSi))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.RoundedImage icon;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbSi;
    // End of variables declaration//GEN-END:variables
}
