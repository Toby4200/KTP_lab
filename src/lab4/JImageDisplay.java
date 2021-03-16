package lab4;


import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

class JImageDisplay extends JComponent
{
    private BufferedImage bImage;

    /**
     * Создаем изображение
     */
    public JImageDisplay(int width, int height) {
        bImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Dimension imageDimension = new Dimension(width, height);
        super.setPreferredSize(imageDimension);
    }

    /**
     * Имплементация функции paintComponent из родительского класса
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(bImage, 0, 0, bImage.getWidth(), bImage.getHeight(), null);
    }

    /**
     * Сбрасывает все пиксели с помощью пустого массива
     */
    public void clearImage() {
        int[] emptyArr = new int[getWidth() * getHeight()];

        bImage.setRGB(0, 0, getWidth(), getHeight(), emptyArr, 0, 1);
    }

    /**
     * Выставляет пиксель в указанный цвет
     */
    public void drawPixel(int x, int y, int rgbColor) {
        bImage.setRGB(x, y, rgbColor);
    }
}