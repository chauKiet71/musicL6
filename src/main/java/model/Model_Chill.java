
package model;

import javax.swing.Icon;


public class Model_Chill {
    private Icon image;
    private String title;

    public Model_Chill() {
    }

    public Model_Chill(Icon image, String title) {
        this.image = image;
        this.title = title;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
