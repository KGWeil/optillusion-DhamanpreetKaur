
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    int s=40;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
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

        strokeWeight(0);
        stroke(0);
        fill(0);
        zeichneQuadrate();
        zeichneAlleQuadrate();
        strokeWeight(2);
        stroke(150);
        parallelen();//graue Parallelen

    }

    /**
     * Methode parallelen
     * zeichne 10 Parallelen
     */
    public void parallelen(){
        for(int i=0;i<10;i++){
            line(0,i*40,640,i*40); 
        }
    }

    /**
     * Methode zeichneQuadrate
     * zeichne 8 Quadrate
     */
    public void zeichneQuadrate(){
        for(int i=0;i<8;i++){
            rect(10+i*80,0,40,40);
        }
    }

    public void zeichneAlleQuadrate(){
        for(int k=0; k<10; k++){
            for(int i=0;i<8;i++){
                rect(10+i*s*2,5+k*s,s,s);
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
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
