import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class Fenetre extends JPanel implements Runnable {
    public Thread jeu = new Thread(this);

    public static boolean debut = true;
    public static Image[] setHerbe = new Image[100];
    public static Image[] setChemin = new Image[100];
    public static int Largeur, Longeur;

    public static niveau niveau;
    public Fenetre() {
        jeu.start();
    }

    public void define() {

        niveau = new niveau();
        for (int i=0;i<setHerbe.length;i++) {
            setHerbe[i] = new ImageIcon("img/herbe.png").getImage();
            setHerbe[i] = createImage(new FilteredImageSource(setHerbe[i].getSource(), new CropImageFilter(0,40*i, 40, 40)));
        }
        for (int i=0;i<setChemin.length;i++) {
            setChemin[i] = new ImageIcon("img/chemin.png").getImage();
            setChemin[i] = createImage(new FilteredImageSource(setChemin[i].getSource(), new CropImageFilter(0,40*i, 40, 40)));
        }
    }

    public void paintComponent(Graphics g) {
        if(debut = true) {
            Largeur = getWidth();
            Longeur = getHeight();
            define();
            debut = false;
        }
        g.clearRect(0,0, getWidth(), getHeight());
        niveau.draw(g); //dessine le niveau
    }

    @Override
    public void run() {
        while(true) {
            if(debut != true ) {
                niveau.physique();
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
