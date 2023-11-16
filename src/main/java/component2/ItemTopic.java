
package component2;

import model.Model_Topic;


public class ItemTopic extends javax.swing.JPanel {

    
    public Model_Topic getData() {
        return data;
    }

    private final Model_Topic data;
   
    public ItemTopic(Model_Topic data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        if (data.getImage() != null) {
            roundedImage.setImage(data.getImage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedImage = new swing.RoundedImage();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        roundedImage.setBackground(new java.awt.Color(255, 255, 255));
        roundedImage.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedImage, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.RoundedImage roundedImage;
    // End of variables declaration//GEN-END:variables
}
