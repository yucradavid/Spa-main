/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pe.edu.upeu.app.util.UtilsX;

/**
 *
 * @author ASUS TUF
 */
public class FondoPanel extends JPanel {

    private Image imagen;
    public String nombreImg = "";
    UtilsX obj = new UtilsX();

    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(obj.getFile("Spa.png")).getImage();

        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        //g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
        setOpaque(false);

        super.paint(g);
    }

    public String getNombreImg() {
        return nombreImg;
    }

    public void setNombreImg(String nombreImg) {
        this.nombreImg = nombreImg;
    }

}
