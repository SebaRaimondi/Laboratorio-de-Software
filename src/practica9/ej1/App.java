package practica9.ej1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class App {
    private JPanel mainPanel;
    private JLabel imgLabel;

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("App");
        App app =  new App();
        frame.setContentPane(app.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        while (true) {
            TimeUnit.SECONDS.sleep(1);
            app.imgLabel.setVisible(!app.imgLabel.isVisible());
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        BufferedImage myPicture = null;

        try {
            myPicture = ImageIO.read(new File("Anor_Londo.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        imgLabel = new JLabel(new ImageIcon(myPicture));
    }
}
