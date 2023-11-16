package TimKiem;

import Table.Model_Table;
import javax.swing.ImageIcon;
import model.Model_Chill;
import model.Model_PlayList;

public class TimKiem_TatCa extends javax.swing.JPanel {

    public TimKiem_TatCa() {
        initComponents();
//        initTableData();
        init();
    }

    void init() {
        list_PlayList1.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList2.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList3.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList4.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList5.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList6.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList7.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList8.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList9.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList10.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList11.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
        list_PlayList12.addItem(new Model_PlayList(new ImageIcon(getClass().getResource("/icon/Music/tienlenvietnam.jpg")), "Tiến Lên Việt Nam","Sơn Tùng M-TP"));
       

    }

//    private void initTableData() {
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/nhiptraitim.jpg")), "Nhịp Trái Tim", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/anhsedoi.jpg")), "Anh Sẽ Đợi", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/nangamxadan.jpg")), "Nắng Ấm Xa Dần", "Sơn Tùng M-TP", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/codonglon.jpg")), "Cổ Đông Lớn", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/dungsai.jpg")), "Đừng Sai", "Ai Biết", "120K", "03:50").toRowTable());
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table1 = new Table.TableMusic();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        list_PlayList1 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList2 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList3 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList4 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList5 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList6 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList7 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList8 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList9 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList10 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList11 = new KhamPha_PlayList.List_PlayList<>();
        list_PlayList12 = new KhamPha_PlayList.List_PlayList<>();

        setBackground(new java.awt.Color(29, 38, 49));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sing", "View", "Time"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bài hát");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Playlist");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(list_PlayList1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(list_PlayList5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(list_PlayList10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_PlayList11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_PlayList1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_PlayList5, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList6, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList7, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_PlayList10, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList12, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList9, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_PlayList11, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

    }//GEN-LAST:event_table1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList1;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList10;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList11;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList12;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList2;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList3;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList4;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList5;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList6;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList7;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList8;
    private KhamPha_PlayList.List_PlayList<String> list_PlayList9;
    private Table.TableMusic table1;
    // End of variables declaration//GEN-END:variables
}
