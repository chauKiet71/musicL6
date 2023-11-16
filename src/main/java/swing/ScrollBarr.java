package swing;

//import java.awt.Color;
//import java.awt.Dimension;
//import javax.swing.JScrollBar;
//
//
//public class ScrollBarr extends JScrollBar{
//        public ScrollBarr() {
//        setUI(new ModernScrollBarUI());
//        setPreferredSize(new Dimension(5, 5));
//        setBackground(new Color(239, 32, 130));
//        setUnitIncrement(20);
//    }
//}
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;

import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class ScrollBarr extends JScrollBar {

    public ScrollBarr() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(239, 32, 130));
        setUnitIncrement(80);
    }

    private static class ModernScrollBarUI extends BasicScrollBarUI {

        private Color trackColor = Color.WHITE;
        private Color thumbColor = new Color(239, 32, 130);

        @Override
        protected void configureScrollBarColors() {
            this.trackColor = Color.WHITE;
            this.thumbColor = new Color(239, 32, 130);
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
            g.setColor(trackColor);
            g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            g.setColor(thumbColor);
            g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
        }
    }
}
