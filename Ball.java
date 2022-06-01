import basis.*;
import java.awt.Color;

public class Ball {
    private Stift pen;
    private Leinwand canvas;
    private int radius;
    private double dX,dY; // Bewegung in x- bzw. y-Richtung
    private double x,y;   //Position
    private Color farbe;
    
    public Ball(Leinwand canv) {
        //hier wird die lw aus der Klasse Spiel3 an das Objekt leinwand aus dieser Klasse übergeben
        this.canvas = canv;
        pen = new Stift(canv);  
        x = 50;
        y = 50;
        radius = 10;
        dX = 0.2;
        dY = 0.3;
        pen.bewegeBis(x,y);
        pen.wechsle(); //bedeutet, dass der Stift zwischen radiere() und normal() hin und herwechselt.
        pen.zeichneKreis(radius);
        farbe = Farbe.rgb(0, 255, 0);
    } //Ball
    
    
    public boolean didLose() {
        //soll <true> liefern, wenn der Ball rechts aus der Leinwand herauskommt.
        return false;
    } //verloren

    public void bounce() {
        if (getX() < 10 || getX() > 550) {
            dX = dX*(-1);
        }
        
        if (getY() < 10 || getY() > 380) {
            dY = dY*(-1);
        }
    } //abprallen

    public double getX() {
        return pen.hPosition();
    } //xPos
    
    public double getY() {
        return pen.vPosition();
    } //yPos

    public void hide() {
       pen.setzeFuellMuster(Muster.GEFUELLT);
       pen.setzeFarbe(Farbe.rgb(0, 100, 0));
       pen.kreis(getX(), getY(), radius);
    }
    
    public void show() {
        pen.normal();
        pen.setzeFuellMuster(Muster.GEFUELLT);
        pen.setzeFarbe(farbe);
        pen.kreis(getX(), getY(), radius);
    }
   
    public void move() {      
        //Bewegung bedeutet, dass ein Ball seine Position ändert.
        hide();
        bounce();
        pen.bewegeAuf(getX()+dX, getY()+dY);
        //pen.kreis(x+dX, y+dY, radius);
        show();
        //if () {
                    
        //}
        //if (){
            
        //}

    } //bewege
}
