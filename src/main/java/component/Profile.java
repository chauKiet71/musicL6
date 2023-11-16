package component;

import javax.swing.ImageIcon;
import model.Model_Profile;

public class Profile extends javax.swing.JPanel {

    public Profile() {
        initComponents();
        init();
    }

    private void init() {
        list.addItem(new Model_Profile("Avicii", "Tim", new ImageIcon(getClass().getResource("/icon/avicii_pro.jpg"))));
        list.addItem(new Model_Profile("Kygo", "Kygo", new ImageIcon(getClass().getResource("/icon/kygo_pro.jpg"))));
        list.addItem(new Model_Profile("Sigala", "Sigala", new ImageIcon(getClass().getResource("/icon/sigala_pro.jpg"))));
        list.addItem(new Model_Profile("Sơn Tùng MTP", "Tim", new ImageIcon(getClass().getResource("/icon/sonTung.jpg"))));
        list.addItem(new Model_Profile("Trung Quân Idol", "Kygo", new ImageIcon(getClass().getResource("/icon/trungQuanIdo.jpg"))));
        list.addItem(new Model_Profile("Hòa Minzy", "Sigala", new ImageIcon(getClass().getResource("/icon/hoaMinzy.jpg"))));
        list.addItem(new Model_Profile("Đông Nhi", "Tim", new ImageIcon(getClass().getResource("/icon/dongNhi.jpg"))));
        list.addItem(new Model_Profile("Mỹ Tâm", "Kygo", new ImageIcon(getClass().getResource("/icon/myTam.jpg"))));
        list.addItem(new Model_Profile("Thùy Chi", "Sigala", new ImageIcon(getClass().getResource("/icon/thuyChi.jpg"))));
        list.addItem(new Model_Profile("Văn Mai Hương", "Tim", new ImageIcon(getClass().getResource("/icon/vanMaiHuong.jpg"))));
        list.addItem(new Model_Profile("Phan Mạnh Quỳnh", "Kygo", new ImageIcon(getClass().getResource("/icon/phanManhQuynh.jpg"))));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list = new component.ListProfile<>();

        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.ListProfile<String> list;
    // End of variables declaration//GEN-END:variables
}
