import basis.*;

public class Slider {
    private Ball ball;
    private Maus mouse;
    private Stift pen;
    private Leinwand canvas;
    private int x, y;
    private int radius;

    public Slider(Leinwand canv) {
        ball = null;
        this.canvas = canv;
        mouse = new Maus(canvas);
        pen = new Stift(canvas);
        x = canvas.breite()-20; 
        y = mouse.vPosition();
        
        radius = 10;
        
        //this.show();
    } //Schieber
    
    public void init(Ball b) {
        ball = b;
    } //lerneBallKennen

    public double getY() {
        return 2.0;
    } //yPos

    public double getX() {
        return 2.0;
    } //xPos

    public void move () {
        //ball.bounce();
        return;
        //if (maus.vPosition()==y) {
        //    return;
        //}
        
    } //bewege


}
