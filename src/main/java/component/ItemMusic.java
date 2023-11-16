package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import swing.Model_Music;

public class ItemMusic extends javax.swing.JPanel {

    public boolean isPlay() {
        return play;
    }

    private final Model_Music data;
    private boolean play;

    public void setPlay(boolean play) {
        this.play = play;
        if (play) {
            lbIcon.setText("");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/icon/playing.png")));
            lbText.setFont(new java.awt.Font("sansserif", 1, 15));
            lbText.setForeground(new Color(239, 32, 130));
            lbTime.setFont(new java.awt.Font("sansserif", 1, 15));
            lbTime.setForeground(new Color(239, 32, 130));
            panel.setBackground(new Color(252, 184, 179));
        } else {
            lbIcon.setIcon(null);
            lbIcon.setText(data.getNo());
            lbText.setFont(new java.awt.Font("sansserif", 0, 14));
            lbText.setForeground(new Color(255, 255, 255));
            lbTime.setFont(new java.awt.Font("sansserif", 0, 14));
            lbTime.setForeground(new Color(255, 255, 255));
            setBackground(Color.BLACK);
        }
    }

    public ItemMusic(Model_Music data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lbText.setText(data.getName());
        lbTime.setText(data.getTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbText = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbText.setForeground(new java.awt.Color(255, 255, 255));
        lbText.setText("Musc Name");

        lbTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTime.setForeground(new java.awt.Color(255, 255, 255));
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTime.setText("03:05");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                    .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(lbText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(lbTime, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setBackground(new Color(252, 184, 179));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited

    }//GEN-LAST:event_formMouseExited

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (play) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(250, 202, 191));
            g2.fillRect(0, getHeight() - 1, getWidth(), getHeight());
            super.paintComponent(grphcs);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbText;
    private javax.swing.JLabel lbTime;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
