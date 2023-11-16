
package component2;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import model.Model_Chill;


public class Chill extends javax.swing.JPanel {

    public Chill() {
        initComponents();
        init();
    }

    public void init(){
        listChill1.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/Chill/1.png")), "Ngốc à, mình chỉ iu mỗi mình cậu mà thôiiiii"));
        listChill2.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/Chill/2.png")), "Nhạc chill cho tín đồ của Pop"));
        listChill3.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/Chill/3.png")), "Những giai điệu nhẹ nhàng dễ thương"));
        listChill4.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/Chill/4.png")), "Nâng niu đôi tay cùng R&B Việt"));
        listChill5.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/Chill/6.png")), "Nhạc Việt 'lâu phai' và gây nghiện"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listChill1 = new component2.ListChill<>();
        listChill2 = new component2.ListChill<>();
        listChill3 = new component2.ListChill<>();
        listChill4 = new component2.ListChill<>();
        listChill5 = new component2.ListChill<>();

        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listChill1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listChill2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listChill3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listChill4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listChill5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component2.ListChill<String> listChill1;
    private component2.ListChill<String> listChill2;
    private component2.ListChill<String> listChill3;
    private component2.ListChill<String> listChill4;
    private component2.ListChill<String> listChill5;
    // End of variables declaration//GEN-END:variables
}
