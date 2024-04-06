import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel
{
    GamePanel()
    {
        setBackground(Color.black);
        setPreferredSize(new Dimension(100,100));
    }
    GamePanel(Color color,Dimension dimension)
    {
        setBackground(color);
        setPreferredSize(dimension);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getPreferredSize().width/2;
        int y = getPreferredSize().height/2;
        int width = 110;
        int height = 110;
        g.setColor(Color.black);
        g.setColor(Color.black);
        g.fillRect(x, y, width, height);
    }
}
