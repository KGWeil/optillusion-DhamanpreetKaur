
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Übung2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Übung2 extends PApplet
{       
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
        schwarzeQuadrate();
    }

    public void schwarzeQuadrate(){
        strokeWeight(0);
        stroke(255);
        fill(0);
        
        for(int k=0;k<6;k++){
            for(int i=0;i<8;i++){
                rect(40+i*40*2,40*k+k*50,40,50);
            }
        }
    }
    
    public void blaueQuadrate(){
        color(0, 0, 255);
        for(int k=0;k<6;k++){
            for(int i=0;i<8;i++){
                rect(40+i*40*2,40*k+k*40,40,40);
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
     *a
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Übung2.class.getName() });
    }
}