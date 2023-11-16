
package component;

import model.Model_Account;
import model.Model_Profile;


public class ItemAccount extends javax.swing.JPanel {

    public Model_Account getData() {
        return data;
    }

    private final Model_Account data;

    public ItemAccount(Model_Account data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbName.setText(data.getName());
        if (data.getImage() != null) {
            imageAvarta1.setImage(data.getImage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvarta1 = new swing.ImageAvarta();
        lbName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbName.setBackground(new java.awt.Color(30, 30, 30));
        lbName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Name");
        lbName.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(imageAvarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvarta imageAvarta1;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
