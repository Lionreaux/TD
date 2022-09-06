import java.awt.*;

public class niveau {
    public int LargMonde = 9;
    public int LongMonde = 7;
    public int TailleBloc = 80;

    public bloc[][] bloc;
    public niveau() {
        define();
    }
    public void define() {
        bloc = new bloc[LongMonde][LargMonde];
        for(int y=0;y<bloc.length; y++) {
            for(int x=0;x<bloc[0].length;x++) {
                bloc[y][x] = new bloc((Fenetre.Largeur/2) - ((LargMonde*TailleBloc)/2) + x * TailleBloc, y * TailleBloc, TailleBloc, TailleBloc, valeurs.herbe, valeurs.chemin );
            }
        }
    }
    public void draw(Graphics g) {
        for(int y=0;y<bloc.length; y++) {
            for(int x=0;x<bloc[0].length;x++) {
                bloc[y][x].draw(g);
            }
        }
    }
    public void physique() {

    }
}
