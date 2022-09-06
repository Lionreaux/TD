import javax.swing.*;
import java.awt.*;


public class cadre extends JFrame {
    public static String titre = "Le TD de Thibault jamais fini.";
    public static Dimension taille = new Dimension(1280, 720);
    public cadre() {
        setTitle(titre);
        setSize(taille);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);


        init();
    }

    public static void main(String args[]) {
        cadre Cadre = new cadre();
    }

    public void init() {
        setLayout(new GridLayout(1,2));
        Fenetre fenetre = new Fenetre();
        add(fenetre);



        setVisible(true);
    }

}
