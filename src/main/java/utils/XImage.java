/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class XImage {

    public static void save(File src) {
        File dst = new File("logos", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static ImageIcon read(String fileName, int with, int height) {
        File path = new File("logos", fileName);
        ImageIcon imageicon = new ImageIcon(path.getAbsolutePath());
        Image image = imageicon.getImage().getScaledInstance(with, height, Image.SCALE_AREA_AVERAGING);
        return new ImageIcon(image);
    }
}
