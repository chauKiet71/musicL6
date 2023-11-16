package form;

import dao.*;
import entity.TaiKhoan;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import utils.*;
import main.Main;
import dao.TaiKhoanDAO;
import entity.AccountData;
import entity.NguoiDung;
//import org.mindrot.jbcrypt.BCrypt;

public class LogIn extends javax.swing.JFrame {

    Color color = new Color(239, 32, 130);

    public LogIn() {
        initComponents();
        init();
        this.lbLoading.setVisible(false);
        String tenTk = txtName.getText();
        AccountData.setTenTK(tenTk);
    }
    TaiKhoanDAO dao = new TaiKhoanDAO();

    public void init() {
        txtName.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/user.png")));
        txtName.setHint("Username");
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/icon/pass.png")));
        txtPass.setHint("Password");
        btnLogin.setBackground(color);
        btnLogin.setForeground(Color.WHITE);
        btnSignup.setBackground(color);
        btnSignup.setForeground(Color.WHITE);
    }

    void dangNhap() {
        String tenTK = txtName.getText();
        String matKhau = new String(txtPass.getPassword());
//        boolean mahoa = bcryrt(matKhau, nv.getMatKhau());
        TaiKhoan tk = dao.selectById(tenTK);
        if (tk != null) {
            if (!matKhau.equals(tk.getMatKhau())) {
                msgBox.alertError(this, "Tên tài khoản hoặc mật khẩu không đúng");
            } else {
                // Tạo một Timer để chuyển đến form chính sau 3 giây
                lbLoading.setVisible(true);
                Timer formTimer = new Timer(2000, event -> {
                    // Chuyển đến form chính sau 3 giây
                    Main mn = new Main();
                    mn.setVisible(true);
                    this.dispose();
                });
                formTimer.setRepeats(false);
                formTimer.start();
            }

        } else {
            msgBox.alertError(this, "Tên tài khoản hoặc mật khẩu không đúng");
        }
    }

    void openDangKy() {
        lbLoading.setVisible(true);
        Timer formTimer = new Timer(2000, event -> {
            // Chuyển đến form chính sau 2 giây
            Signup su = new Signup();
            su.setVisible(true);
            this.dispose();
        });
        formTimer.setRepeats(false);
        formTimer.start();
    }

//    boolean bcryrt(String pass, String hash) {
//        return BCrypt.checkpw(pass, hash);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLoading = new javax.swing.JLabel();
        panel1 = new swing.Panel();
        lbOut = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new swing.MyPasswordField();
        txtName = new swing.MyTextField();
        btnLogin = new swing.Button();
        btnSignup = new swing.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jlabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLoading.setForeground(new java.awt.Color(51, 255, 0));
        lbLoading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loading.gif"))); // NOI18N
        getContentPane().add(lbLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 90, 50));

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setOpaque(true);
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbOut.setForeground(new java.awt.Color(239, 32, 130));
        lbOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOut.setText("X");
        lbOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbOut.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbOutMouseMoved(evt);
            }
        });
        lbOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbOutMouseExited(evt);
            }
        });
        panel1.add(lbOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Đăng nhập");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 142, 120, 30));

        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setText("adminpass2");
        txtPass.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        panel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 258, 278, -1));

        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setText("admin2");
        txtName.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        panel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 190, 278, -1));

        btnLogin.setBorder(null);
        btnLogin.setText("Đăng nhập");
        btnLogin.setFocusPainted(false);
        btnLogin.setFocusable(false);
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 351, 278, 44));

        btnSignup.setBorder(null);
        btnSignup.setText("Đăng ký");
        btnSignup.setFocusPainted(false);
        btnSignup.setFocusable(false);
        btnSignup.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        panel1.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 457, 278, 44));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Quên mật khẩu?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 317, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bạn chưa có tài khoản?");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 150, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOpaque(true);
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 423, 60, -1));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOpaque(true);
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 423, 60, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Điều khoản ứng dụng.");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Xem chi tiết.");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, -1, -1));

        Jlabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Music.png"))); // NOI18N
        panel1.add(Jlabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbOutMouseClicked

    private void lbOutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseMoved

    }//GEN-LAST:event_lbOutMouseMoved

    private void lbOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseEntered
        lbOut.setForeground(new Color(255, 102, 102));
    }//GEN-LAST:event_lbOutMouseEntered

    private void lbOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseExited
        lbOut.setForeground(new Color(239, 32, 130));
    }//GEN-LAST:event_lbOutMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        dangNhap();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        openDangKy();
    }//GEN-LAST:event_btnSignupActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel7;
    private swing.Button btnLogin;
    private swing.Button btnSignup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbLoading;
    private javax.swing.JLabel lbOut;
    private swing.Panel panel1;
    private swing.MyTextField txtName;
    private swing.MyPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
