package form;

import SlideShow.Slidechude1;
import SlideShow.Slidechude2;
import SlideShow.Slidechude3;
import SlideShow.Slidechude4;


public class Form_ChuDe extends javax.swing.JLayeredPane {

    public Form_ChuDe() {
        initComponents();
        init();

    }

    public void init() {
        slideShow1.initSlideshow(new Slidechude1(), new Slidechude2(), new Slidechude3(), new Slidechude4());
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTable1 = new Table.TableMusic();
        slideShow1 = new SlideShow.SlideShow();
        chuDe1 = new NgheGiHomNay.ChuDe();

        setBackground(new java.awt.Color(29, 38, 49));
        setOpaque(true);

        setLayer(slideShow1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(chuDe1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slideShow1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(chuDe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(slideShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(chuDe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private NgheGiHomNay.ChuDe chuDe1;
    private Table.TableMusic jTable1;
    private SlideShow.SlideShow slideShow1;
    // End of variables declaration//GEN-END:variables
}
