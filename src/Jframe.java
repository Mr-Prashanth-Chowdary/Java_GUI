import javax.swing.*;
import java.awt.*;

public class Jframe extends JFrame {

    Jframe(){
        this.setVisible(true);
        this.setTitle("File Organizer Helper");
        this.setSize(500,200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("icon.png");
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(255,255,255));
    }
}
