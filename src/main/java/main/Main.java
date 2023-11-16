package main;

import KhamPha_BaiHat.BaiHat;
import KhamPha_NgheSi.NgheSi;
import KhamPha_PlayList.PlayList;
import Menu.MenuEvent;
import NgheGiHomNay.Top100;
import NgheGiHomNay.TuyenTap;
import NhacCuaToi.BaiHatYeuThich;
import NhacCuaToi.DaTaiLen;
import NhacCuaToi.NgheGanDay;
import NhacCuaToi.TaoPlaylist;
import TimKiem.TimKiem_TatCa;
import entity.BaiHatEntity;
import entity.BaiHatStateManager;
import form.FormTimKiemItem;
import form.Form_ChuDe;
import form.Form_TrangChu;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import swing.ScrollBarr;
import utils.EventManager;
import javazoom.jl.player.Player;

public class Main extends javax.swing.JFrame {

    private Player player;
    private long totalLength;
    private long pausePosition;
    private FileInputStream fis;
//    private File myfile = null;
    private BufferedInputStream bis;
    private boolean isPaused;
    public TimKiem_TatCa songpanel;

    private boolean isPlaying = false;
    BaiHatStateManager manager = new BaiHatStateManager();

    public Main() {
        initComponents();
        content.setVerticalScrollBar(new ScrollBarr());
        menu1.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                if (index == 0) {
                    FormTimKiemItem wel = new FormTimKiemItem();
                    setPanel(wel);
                    lbTitle.setText("Tìm kiếm");
                } else if (index == 1) {
                    Form_TrangChu wel = new Form_TrangChu();
                    setPanel(wel);
                    lbTitle.setText("Trang Chủ");
                } else if (index == 2 && subIndex == 1) {
                    BaiHat wel = new BaiHat();
                    setPanel(wel);
                    lbTitle.setText("Bài Hát");
                } else if (index == 2 && subIndex == 2) {
                    PlayList wel = new PlayList();
                    setPanel(wel);
                    lbTitle.setText("Playlist");
                } else if (index == 2 && subIndex == 4) {
                    NgheSi wel = new NgheSi();
                    setPanel(wel);
                    lbTitle.setText("Nghệ Sỹ");
                } else if (index == 3 && subIndex == 1) {
                    Form_ChuDe wel = new Form_ChuDe();
                    setPanel(wel);
                    lbTitle.setText("Chủ Đề");
                } else if (index == 3 && subIndex == 2) {
                    TuyenTap wel = new TuyenTap();
                    setPanel(wel);
                    lbTitle.setText("Tuyển Tập");
                } else if (index == 3 && subIndex == 3) {
                    Top100 wel = new Top100();
                    setPanel(wel);
                    lbTitle.setText("Top 100");
                } else if (index == 4 && subIndex == 1) {
                    NgheGanDay wel = new NgheGanDay();
                    setPanel(wel);
                    lbTitle.setText("Nghe Gần Đây");
                } else if (index == 4 && subIndex == 2) {
                    BaiHatYeuThich wel = new BaiHatYeuThich();
                    setPanel(wel);
                    lbTitle.setText("Bài Hát Yêu Thích");
                } else if (index == 4 && subIndex == 3) {
                    TaoPlaylist wel = new TaoPlaylist();
                    setPanel(wel);
                    lbTitle.setText("Playlist");
                } else if (index == 4 && subIndex == 4) {
                    DaTaiLen wel = new DaTaiLen();
                    setPanel(wel);
                    lbTitle.setText("Đã Tải Lên");
                } else {
                    JOptionPane.showMessageDialog(null, index + " " + subIndex);
                }
            }
        }
        );

        init();

        EventManager.addListener(Form_TrangChu.BAI_HAT_SELECTED_EVENT, (event, data) -> {
            if (data instanceof BaiHatEntity) {
                BaiHatEntity selectedBaiHat = (BaiHatEntity) data;
                manager.setSelectedBaiHat(selectedBaiHat);
                fillMusic(selectedBaiHat);
            }
        });
    }

