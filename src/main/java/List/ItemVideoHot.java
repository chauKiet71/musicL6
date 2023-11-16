
package List;

import java.awt.Component;
import java.awt.Cursor;
import javax.swing.JPanel;
import model.Model_Profile;
import swing.RoundedImage;

public class ItemVideoHot extends javax.swing.JPanel {

public Model_Profile getData() {
        return data;
    }

    private final Model_Profile data;

    public ItemVideoHot(Model_Profile data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbName.setText(data.getName());
        lbSi.setText(data.getDescription());
        if (data.getImage() != null) {
            icon.setImage(data.getImage());
        }
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new swing.RoundedImage();
        lbName = new javax.swing.JLabel();
        lbSi = new javax.swing.JLabel();

        icon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        icon.setOpaque(true);
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconMouseExited(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSi, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSi)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseEntered
        setHandCursor(icon);
    }//GEN-LAST:event_iconMouseEntered

    private void iconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseExited
        setDefaultCursor(icon);
    }//GEN-LAST:event_iconMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.RoundedImage icon;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbSi;
    // End of variables declaration//GEN-END:variables
}
