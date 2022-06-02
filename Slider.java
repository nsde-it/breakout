import basis.*;
import java.awt.Color;

public class Slider {
    private Ball ball;
    private Maus mouse;
    private Stift pen;
    private Leinwand canvas;
    private int x, y;
    private int dY;
    private Color farbe;

    public Slider(Leinwand canv) {
        ball = null;
        this.canvas = canv;
        mouse = new Maus(canvas);
        pen = new Stift(canvas);
        x = canvas.breite()-20; 
        y = mouse.vPosition();
        dY = -1;
        
        farbe = Farbe.rgb(0, 255, 0);
        //this.show();
    } //Schieber
    
    public void init(Ball b) {
        ball = b;
    } //lerneBallKennen

    public void bounce() {
        if (getY() > 400 || getY() < -1) {
            dY = -dY;
        }        
    }
    
    public double getX() {
        return pen.hPosition();
    } //xPos
    
    public double getY() {
        return pen.vPosition();
    } //yPos
    
    public void hide() {
       pen.setzeFuellMuster(Muster.GEFUELLT);
       pen.setzeFarbe(Farbe.rgb(0, 100, 0));
       pen.rechteck(540, getY(), 20, 60);
    }
    
    public void show() {
        pen.normal();
        pen.setzeFuellMuster(Muster.GEFUELLT);
        pen.setzeFarbe(farbe);
        pen.rechteck(540, getY(), 20, 60);
    }
  
    public void move () {
        //ball.bounce()
        hide();
        pen.bewegeAuf(getX(), mouse.vPosition()); 
        show();
        //if (maus.vPosition()==y) {
        //    return;
        //}
        
    } //bewege


}