//    thêm các Jpanel Form vào Main chính
    public void setPanel(JComponent panel) {
        panel.setSize(926, 3000);
        panel.setLocation(0, 0);
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        content.setViewportView(scrollPane);
    }

//    thêm ảnh và các thông tin mặc định cho from phát nhạc
    public void init() {
        try {
            BufferedImage originalImage = ImageIO.read(getClass().getResource("/icon/Music/MainMusic.jpg"));

            int width = lbanh.getWidth();
            int height = lbanh.getHeight();

            // Tạo ảnh mới với đường viền bo góc và kích thước vừa với lbanh
            BufferedImage roundedImage = createRoundedImage(originalImage, width, height);

            // Tạo ImageIcon từ ảnh mới và thiết lập cho lbanh
            ImageIcon roundedImageIcon = new ImageIcon(roundedImage);
            lbanh.setIcon(roundedImageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
        lbName.setText("Nghe Nhạc Thôi Nào!");
        lbName2.setText("NhacCuaTao");
    }

//    khi một bài hát trong bảng được chọn sẽ gửi sự kiện đến main và gọi hàm fillMusic để đặc các thông tin liên quan đến bài hát vào form phát nhạc và phát nhạc
    public void fillMusic(BaiHatEntity selectedBaiHat) {
        lbName.setText(selectedBaiHat.getTenBh());
        lbName2.setText(selectedBaiHat.getCaSi());
        lbTimeEnd.setText(selectedBaiHat.getThoiGian());
        lbPlay.setIcon(new ImageIcon(getClass().getResource("/icon/stopmusic.png")));

        try {
            BufferedImage originalImage = ImageIO.read(getClass().getResource(selectedBaiHat.getAnh()));

            int width = lbanh.getWidth();
            int height = lbanh.getHeight();

            // Tạo ảnh mới với đường viền bo góc và kích thước vừa với lbanh
            BufferedImage roundedImage = createRoundedImage(originalImage, width, height);

            // Tạo ImageIcon từ ảnh mới và thiết lập cho lbanh
            ImageIcon roundedImageIcon = new ImageIcon(roundedImage);
            lbanh.setIcon(roundedImageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String fileString = selectedBaiHat.getAmThanh();
        File file = new File(fileString);
        play(file);
    }

    private BufferedImage createRoundedImage(BufferedImage originalImage, int width, int height) {
        BufferedImage roundedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2 = roundedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setClip(new RoundRectangle2D.Float(0, 0, width, height, 20, 20)); // Điều chỉnh bán kính bo góc ở đây
        g2.drawImage(originalImage, 0, 0, width, height, null);

        g2.setColor(new Color(38, 46, 57)); // Màu sắc của đường viền
        g2.setStroke(new BasicStroke(1)); // Độ đậm của đường viền
        g2.drawRoundRect(0, 0, width, height, 20, 20); // Vẽ đường viền

        g2.dispose();

        return roundedImage;
    }

//    hàm play dùng để phát nhạc, đưa vào một đường dẫn tuyệt đối đến bài hát
    private void play(File file) {
        try {
            if (player != null) {
                isPlaying = false; // Dừng phát nhạc
                player.close(); // Giải phóng tài nguyên
            }

            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
            totalLength = fis.available();
            isPlaying = true; // Bắt đầu phát nhạc

            new Thread() {
                public void run() {
                    try {
                        player.play();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        try {
            if (player != null) {
                if (isPaused) {
                    // Nếu đang tạm ngừng, thì tiếp tục phát nhạc từ vị trí đã tạm ngưng
//                    File file = new File(manager.getSelectedBaiHat().getAmThanh());
//                    player = new Player(new FileInputStream(file));              // Thay đổi đường dẫn tương ứng
                    lbPlay.setIcon(new ImageIcon(getClass().getResource("/icon/stopmusic.png")));
                    player.play((int) pausePosition);
                    System.out.println(isPaused + "       1");
                    System.out.println("Pausing playback at position: " + pausePosition);
                } else {
                    // Nếu đang phát, thì tạm ngừng và lưu vị trí tạm ngưng
                    lbPlay.setIcon(new ImageIcon(getClass().getResource("/icon/playmusic.png")));
                    pausePosition = player.getPosition();
                    player.close();
                    System.out.println(isPaused + "       2");
                    System.out.println("Pausing playback at position: " + pausePosition);
                }
                isPaused = !isPaused;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new swing.Panel();
        move = new component.header();
        lbOut = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        content = new javax.swing.JScrollPane();
        formTrangChu1 = new form.FormTrangChu();
        jPanel2 = new javax.swing.JPanel();
        account1 = new component.Account();
        jSeparator1 = new javax.swing.JSeparator();
        body = new javax.swing.JPanel();
        menu1 = new Menu.Menu();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button1 = new swing.Button();
        jLabel2 = new javax.swing.JLabel();
        lbTimeEnd = new javax.swing.JLabel();
        slider1 = new swing.Slider();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbPlay = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelBorder1 = new swing.PanelBorder();
        lbName = new javax.swing.JLabel();
        lbName2 = new javax.swing.JLabel();
        lbanh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(29, 38, 49));
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setOpaque(true);

        move.setBackground(new java.awt.Color(29, 38, 49));
        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                moveMouseMoved(evt);
            }
        });

        lbOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbOut.setForeground(new java.awt.Color(255, 0, 0));
        lbOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOut.setText("X");
        lbOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Trang Chủ");

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOpaque(true);

        javax.swing.GroupLayout moveLayout = new javax.swing.GroupLayout(move);
        move.setLayout(moveLayout);
        moveLayout.setHorizontalGroup(
            moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moveLayout.createSequentialGroup()
                .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbOut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        moveLayout.setVerticalGroup(
            moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moveLayout.createSequentialGroup()
                .addGroup(moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(moveLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbOut))
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        content.setBackground(new java.awt.Color(29, 38, 49));
        content.setBorder(null);
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        content.setHorizontalScrollBar(null);
        content.setViewportView(formTrangChu1);

        jPanel2.setBackground(new java.awt.Color(29, 38, 49));

        account1.setBackground(new java.awt.Color(29, 38, 49));
        account1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOpaque(true);

        body.setOpaque(false);

        menu1.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(body, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(account1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(account1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOpaque(true);

        jPanel1.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/speaker.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        button1.setBackground(new java.awt.Color(38, 46, 57));
        button1.setBorder(null);
        button1.setForeground(new java.awt.Color(204, 204, 204));
        button1.setText("Danh Sách Phát");
        button1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/love_bot.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbTimeEnd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTimeEnd.setForeground(new java.awt.Color(255, 255, 255));
        lbTimeEnd.setText("03:21");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("00:00");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/play.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/playmusic.png"))); // NOI18N
        lbPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPlayMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/repeat.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        panelBorder1.setBackground(new java.awt.Color(38, 46, 57));

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Lạc Trôi");

        lbName2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbName2.setForeground(new java.awt.Color(204, 204, 204));
        lbName2.setText("Sơn Tùng M-TP");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbName2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(lbanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbanh, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbTimeEnd))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addComponent(lbPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTimeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseExited
        lbOut.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_lbOutMouseExited

    private void lbOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseEntered
        lbOut.setForeground(new Color(153, 0, 0));
    }//GEN-LAST:event_lbOutMouseEntered

    private void lbOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbOutMouseClicked
    private int x;
    private int y;

    private void moveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseMoved
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_moveMouseMoved

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_moveMouseDragged

    private void lbPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPlayMouseClicked
        pause();
    }//GEN-LAST:event_lbPlayMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Account account1;
    private javax.swing.JPanel body;
    private swing.Button button1;
    private javax.swing.JScrollPane content;
    private form.FormTrangChu formTrangChu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName2;
    private javax.swing.JLabel lbOut;
    private javax.swing.JLabel lbPlay;
    private javax.swing.JLabel lbTimeEnd;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbanh;
    private Menu.Menu menu1;
    private component.header move;
    private swing.Panel panel1;
    private swing.PanelBorder panelBorder1;
    private swing.Slider slider1;
    // End of variables declaration//GEN-END:variables
}
