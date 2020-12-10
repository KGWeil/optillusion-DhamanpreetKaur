
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Welle1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Welle1 extends PApplet
{       
    int s=100;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(400,400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneQuadrat(10,10,0, true);
        alleQuadrate();
        parallelen();
    }

    /**
     * Zeichnet ein Quadrat der optischen Illusion
     * @param    x    x-Koordinate
     * @param    y    y-Koordinate
     * @param    farbe    Füllfarbe des Quadrats
     * @param    links     Falls links true ist: Kreise links; falls links false ist: Kreise rechts
     */
    public void zeichneQuadrat( int x, int y, int farbe, boolean links )
    {
        fill(farbe);
        rect(x,y,s,s);

        if (farbe==0){ 
            fill(255);
        }else{
            fill(0);
        }
        if(links){
            circle(x+s-s/6,y+s/6,s/6);
            circle(x+s-s/6,y+s-s/6,s/6);
        }else{
            circle(x+(1.f/6)*s,y+s-(1.f/6)*s,((1.f/6)*s));
            circle(x+s/6,y+s/6,s/6);
        }
    }

    public void alleQuadrate(){
        int aktuellefarbe=0;
        boolean aktuelleseite=true; 
        for(int k=0;k<4;k++){
            for(int i=0;i<4;i++){
                zeichneQuadrat(10+i*s,10+k*s,aktuellefarbe,aktuelleseite);
                if (aktuellefarbe==0){
                    aktuellefarbe=255;
                }else{
                    aktuellefarbe=0;

                }
            }
            if (aktuellefarbe==0){
                aktuellefarbe=255;
            }else{
                aktuellefarbe=0;
            }
            if (aktuelleseite==true){
                aktuelleseite=false;
            }else{
                aktuelleseite=true;
            }
        }

    }

    public void parallelen(){
        strokeWeight(5);
        stroke(8, 250, 78);
        for(int i=0;i<5;i++){
            line(10,10+i*s,400,10+i*s); 
        }
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Welle1.class.getName() });
    }

}
