package projetolp2.hotelriviera;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;

class ImagePanel extends JComponent {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image image;
    public ImagePanel(Image image) {
        this.image = image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 50, 50, this);
    }
}