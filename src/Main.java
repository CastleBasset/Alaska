import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        JFrame mainWindow = new JFrame("soobakaaaaa");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(900,900);

//        JPanel pesPanel = new JPanel();
//        pesPanel.setBackground(Color.ORANGE);
//        mainWindow.add(pesPanel);
//        pesPanel.setPreferredSize(new Dimension(100,100));
//        mainWindow.add(pesPanel);
        mainWindow.setVisible(true);
        GamePanel cotPanel = new GamePanel(Color.black, new Dimension(1100, 600));
        mainWindow.add(cotPanel);

    }
}