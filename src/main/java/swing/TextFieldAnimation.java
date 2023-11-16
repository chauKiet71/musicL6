
package swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author PC
 */
public class TextFieldAnimation extends JTextField {

    private Color backgroundColor = Color.BLACK;
    private Color colorAnimation = new Color(239,32,130);
    private Icon iconSearch;
    private String hintText = "Bạn muốn nghe gì";

    public TextFieldAnimation() {
        setBackground(new Color(255, 255, 255, 0));//remove background
        setOpaque(false);
        setForeground(new Color(244,246,248));
        setBorder(new EmptyBorder(10, 10, 10, 50));//set right border 50
        setFont(new java.awt.Font("Dialog", 0, 14));
        setSelectionColor(new Color(80, 199, 255));
        iconSearch = new ImageIcon(getClass().getResource("/icon/search/search.png"));
        //create and check if mouse over button
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                if (chechMouseOver(e.getPoint())) {
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                } else {
                    setCursor(new Cursor(Cursor.TEXT_CURSOR));
                }
            }

        });
        //create mouse click
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            }

        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//for smoot line
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);//for smoot image
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, width, height, height, height);
        super.paintComponent(g);
        //create button
        int marginButton = 5;
        int buttonSize = height - marginButton * 2;
        GradientPaint gra = new GradientPaint(0, 0, new Color(255, 255, 255), width, 0, colorAnimation);
        g2.setPaint(gra);
        g2.fillOval(width - height + 3, marginButton, buttonSize, buttonSize);
        //create button icon
        int marginImage = 5;
        int imageSize = buttonSize - marginImage * 2;
        Image image = ((ImageIcon) iconSearch).getImage();
        g2.drawImage(image, width - height + marginImage + 3, marginButton + marginImage, imageSize, imageSize, null);
        g2.dispose();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (getText().length() == 0) {
            int h = getHeight();
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            int c0 = getBackground().getRGB();
            int c1 = getForeground().getRGB();
            int m = 0xfefefefe;
            int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
            g.setColor(new Color(c2, true));
            g.drawString(hintText, ins.left, h / 2 + fm.getAscent() / 2 - 2);
        }
    }

    private boolean chechMouseOver(Point mouse) {
        int width = getWidth();
        int height = getHeight();
        int marginButon = 5;
        int buttonSize = height - marginButon * 2;
        Point point = new Point(width - height + 3, marginButon);
        Ellipse2D.Double circle = new Ellipse2D.Double(point.x, point.y, buttonSize, buttonSize);
        return circle.contains(mouse);
    }
}
