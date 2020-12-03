
import processing.core.PApplet;
import processing.core.PFont;


/**
 * Klasse Hermanngitter1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter1 extends PApplet
{       
    int s=50;
    
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        strokeWeight(1);
        stroke(0);
        fill(0);
        // quadrate();
        zeichneAlleQuadrate();
    }

    public void quadrate(){
            for(int i=0;i<8;i++){
            rect(5+i*(s+10),5,s,s);
        }
    }
    
    public void zeichneAlleQuadrate(){
        for(int k=0;k<8;k++){
            for(int i=0;i<8;i++){
                rect(5+i*(s+10),5+k*(s+10),s,s);
            }
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
        PApplet.main(new String[] {Hermanngitter1.class.getName() });
    }

}
