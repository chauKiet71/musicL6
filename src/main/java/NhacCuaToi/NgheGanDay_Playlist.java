package NhacCuaToi;

import javax.swing.ImageIcon;
import model.Model_PlayList;

public class NgheGanDay_Playlist extends javax.swing.JPanel {

    public NgheGanDay_Playlist() {
        initComponents();
        init();
    }

    public void init() {
        list_PlayList1.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/playlist/pl2.jpg")), "Cô Giá Lấp Lánh OST", "V.A"));
        list_PlayList2.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/playlist/pl2.jpg")), "Cô Giá Lấp Lánh OST", "V.A"));
        list_PlayList3.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/playlist/pl2.jpg")), "Cô Giá Lấp Lánh OST", "V.A"));
        list_PlayList4.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/playlist/pl1.jpg")), "Cô Giá Lấp Lánh OST", "V.A"));
        list_PlayList5.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/playlist/pl1.jpg")), "Cô Giá Lấp Lánh OST", "V.A"));
        list_PlayList6.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/playlist/pl1.jpg")), "Cô Giá Lấp Lánh OST", "V.A"));
        list_PlayList7.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/playlist/pl1.jpg")), "Cô Giá Lấp Lánh OST", "V.A"));
        list_PlayList8.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/playlist/pl1.jpg")), "Cô Giá Lấp Lánh OST", "V.A"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnXoa = new swing.ButtonOutLine();
        list_PlayList1 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList2 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList3 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList4 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList8 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList7 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList6 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList5 = new KhamPha_PlayList.List_PlayList<>();

        setBackground(new java.awt.Color(29, 38, 49));

        btnXoa.setBorder(null);
        btnXoa.setForeground(new java.awt.Color(29, 194, 241));
        btnXoa.setText("Xóa Playlist");
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(list_PlayList1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(list_PlayList2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(list_PlayList3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(list_PlayList5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(list_PlayList6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(list_PlayList7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_PlayList4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(list_PlayList8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_PlayList1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_PlayList5, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList6, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList7, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonOutLine btnXoa;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList1;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList2;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList3;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList4;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList5;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList6;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList7;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList8;
    // End of variables declaration//GEN-END:variables
}
