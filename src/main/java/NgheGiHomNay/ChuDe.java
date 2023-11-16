package NgheGiHomNay;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import model.Model_Chill;

public class ChuDe extends javax.swing.JPanel {

    public ChuDe() {
        initComponents();
        init();
        hover();

    }

    public void init() {
        listChill1.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude2.png")), ""));
        listChill2.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude3.png")), ""));
        listChill3.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude4.png")), ""));
        listChill4.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude5.png")), ""));
        listChill5.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude6.png")), ""));
        listChill6.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude7.png")), ""));
        listChill7.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude8.png")), ""));
        listChill8.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude9.png")), ""));
        listChill9.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude10.png")), ""));
        listChill10.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude11.png")), ""));
        listChill11.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude12.png")), ""));
        listChill11.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude13.png")), ""));
        listChill12.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude14.png")), ""));
        listChill13.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude15.png")), ""));
        listChill14.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude16.png")), ""));
        listChill15.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude17.png")), ""));
        listChill16.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude18.png")), ""));
        listChill17.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude19.png")), ""));
        listChill18.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude20.png")), ""));
        listChill19.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude21.png")), ""));
        listChill20.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude22.png")), ""));
        listChill21.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude23.png")), ""));
        listChill22.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude24.png")), ""));
        listChill23.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude25.png")), ""));
        listChill24.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude26.png")), ""));
        listChill25.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude27.png")), ""));
        listChill26.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude28.png")), ""));
        listChill27.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude29.png")), ""));
        listChill28.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude30.png")), ""));
        listChill29.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude31.png")), ""));
        listChill30.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude32.png")), ""));
        listChill31.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude33.png")), ""));
        listChill32.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude34.png")), ""));
        listChill33.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude35.png")), ""));
        listChill34.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude36.png")), ""));
        listChill35.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude37.png")), ""));
        listChill36.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude38.png")), ""));
        listChill37.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude40.png")), ""));
        listChill38.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude41.png")), ""));
        listChill39.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude42.png")), ""));
        listChill40.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude46.png")), ""));
        listChill41.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude44.png")), ""));
        listChill42.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/TuyenTap/chude45.png")), ""));
        //        listChill5.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/Chill/6.png")), "Nhạc Việt 'lâu phai' và gây nghiện"));
    }

