
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Übung1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Übung1 extends PApplet
{  
    int[] abstaende={0,25,0,25,0,25,0,25};
    int s=25;
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
        background(195);
        fill(175,100,220);
        stroke(175, 100, 220);
        viereck();
        zeichneallevierecke();

    }
    
    public void viereck(){
        quad(0,0,25,10,25,35,0,25);
        for (int i=0; i<8; i++){
            quad(i*50,0,25+i*50,10,25+i*50,35,i*50,25);
        }
        for (int i=0; i<8; i++){
           stroke(0);
           fill(0);
           quad(25+i*50,10,50+i*50,0,50+i*50,25,25+i*50,35);
        }
    }
    public void zeichneallevierecke(){
        for (int k=0; k<8; k++){
            for(int i=0; i<8; i++){
                
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
        PApplet.main(new String[] {Übung1.class.getName() });
    }

}
