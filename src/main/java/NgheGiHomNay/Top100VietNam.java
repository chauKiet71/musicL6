package NgheGiHomNay;

import Table.Model_Table;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class Top100VietNam extends javax.swing.JPanel {

    public Top100VietNam() {
        initComponents();
        init();
//        initTableData();
    }

    public void init() {
        TableColumn nameColumn = table1.getColumnModel().getColumn(0);
        nameColumn.setPreferredWidth(350); // Đặt chiều ngang mong muốn

        TableColumn ageColumn = table1.getColumnModel().getColumn(1);
        ageColumn.setPreferredWidth(250); // Đặt chiều ngang mong muốn

        TableColumn genderColumn = table1.getColumnModel().getColumn(2);
        genderColumn.setPreferredWidth(90); // Đặt chiều ngang mong muốn

        TableColumn timeColumn = table1.getColumnModel().getColumn(3);
        timeColumn.setPreferredWidth(40); // Đặt chiều ngang mong muốn
    }

//    private void initTableData() {
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/nhiptraitim.jpg")), "Nhịp Trái Tim", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/anhsedoi.jpg")), "Anh Sẽ Đợi", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/nangamxadan.jpg")), "Nắng Ấm Xa Dần", "Sơn Tùng M-TP", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/codonglon.jpg")), "Cổ Đông Lớn", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/dungsai.jpg")), "Đừng Sai", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/tungquen.jpg")), "Từng Quen", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/nolovenolife.jpg")), "No Love No Life", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/saitrongnucuoi.jpg")), "Say Trong Nụ Cười", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/vuonhoaconca.jpg")), "Vườn Hoa Con Cá", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Music/hitmeup.jpg")), "Hit Me Up", "Ai Biết", "120K", "03:50").toRowTable());
//        setHoverCursor(table1);
//    }

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        table1 = new Table.TableMusic();
        jPanel2 = new javax.swing.JPanel();
        button1 = new swing.Button();
        button11 = new swing.Button();
        button12 = new swing.Button();
        button13 = new swing.Button();
        button14 = new swing.Button();
        button15 = new swing.Button();
        button16 = new swing.Button();
        button17 = new swing.Button();
        button18 = new swing.Button();
        button19 = new swing.Button();
        button20 = new swing.Button();
        button21 = new swing.Button();
        button22 = new swing.Button();
        button23 = new swing.Button();
        button24 = new swing.Button();
        button25 = new swing.Button();
        button26 = new swing.Button();
        button27 = new swing.Button();
        button28 = new swing.Button();
        button29 = new swing.Button();
        button30 = new swing.Button();
        button31 = new swing.Button();
        button33 = new swing.Button();
        button34 = new swing.Button();
        button35 = new swing.Button();
        button36 = new swing.Button();
        button37 = new swing.Button();
        button38 = new swing.Button();
        button39 = new swing.Button();
        button40 = new swing.Button();
        button41 = new swing.Button();
        button42 = new swing.Button();
        button43 = new swing.Button();
        button44 = new swing.Button();
        button45 = new swing.Button();
        button46 = new swing.Button();
        button47 = new swing.Button();
        button48 = new swing.Button();
        button49 = new swing.Button();
        button50 = new swing.Button();
        button51 = new swing.Button();
        button52 = new swing.Button();
        button53 = new swing.Button();
        button54 = new swing.Button();
        button55 = new swing.Button();
        button56 = new swing.Button();
        button57 = new swing.Button();
        button58 = new swing.Button();
        button59 = new swing.Button();
        button60 = new swing.Button();
        button61 = new swing.Button();
        button62 = new swing.Button();
        button63 = new swing.Button();
        button64 = new swing.Button();
        button65 = new swing.Button();
        button66 = new swing.Button();
        button67 = new swing.Button();
        button68 = new swing.Button();
        button69 = new swing.Button();
        button70 = new swing.Button();
        button71 = new swing.Button();
        button72 = new swing.Button();
        button73 = new swing.Button();
        button74 = new swing.Button();
        button75 = new swing.Button();
        button76 = new swing.Button();
        button77 = new swing.Button();
        button78 = new swing.Button();
        button79 = new swing.Button();
        button80 = new swing.Button();
        button81 = new swing.Button();
        button82 = new swing.Button();
        button83 = new swing.Button();
        button84 = new swing.Button();
        button85 = new swing.Button();
        button86 = new swing.Button();
        button87 = new swing.Button();
        button88 = new swing.Button();
        button89 = new swing.Button();
        button90 = new swing.Button();
        button91 = new swing.Button();
        button92 = new swing.Button();
        button93 = new swing.Button();
        button94 = new swing.Button();
        button95 = new swing.Button();
        button96 = new swing.Button();
        button97 = new swing.Button();
        button98 = new swing.Button();
        button99 = new swing.Button();
        button100 = new swing.Button();
        button101 = new swing.Button();
        button102 = new swing.Button();
        button103 = new swing.Button();
        button104 = new swing.Button();
        button105 = new swing.Button();
        button106 = new swing.Button();
        button107 = new swing.Button();
        button108 = new swing.Button();
        button109 = new swing.Button();
        button110 = new swing.Button();

        setBackground(new java.awt.Color(29, 38, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nhạc Trẻ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Remix Việt");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trữ Tình");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rap Việt");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rock Việt");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cách Mạng");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SlideShow/Thiết kế chưa có tên.png"))); // NOI18N

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

        jPanel2.setOpaque(false);

        button1.setBackground(new java.awt.Color(36, 48, 60));
        button1.setForeground(new java.awt.Color(204, 204, 204));
        button1.setText("1");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button11.setBackground(new java.awt.Color(36, 48, 60));
        button11.setForeground(new java.awt.Color(204, 204, 204));
        button11.setText("2");
        button11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button12.setBackground(new java.awt.Color(36, 48, 60));
        button12.setForeground(new java.awt.Color(204, 204, 204));
        button12.setText("3");
        button12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button13.setBackground(new java.awt.Color(36, 48, 60));
        button13.setForeground(new java.awt.Color(204, 204, 204));
        button13.setText("4");
        button13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button14.setBackground(new java.awt.Color(36, 48, 60));
        button14.setForeground(new java.awt.Color(204, 204, 204));
        button14.setText("5");
        button14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button15.setBackground(new java.awt.Color(36, 48, 60));
        button15.setForeground(new java.awt.Color(204, 204, 204));
        button15.setText("6");
        button15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button16.setBackground(new java.awt.Color(36, 48, 60));
        button16.setForeground(new java.awt.Color(204, 204, 204));
        button16.setText("7");
        button16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button17.setBackground(new java.awt.Color(36, 48, 60));
        button17.setForeground(new java.awt.Color(204, 204, 204));
        button17.setText("8");
        button17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button18.setBackground(new java.awt.Color(36, 48, 60));
        button18.setForeground(new java.awt.Color(204, 204, 204));
        button18.setText("9");
        button18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button19.setBackground(new java.awt.Color(36, 48, 60));
        button19.setForeground(new java.awt.Color(204, 204, 204));
        button19.setText("10");
        button19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button20.setBackground(new java.awt.Color(36, 48, 60));
        button20.setForeground(new java.awt.Color(204, 204, 204));
        button20.setText("11");
        button20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button21.setBackground(new java.awt.Color(36, 48, 60));
        button21.setForeground(new java.awt.Color(204, 204, 204));
        button21.setText("12");
        button21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button22.setBackground(new java.awt.Color(36, 48, 60));
        button22.setForeground(new java.awt.Color(204, 204, 204));
        button22.setText("13");
        button22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button23.setBackground(new java.awt.Color(36, 48, 60));
        button23.setForeground(new java.awt.Color(204, 204, 204));
        button23.setText("14");
        button23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button24.setBackground(new java.awt.Color(36, 48, 60));
        button24.setForeground(new java.awt.Color(204, 204, 204));
        button24.setText("15");
        button24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button25.setBackground(new java.awt.Color(36, 48, 60));
        button25.setForeground(new java.awt.Color(204, 204, 204));
        button25.setText("16");
        button25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button26.setBackground(new java.awt.Color(36, 48, 60));
        button26.setForeground(new java.awt.Color(204, 204, 204));
        button26.setText("17");
        button26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button27.setBackground(new java.awt.Color(36, 48, 60));
        button27.setForeground(new java.awt.Color(204, 204, 204));
        button27.setText("18");
        button27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button28.setBackground(new java.awt.Color(36, 48, 60));
        button28.setForeground(new java.awt.Color(204, 204, 204));
        button28.setText("19");
        button28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button29.setBackground(new java.awt.Color(36, 48, 60));
        button29.setForeground(new java.awt.Color(204, 204, 204));
        button29.setText("20");
        button29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button30.setBackground(new java.awt.Color(36, 48, 60));
        button30.setForeground(new java.awt.Color(204, 204, 204));
        button30.setText("21");
        button30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button31.setBackground(new java.awt.Color(36, 48, 60));
        button31.setForeground(new java.awt.Color(204, 204, 204));
        button31.setText("22");
        button31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button33.setBackground(new java.awt.Color(36, 48, 60));
        button33.setForeground(new java.awt.Color(204, 204, 204));
        button33.setText("23");
        button33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button34.setBackground(new java.awt.Color(36, 48, 60));
        button34.setForeground(new java.awt.Color(204, 204, 204));
        button34.setText("24");
        button34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button35.setBackground(new java.awt.Color(36, 48, 60));
        button35.setForeground(new java.awt.Color(204, 204, 204));
        button35.setText("25");
        button35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button36.setBackground(new java.awt.Color(36, 48, 60));
        button36.setForeground(new java.awt.Color(204, 204, 204));
        button36.setText("26");
        button36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button37.setBackground(new java.awt.Color(36, 48, 60));
        button37.setForeground(new java.awt.Color(204, 204, 204));
        button37.setText("27");
        button37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button38.setBackground(new java.awt.Color(36, 48, 60));
        button38.setForeground(new java.awt.Color(204, 204, 204));
        button38.setText("28");
        button38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button39.setBackground(new java.awt.Color(36, 48, 60));
        button39.setForeground(new java.awt.Color(204, 204, 204));
        button39.setText("29");
        button39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button40.setBackground(new java.awt.Color(36, 48, 60));
        button40.setForeground(new java.awt.Color(204, 204, 204));
        button40.setText("30");
        button40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button41.setBackground(new java.awt.Color(36, 48, 60));
        button41.setForeground(new java.awt.Color(204, 204, 204));
        button41.setText("31");
        button41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button42.setBackground(new java.awt.Color(36, 48, 60));
        button42.setForeground(new java.awt.Color(204, 204, 204));
        button42.setText("32");
        button42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button43.setBackground(new java.awt.Color(36, 48, 60));
        button43.setForeground(new java.awt.Color(204, 204, 204));
        button43.setText("33");
        button43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button44.setBackground(new java.awt.Color(36, 48, 60));
        button44.setForeground(new java.awt.Color(204, 204, 204));
        button44.setText("34");
        button44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button45.setBackground(new java.awt.Color(36, 48, 60));
        button45.setForeground(new java.awt.Color(204, 204, 204));
        button45.setText("35");
        button45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button46.setBackground(new java.awt.Color(36, 48, 60));
        button46.setForeground(new java.awt.Color(204, 204, 204));
        button46.setText("36");
        button46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button47.setBackground(new java.awt.Color(36, 48, 60));
        button47.setForeground(new java.awt.Color(204, 204, 204));
        button47.setText("37");
        button47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button48.setBackground(new java.awt.Color(36, 48, 60));
        button48.setForeground(new java.awt.Color(204, 204, 204));
        button48.setText("38");
        button48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button49.setBackground(new java.awt.Color(36, 48, 60));
        button49.setForeground(new java.awt.Color(204, 204, 204));
        button49.setText("39");
        button49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button50.setBackground(new java.awt.Color(36, 48, 60));
        button50.setForeground(new java.awt.Color(204, 204, 204));
        button50.setText("40");
        button50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button51.setBackground(new java.awt.Color(36, 48, 60));
        button51.setForeground(new java.awt.Color(204, 204, 204));
        button51.setText("41");
        button51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button52.setBackground(new java.awt.Color(36, 48, 60));
        button52.setForeground(new java.awt.Color(204, 204, 204));
        button52.setText("42");
        button52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button53.setBackground(new java.awt.Color(36, 48, 60));
        button53.setForeground(new java.awt.Color(204, 204, 204));
        button53.setText("43");
        button53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button54.setBackground(new java.awt.Color(36, 48, 60));
        button54.setForeground(new java.awt.Color(204, 204, 204));
        button54.setText("44");
        button54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button55.setBackground(new java.awt.Color(36, 48, 60));
        button55.setForeground(new java.awt.Color(204, 204, 204));
        button55.setText("45");
        button55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button56.setBackground(new java.awt.Color(36, 48, 60));
        button56.setForeground(new java.awt.Color(204, 204, 204));
        button56.setText("46");
        button56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button57.setBackground(new java.awt.Color(36, 48, 60));
        button57.setForeground(new java.awt.Color(204, 204, 204));
        button57.setText("47");
        button57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button58.setBackground(new java.awt.Color(36, 48, 60));
        button58.setForeground(new java.awt.Color(204, 204, 204));
        button58.setText("48");
        button58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button59.setBackground(new java.awt.Color(36, 48, 60));
        button59.setForeground(new java.awt.Color(204, 204, 204));
        button59.setText("49");
        button59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button60.setBackground(new java.awt.Color(36, 48, 60));
        button60.setForeground(new java.awt.Color(204, 204, 204));
        button60.setText("50");
        button60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button61.setBackground(new java.awt.Color(36, 48, 60));
        button61.setForeground(new java.awt.Color(204, 204, 204));
        button61.setText("52");
        button61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button62.setBackground(new java.awt.Color(36, 48, 60));
        button62.setForeground(new java.awt.Color(204, 204, 204));
        button62.setText("51");
        button62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button63.setBackground(new java.awt.Color(36, 48, 60));
        button63.setForeground(new java.awt.Color(204, 204, 204));
        button63.setText("53");
        button63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button64.setBackground(new java.awt.Color(36, 48, 60));
        button64.setForeground(new java.awt.Color(204, 204, 204));
        button64.setText("54");
        button64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button65.setBackground(new java.awt.Color(36, 48, 60));
        button65.setForeground(new java.awt.Color(204, 204, 204));
        button65.setText("55");
        button65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button66.setBackground(new java.awt.Color(36, 48, 60));
        button66.setForeground(new java.awt.Color(204, 204, 204));
        button66.setText("56");
        button66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button67.setBackground(new java.awt.Color(36, 48, 60));
        button67.setForeground(new java.awt.Color(204, 204, 204));
        button67.setText("57");
        button67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button68.setBackground(new java.awt.Color(36, 48, 60));
        button68.setForeground(new java.awt.Color(204, 204, 204));
        button68.setText("58");
        button68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button69.setBackground(new java.awt.Color(36, 48, 60));
        button69.setForeground(new java.awt.Color(204, 204, 204));
        button69.setText("59");
        button69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button70.setBackground(new java.awt.Color(36, 48, 60));
        button70.setForeground(new java.awt.Color(204, 204, 204));
        button70.setText("60");
        button70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button71.setBackground(new java.awt.Color(36, 48, 60));
        button71.setForeground(new java.awt.Color(204, 204, 204));
        button71.setText("61");
        button71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button72.setBackground(new java.awt.Color(36, 48, 60));
        button72.setForeground(new java.awt.Color(204, 204, 204));
        button72.setText("62");
        button72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button73.setBackground(new java.awt.Color(36, 48, 60));
        button73.setForeground(new java.awt.Color(204, 204, 204));
        button73.setText("63");
        button73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button74.setBackground(new java.awt.Color(36, 48, 60));
        button74.setForeground(new java.awt.Color(204, 204, 204));
        button74.setText("64");
        button74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button75.setBackground(new java.awt.Color(36, 48, 60));
        button75.setForeground(new java.awt.Color(204, 204, 204));
        button75.setText("66");
        button75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button76.setBackground(new java.awt.Color(36, 48, 60));
        button76.setForeground(new java.awt.Color(204, 204, 204));
        button76.setText("65");
        button76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button77.setBackground(new java.awt.Color(36, 48, 60));
        button77.setForeground(new java.awt.Color(204, 204, 204));
        button77.setText("67");
        button77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button78.setBackground(new java.awt.Color(36, 48, 60));
        button78.setForeground(new java.awt.Color(204, 204, 204));
        button78.setText("68");
        button78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button79.setBackground(new java.awt.Color(36, 48, 60));
        button79.setForeground(new java.awt.Color(204, 204, 204));
        button79.setText("69");
        button79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button80.setBackground(new java.awt.Color(36, 48, 60));
        button80.setForeground(new java.awt.Color(204, 204, 204));
        button80.setText("70");
        button80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button81.setBackground(new java.awt.Color(36, 48, 60));
        button81.setForeground(new java.awt.Color(204, 204, 204));
        button81.setText("71");
        button81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button82.setBackground(new java.awt.Color(36, 48, 60));
        button82.setForeground(new java.awt.Color(204, 204, 204));
        button82.setText("72");
        button82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button83.setBackground(new java.awt.Color(36, 48, 60));
        button83.setForeground(new java.awt.Color(204, 204, 204));
        button83.setText("73");
        button83.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button84.setBackground(new java.awt.Color(36, 48, 60));
        button84.setForeground(new java.awt.Color(204, 204, 204));
        button84.setText("74");
        button84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button85.setBackground(new java.awt.Color(36, 48, 60));
        button85.setForeground(new java.awt.Color(204, 204, 204));
        button85.setText("75");
        button85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button86.setBackground(new java.awt.Color(36, 48, 60));
        button86.setForeground(new java.awt.Color(204, 204, 204));
        button86.setText("76");
        button86.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button87.setBackground(new java.awt.Color(36, 48, 60));
        button87.setForeground(new java.awt.Color(204, 204, 204));
        button87.setText("77");
        button87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button88.setBackground(new java.awt.Color(36, 48, 60));
        button88.setForeground(new java.awt.Color(204, 204, 204));
        button88.setText("78");
        button88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button89.setBackground(new java.awt.Color(36, 48, 60));
        button89.setForeground(new java.awt.Color(204, 204, 204));
        button89.setText("79");
        button89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button90.setBackground(new java.awt.Color(36, 48, 60));
        button90.setForeground(new java.awt.Color(204, 204, 204));
        button90.setText("80");
        button90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button91.setBackground(new java.awt.Color(36, 48, 60));
        button91.setForeground(new java.awt.Color(204, 204, 204));
        button91.setText("81");
        button91.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button92.setBackground(new java.awt.Color(36, 48, 60));
        button92.setForeground(new java.awt.Color(204, 204, 204));
        button92.setText("82");
        button92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button93.setBackground(new java.awt.Color(36, 48, 60));
        button93.setForeground(new java.awt.Color(204, 204, 204));
        button93.setText("83");
        button93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button94.setBackground(new java.awt.Color(36, 48, 60));
        button94.setForeground(new java.awt.Color(204, 204, 204));
        button94.setText("84");
        button94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button95.setBackground(new java.awt.Color(36, 48, 60));
        button95.setForeground(new java.awt.Color(204, 204, 204));
        button95.setText("85");
        button95.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button96.setBackground(new java.awt.Color(36, 48, 60));
        button96.setForeground(new java.awt.Color(204, 204, 204));
        button96.setText("86");
        button96.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button97.setBackground(new java.awt.Color(36, 48, 60));
        button97.setForeground(new java.awt.Color(204, 204, 204));
        button97.setText("87");
        button97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button98.setBackground(new java.awt.Color(36, 48, 60));
        button98.setForeground(new java.awt.Color(204, 204, 204));
        button98.setText("88");
        button98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button99.setBackground(new java.awt.Color(36, 48, 60));
        button99.setForeground(new java.awt.Color(204, 204, 204));
        button99.setText("89");
        button99.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button100.setBackground(new java.awt.Color(36, 48, 60));
        button100.setForeground(new java.awt.Color(204, 204, 204));
        button100.setText("90");
        button100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button101.setBackground(new java.awt.Color(36, 48, 60));
        button101.setForeground(new java.awt.Color(204, 204, 204));
        button101.setText("91");
        button101.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button102.setBackground(new java.awt.Color(36, 48, 60));
        button102.setForeground(new java.awt.Color(204, 204, 204));
        button102.setText("92");
        button102.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button103.setBackground(new java.awt.Color(36, 48, 60));
        button103.setForeground(new java.awt.Color(204, 204, 204));
        button103.setText("93");
        button103.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button104.setBackground(new java.awt.Color(36, 48, 60));
        button104.setForeground(new java.awt.Color(204, 204, 204));
        button104.setText("94");
        button104.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button105.setBackground(new java.awt.Color(36, 48, 60));
        button105.setForeground(new java.awt.Color(204, 204, 204));
        button105.setText("95");
        button105.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button106.setBackground(new java.awt.Color(36, 48, 60));
        button106.setForeground(new java.awt.Color(204, 204, 204));
        button106.setText("96");
        button106.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button107.setBackground(new java.awt.Color(36, 48, 60));
        button107.setForeground(new java.awt.Color(204, 204, 204));
        button107.setText("97");
        button107.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button108.setBackground(new java.awt.Color(36, 48, 60));
        button108.setForeground(new java.awt.Color(204, 204, 204));
        button108.setText("98");
        button108.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button109.setBackground(new java.awt.Color(36, 48, 60));
        button109.setForeground(new java.awt.Color(204, 204, 204));
        button109.setText("99");
        button109.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button110.setBackground(new java.awt.Color(36, 48, 60));
        button110.setForeground(new java.awt.Color(204, 204, 204));
        button110.setText("100");
        button110.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button107, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button109, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button107, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button109, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

    }//GEN-LAST:event_table1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button100;
    private swing.Button button101;
    private swing.Button button102;
    private swing.Button button103;
    private swing.Button button104;
    private swing.Button button105;
    private swing.Button button106;
    private swing.Button button107;
    private swing.Button button108;
    private swing.Button button109;
    private swing.Button button11;
    private swing.Button button110;
    private swing.Button button12;
    private swing.Button button13;
    private swing.Button button14;
    private swing.Button button15;
    private swing.Button button16;
    private swing.Button button17;
    private swing.Button button18;
    private swing.Button button19;
    private swing.Button button20;
    private swing.Button button21;
    private swing.Button button22;
    private swing.Button button23;
    private swing.Button button24;
    private swing.Button button25;
    private swing.Button button26;
    private swing.Button button27;
    private swing.Button button28;
    private swing.Button button29;
    private swing.Button button30;
    private swing.Button button31;
    private swing.Button button33;
    private swing.Button button34;
    private swing.Button button35;
    private swing.Button button36;
    private swing.Button button37;
    private swing.Button button38;
    private swing.Button button39;
    private swing.Button button40;
    private swing.Button button41;
    private swing.Button button42;
    private swing.Button button43;
    private swing.Button button44;
    private swing.Button button45;
    private swing.Button button46;
    private swing.Button button47;
    private swing.Button button48;
    private swing.Button button49;
    private swing.Button button50;
    private swing.Button button51;
    private swing.Button button52;
    private swing.Button button53;
    private swing.Button button54;
    private swing.Button button55;
    private swing.Button button56;
    private swing.Button button57;
    private swing.Button button58;
    private swing.Button button59;
    private swing.Button button60;
    private swing.Button button61;
    private swing.Button button62;
    private swing.Button button63;
    private swing.Button button64;
    private swing.Button button65;
    private swing.Button button66;
    private swing.Button button67;
    private swing.Button button68;
    private swing.Button button69;
    private swing.Button button70;
    private swing.Button button71;
    private swing.Button button72;
    private swing.Button button73;
    private swing.Button button74;
    private swing.Button button75;
    private swing.Button button76;
    private swing.Button button77;
    private swing.Button button78;
    private swing.Button button79;
    private swing.Button button80;
    private swing.Button button81;
    private swing.Button button82;
    private swing.Button button83;
    private swing.Button button84;
    private swing.Button button85;
    private swing.Button button86;
    private swing.Button button87;
    private swing.Button button88;
    private swing.Button button89;
    private swing.Button button90;
    private swing.Button button91;
    private swing.Button button92;
    private swing.Button button93;
    private swing.Button button94;
    private swing.Button button95;
    private swing.Button button96;
    private swing.Button button97;
    private swing.Button button98;
    private swing.Button button99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private Table.TableMusic table1;
    // End of variables declaration//GEN-END:variables
}
