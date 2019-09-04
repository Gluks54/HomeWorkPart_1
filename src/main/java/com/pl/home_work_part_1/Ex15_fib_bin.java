package HomeWork;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Ex15_fib_bin {


    public  void draw(ArrayList<String> args) throws IOException {

        BufferedImage bufferedImage = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 800, 800);

        int x = 0;
        int y = 0;
        //каждый Стрнинг разьиваем в таблицу чаров 1 печатаем писель 0 неичего не делаем
        for(String g:args){
        y++;
        x = 0;
        char [] charbin = g.toCharArray();

        for (Character i: charbin) {
            int c = Character.getNumericValue(i);
            x++;
            if (c == 1) {
                g2d.setColor(Color.black);
                g2d.fillRect(x, y, 1, 1);
            }
        }

        }

        // Disposes of this graphics context and releases any system resources that it is using.
        g2d.dispose();
        // Save as PNG
        File file = new File("myimage2.png");
        ImageIO.write(bufferedImage, "png", file);
    }
}