    public void hover() {
        listChill1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Khi di chuột vào, thay đổi màu nền của JLabel thành màu đen với độ trong suốt
                listChill1.setBackground(new Color(0, 0, 0, 150));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Khi di chuột ra, đặt lại màu nền của JLabel về màu trong suốt
                listChill1.setBackground(new Color(0, 0, 0, 0));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listChill1 = new component2.ListChill<>();
        listChill2 = new component2.ListChill<>();
        listChill3 = new component2.ListChill<>();
        listChill4 = new component2.ListChill<>();
        listChill5 = new component2.ListChill<>();
        listChill6 = new component2.ListChill<>();
        listChill7 = new component2.ListChill<>();
        listChill8 = new component2.ListChill<>();
        listChill9 = new component2.ListChill<>();
        listChill10 = new component2.ListChill<>();
        listChill11 = new component2.ListChill<>();
        listChill12 = new component2.ListChill<>();
        listChill13 = new component2.ListChill<>();
        listChill14 = new component2.ListChill<>();
        listChill15 = new component2.ListChill<>();
        listChill16 = new component2.ListChill<>();
        listChill17 = new component2.ListChill<>();
        listChill18 = new component2.ListChill<>();
        listChill19 = new component2.ListChill<>();
        listChill20 = new component2.ListChill<>();
        listChill21 = new component2.ListChill<>();
        listChill22 = new component2.ListChill<>();
        listChill23 = new component2.ListChill<>();
        listChill24 = new component2.ListChill<>();
        listChill25 = new component2.ListChill<>();
        listChill26 = new component2.ListChill<>();
        listChill27 = new component2.ListChill<>();
        listChill28 = new component2.ListChill<>();
        listChill29 = new component2.ListChill<>();
        listChill30 = new component2.ListChill<>();
        listChill31 = new component2.ListChill<>();
        listChill32 = new component2.ListChill<>();
        listChill33 = new component2.ListChill<>();
        listChill34 = new component2.ListChill<>();
        listChill35 = new component2.ListChill<>();
        listChill36 = new component2.ListChill<>();
        listChill37 = new component2.ListChill<>();
        listChill38 = new component2.ListChill<>();
        listChill39 = new component2.ListChill<>();
        listChill40 = new component2.ListChill<>();
        listChill41 = new component2.ListChill<>();
        listChill42 = new component2.ListChill<>();
        listChill43 = new component2.ListChill<>();
        listChill44 = new component2.ListChill<>();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tổng Hợp Topic");

        listChill1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listChill1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listChill1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill13, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill16, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill15, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill17, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill19, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill20, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill18, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill22, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill23, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill24, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill27, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill28, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill26, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill25, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill32, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill31, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill29, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill30, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill35, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill34, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill36, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill33, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill40, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill39, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill38, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill37, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill44, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill42, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill43, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill41, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill8, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill10, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill11, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill12, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill13, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill16, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill14, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill15, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill17, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill19, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill20, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill18, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill21, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill22, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill23, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill24, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill27, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill28, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill26, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill25, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill32, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill31, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill29, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill30, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill35, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill34, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill36, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill33, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill40, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill39, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill38, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill37, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listChill44, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill42, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill43, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listChill41, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listChill1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listChill1MouseEntered
        listChill1.setBackground(new Color(0, 0, 0, 150));
    }//GEN-LAST:event_listChill1MouseEntered

    private void listChill1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listChill1MouseExited
       listChill1.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_listChill1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private component2.ListChill<String> listChill1;
    private component2.ListChill<String> listChill10;
    private component2.ListChill<String> listChill11;
    private component2.ListChill<String> listChill12;
    private component2.ListChill<String> listChill13;
    private component2.ListChill<String> listChill14;
    private component2.ListChill<String> listChill15;
    private component2.ListChill<String> listChill16;
    private component2.ListChill<String> listChill17;
    private component2.ListChill<String> listChill18;
    private component2.ListChill<String> listChill19;
    private component2.ListChill<String> listChill2;
    private component2.ListChill<String> listChill20;
    private component2.ListChill<String> listChill21;
    private component2.ListChill<String> listChill22;
    private component2.ListChill<String> listChill23;
    private component2.ListChill<String> listChill24;
    private component2.ListChill<String> listChill25;
    private component2.ListChill<String> listChill26;
    private component2.ListChill<String> listChill27;
    private component2.ListChill<String> listChill28;
    private component2.ListChill<String> listChill29;
    private component2.ListChill<String> listChill3;
    private component2.ListChill<String> listChill30;
    private component2.ListChill<String> listChill31;
    private component2.ListChill<String> listChill32;
    private component2.ListChill<String> listChill33;
    private component2.ListChill<String> listChill34;
    private component2.ListChill<String> listChill35;
    private component2.ListChill<String> listChill36;
    private component2.ListChill<String> listChill37;
    private component2.ListChill<String> listChill38;
    private component2.ListChill<String> listChill39;
    private component2.ListChill<String> listChill4;
    private component2.ListChill<String> listChill40;
    private component2.ListChill<String> listChill41;
    private component2.ListChill<String> listChill42;
    private component2.ListChill<String> listChill43;
    private component2.ListChill<String> listChill44;
    private component2.ListChill<String> listChill5;
    private component2.ListChill<String> listChill6;
    private component2.ListChill<String> listChill7;
    private component2.ListChill<String> listChill8;
    private component2.ListChill<String> listChill9;
    // End of variables declaration//GEN-END:variables
}
