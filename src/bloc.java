import java.awt.*;

public class bloc extends Rectangle {
    public int idG;
    public int idA;

    public bloc(int x, int y, int largeur, int longeur, int idG, int idA) {
        setBounds(x,y,largeur,longeur);
        this.idG= idG;
        this.idA= idA;
    }
    public void draw(Graphics g) {
        //g.drawRect(x,y,width,height);
        g.drawImage(Fenetre.setHerbe[idG], x, y, width, height, null );


        if(idA != valeurs.chemin) {

        }
    }
}
