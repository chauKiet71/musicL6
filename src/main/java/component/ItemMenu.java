package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.Model_Menu;

public class ItemMenu extends javax.swing.JPanel {

    public boolean isSelected() {
        return selected;
    }

    private final Model_Menu data;
    private boolean selected;

    public void setSelected(boolean selected) {
        this.selected = selected;
        if (selected) {
            lbText.setFont(new java.awt.Font("sansserif", 1, 14));
            lbText.setForeground(new Color(239,32,130));
            lbIcon.setIcon(data.toIconSelected());
        } else {
            lbText.setFont(new java.awt.Font("sansserif", 0, 14));
            lbText.setForeground(new Color(255, 255, 255));
            lbIcon.setIcon(data.toIcon());
        }
    }

    public ItemMenu(Model_Menu data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbIcon.setIcon(data.toIcon());
        lbText.setText(data.getMenuName());
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (isSelected()) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setColor(new Color(239,32,130));
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fillRect(0, 0, 3, getHeight());
        }
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbText = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbText.setForeground(new java.awt.Color(255, 255, 255));
        lbText.setText("Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbText, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbText;
    // End of variables declaration//GEN-END:variables
}
