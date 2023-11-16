package form;

import SlideShow.Slide1;
import SlideShow.Slide2;
import SlideShow.Slide3;
import SlideShow.Slide4;
import Table.Model_Table;
import Table.tableDAO;
import dao.BaiHatDAO;
import entity.BaiHatEntity;
import entity.BaiHatStateManager;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import utils.EventManager;

public class Form_TrangChu extends javax.swing.JLayeredPane {

//    @Autowired
    private FormMainMusic formMainMusic;
    tableDAO tbdao = new tableDAO();
    BaiHatDAO bhDao = new BaiHatDAO();
    public static final String BAI_HAT_SELECTED_EVENT = "BAI_HAT_SELECTED_EVENT";

    public Form_TrangChu() {
        initComponents();
        init();
//        initTableData();
        fillTable();
    }

    public void init() {
        slideShow1.initSlideshow(new Slide1(), new Slide2(), new Slide3(), new Slide4());
        setHoverCursor(table1);
        TableColumn nameColumn = table1.getColumnModel().getColumn(0);
        nameColumn.setPreferredWidth(350); // Đặt chiều ngang mong muốn

        TableColumn ageColumn = table1.getColumnModel().getColumn(1);
        ageColumn.setPreferredWidth(250); // Đặt chiều ngang mong muốn

        TableColumn genderColumn = table1.getColumnModel().getColumn(2);
        genderColumn.setPreferredWidth(90); // Đặt chiều ngang mong muốn

        TableColumn timeColumn = table1.getColumnModel().getColumn(3);
        timeColumn.setPreferredWidth(40); // Đặt chiều ngang mong muốn
    }

    void fillTable() {
        try {
            List<Model_Table> list = tbdao.selectAll();
            for (Model_Table bh : list) {
                table1.addRow(new Model_Table(bh.getIcon(), bh.getName(), bh.getSing(), bh.getView(), bh.getTime(), bh.getMaBh()).toRowTable());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int row = 0;

    void edit() {
        this.row = table1.getSelectedRow();
        String maBh = (String) table1.getValueAt(this.row, 4);

        BaiHatEntity bh = bhDao.selectById(maBh);
        BaiHatStateManager.setSelectedBaiHat(bh);
        EventQueue.invokeLater(() -> {
            EventManager.fireEvent(BAI_HAT_SELECTED_EVENT, bh);
        });
    }

    private static void setHoverCursor(JTable listChill) {
        listChill.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setHandCursor(listChill);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setDefaultCursor(listChill);
            }
        });
    }

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

        jTable1 = new Table.TableMusic();
        slideShow1 = new SlideShow.SlideShow();
        table1 = new Table.TableMusic();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 38, 49));
        setOpaque(true);

        slideShow1.setBackground(new java.awt.Color(29, 38, 49));

        table1.setBorder(null);
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sing", "View", "Time", "Ma"
            }
        ));
        table1.setFocusable(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dành Riêng Cho Bạn");

        setLayer(slideShow1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(table1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slideShow1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(slideShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        edit();
    }//GEN-LAST:event_table1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private Table.TableMusic jTable1;
    private SlideShow.SlideShow slideShow1;
    private Table.TableMusic table1;
    // End of variables declaration//GEN-END:variables
}
